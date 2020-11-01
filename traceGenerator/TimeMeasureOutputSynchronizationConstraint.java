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
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOOUTPUTSYNCH + "\"\n");
            fileWriter.write("in stimulus: Events[Int]\n");
            fileWriter.write("in endOfStreams: Events[Int]\n");
            for (int i = 1; i <= streamCount; i++)
                fileWriter.write("in response" + i + ": Events[Int]\n");
            fileWriter.write("def constraint := outputSynchronizationConstraint" + streamCount +
                "(stimulus, ");
            for (int i = 1; i <= streamCount; i++)
                fileWriter.write("response"+i+", ");
            fileWriter.write(tolerance + ", endOfStreams)\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}