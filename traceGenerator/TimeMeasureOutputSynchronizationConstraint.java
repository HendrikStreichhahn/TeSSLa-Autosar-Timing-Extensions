import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureOutputSynchronizationConstraint extends TimeMeasureConstraint{
    int streamCount, clusterDistance, tolerance;
    static final String PATHTOOUTPUTSYNCH = "../../main/t2uOutputSynchronizationConstraint.tessla";
    
    public TimeMeasureOutputSynchronizationConstraint(int streamCount, int clusterDistance, int tolerance){
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
        result+= "include \"" + PATHTOOUTPUTSYNCH + "\"\n";
        result+= "in stimulus: Events[Int]\n";
        result+= "in endOfStreams: Events[Int]\n";
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
        if (i == 1)
            return "if (defaultTime(response"+i+") >= timeNow) then merge(Map_add(Map_empty[Int, Int], "+i+", response"+i+"), Map_empty[Int, Int]) else Map_empty[Int, Int],";
        else
            return "Map_attachIntIntLifted(" + writeEventsNow(i-1) + "if (defaultTime(response"+i+") >= timeNow) then merge(Map_add(Map_empty[Int, Int], "+i+", response"+i+"), Map_empty[Int, Int]) else Map_empty[Int, Int]),";
    }
    
    private String writeEventsNow(){
        return "Map_attachIntIntLifted(" + writeEventsNow(streamCount) + "if (defaultTime(stimulus) >= timeNow) then merge(Map_add(Map_empty[Int, Int], "+0+", stimulus), Map_empty[Int, Int]) else Map_empty[Int, Int])";
    }
    
    
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(writeInput());
            fileWriter.write("def timeNow = " + writeTimeNow(streamCount)+ "\n");
            fileWriter.write("def eventsNow = " + writeEventsNow()+ "\n");

            //output
            fileWriter.write("def constraint :=  outputSynchronizationConstraint(eventsNow, " + streamCount +" ," + tolerance + ", endOfStreams)\n");    
            fileWriter.write("out constraint");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }                                      
        return true;
    }
}
