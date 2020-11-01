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
    
    public boolean generateTeSSLaFile(String fileName){
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
    }
}