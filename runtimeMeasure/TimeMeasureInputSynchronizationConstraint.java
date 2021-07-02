import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureInputSynchronizationConstraint extends TimeMeasureConstraint{
    int streamCount, clusterDistance, tolerance;
    static final String PATHTOINPUTSYNCH = "../../main/t2uInputSynchronizationConstraint.tessla";
    
    public TimeMeasureInputSynchronizationConstraint(int streamCount, int clusterDistance, int tolerance){
        this.streamCount = streamCount;
        this.clusterDistance = clusterDistance;
        this.tolerance = tolerance;
    }
    
    public TraceSet generateTrace(int eventCount){
        //Trace generieren
        InputSynchronizationConstraintGenerator trace = 
            new InputSynchronizationConstraintGenerator(streamCount);
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, tolerance, clusterDistance)){
            trace = new InputSynchronizationConstraintGenerator(streamCount);
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    private String writeInput(){
        String result = "";
        result+= "include \"" + PATHTOMAIN + "\"\n";
        result+= "in response: Events[Int]\n";
        result+= "in endOfStreams: Events[Int]\n";
        for (int i = 1; i <= streamCount; i++)
            result+= "in stimulus" + i + ": Events[Int]\n";
        return result;
    }
    
    private String writeTimeNow(int i){
        if (i == 0)
            return "time(response)";
        else
            return "merge(time(stimulus" + i + ")," + writeTimeNow(i-1) + ")";
    }
    
    private String writeEventsNow(int i){
        if (i == 0)
            return "def eventResponse:= if (TADL2.defaultTime(response)  >= timeNow) then Map.add(Map.empty[Int, Int], 0, default(response, -1)) else Map.empty[Int, Int]";
        if (i == 1)
            return writeEventsNow(i-1)+ "\n" +
                "def eventStimulus1:= if (TADL2.defaultTime(stimulus1)  >= timeNow) then Map.add(eventResponse, 1, default(stimulus1, -1)) else eventResponse";
        else
            return writeEventsNow(i-1) + "\n" +
                "def eventStimulus"+i+":= if (TADL2.defaultTime(stimulus"+i+")  >= timeNow) then Map.add(eventStimulus"+(i-1)+", "+i+", default(stimulus"+i+", -1)) else eventStimulus"+(i-1);
    }
    
    private String writeEventsNow(){
        return writeEventsNow(streamCount) + "\ndef eventsNow:= eventStimulus" + streamCount;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(writeInput());
            fileWriter.write("def timeNow = " + writeTimeNow(streamCount)+ "\n");
            fileWriter.write(writeEventsNow()+ "\n");

            //output
            fileWriter.write("def constraint :=  TADL2.inputSynchronizationConstraintReset(eventsNow, " + streamCount +" ," + tolerance + ", TADL2.pseudoInfty)\n");
            fileWriter.write("out constraint");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }                                      
        return true;
    }
}
