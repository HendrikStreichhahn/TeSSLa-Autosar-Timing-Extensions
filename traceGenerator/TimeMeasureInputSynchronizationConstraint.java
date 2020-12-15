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
    
  /*  public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOINPUTSYNCH + "\"\n");
            fileWriter.write("in response: Events[Int]\n");
            fileWriter.write("in endOfStreams: Events[Int]\n");
            for (int i = 1; i <= streamCount; i++)
                fileWriter.write("in stimulus" + i + ": Events[Int]\n");
            fileWriter.write("def constraint := inputSynchronizationConstraint" + streamCount +
                "( ");
            for (int i = 1; i <= streamCount; i++)
                fileWriter.write("stimulus"+i+", ");
            fileWriter.write("response, " + tolerance+ ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }*/
    
    private String writeInput(){
        String result = "";
        result+= "include \"" + PATHTOINPUTSYNCH + "\"\n";
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
        if (i == 1)
            return "if (defaultTime(stimulus"+i+") >= timeNow) then merge(Map.add(Map.empty[Int, Int], "+i+", stimulus"+i+"), Map.empty[Int, Int]) else Map.empty[Int, Int],";
        else
            return "Map_attachIntIntLifted(" + writeEventsNow(i-1) + "if (defaultTime(stimulus"+i+") >= timeNow) then merge(Map.add(Map.empty[Int, Int], "+i+", stimulus"+i+"), Map.empty[Int, Int]) else Map.empty[Int, Int]),";
    }
    
    private String writeEventsNow(){
        return "Map_attachIntIntLifted(" + writeEventsNow(streamCount) + "if (defaultTime(response) >= timeNow) then merge(Map.add(Map.empty[Int, Int], "+0+", response), Map.empty[Int, Int]) else Map.empty[Int, Int])";
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(writeInput());
            fileWriter.write("def timeNow = " + writeTimeNow(streamCount)+ "\n");
            fileWriter.write("def eventsNow = " + writeEventsNow()+ "\n");

            //output
            fileWriter.write("def constraint :=  inputSynchronizationConstraint(eventsNow, " + streamCount +" ," + tolerance + ")\n");    
            fileWriter.write("out constraint");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }                                      
        return true;
    }
}
