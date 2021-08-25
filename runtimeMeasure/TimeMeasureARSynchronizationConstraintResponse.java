import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureARSynchronizationConstraintResponse extends TimeMeasureConstraint{
    int streamCount, clusterDistance, tolerance;
    
    public TimeMeasureARSynchronizationConstraintResponse(int streamCount, int clusterDistance, int tolerance){
        this.streamCount = streamCount;
        this.clusterDistance = clusterDistance;
        this.tolerance = tolerance;
    }
    
    public TraceSet generateTrace(int eventCount){
        Random rand = new Random();
        //Trace generieren
        OutputSynchronizationConstraintGenerator trace = 
            new OutputSynchronizationConstraintGenerator(streamCount);
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, tolerance, clusterDistance)){
            trace = new OutputSynchronizationConstraintGenerator(streamCount);
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    private String writeInput(){
        String result = "";
        result+= "include \"" + PATHTOTIMEXMAIN + "\"\n";
        result+= "in stimulus: Events[Int]\n";
        for (int i = 1; i <= streamCount; i++)
            result+= "in response" + i + ": Events[Int]\n";
        return result;
    }
    
    private String writeTimeNow(int i){
        if (i == 0)
            return "time(stimulus)";
        else
            return "merge(time(response" + i + ")," + writeTimeNow(i-1) + ")";
    }
    
    private String writeEventsNow(int i){
        if (i == 0)
            return "def eventStimulus:= if (TADL2.defaultTime(stimulus)  >= timeNow) then Map.add(Map.empty[Int, Int], 0, default(stimulus, -1)) else Map.empty[Int, Int]";
        if (i == 1)
            return writeEventsNow(i-1)+ "\n" +
                "def eventResponse1:= if (TADL2.defaultTime(response1)  >= timeNow) then Map.add(eventStimulus, 1, default(response1, -1)) else eventStimulus";
        else
            return writeEventsNow(i-1) + "\n" +
                "def eventResponse"+i+":= if (TADL2.defaultTime(response"+i+")  >= timeNow) then Map.add(eventResponse"+(i-1)+", "+i+", default(response"+i+", -1)) else eventResponse"+(i-1);
    }
    
    private String writeEventsNow(){
        return writeEventsNow(streamCount) + "\ndef eventsNow:= eventResponse" + streamCount;
    }
    
    
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(writeInput());
            fileWriter.write("def timeNow = " + writeTimeNow(streamCount)+ "\n");
            fileWriter.write(writeEventsNow()+ "\n");

            //output
            fileWriter.write("def constraint :=  AUTOSAR_TIMEX.SynchronizationTimingConstraintResponseSynchronization(eventsNow, " + streamCount +" ," + tolerance + ", false)\n");    
            fileWriter.write("out constraint");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }                                      
        return true;
    }
}
