import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureStrongSynchronizationConstraint extends TimeMeasureConstraint{
    static final String PATHTOSTRONGSYNCHRONIZATIONCONSTRAINT 
        = "../../main/t2uStrongSynchronizationConstraint.tessla";
    
    private int tolerance;
    private int streamCount;
    private int minClusterDistance;
    private int maxClusterDistance;
    
    
    public TimeMeasureStrongSynchronizationConstraint(int tolerance, int streamCount,
            int minClusterDistance, int maxClusterDistance){
        this.tolerance = tolerance;
        this.streamCount = streamCount;
        this.minClusterDistance = minClusterDistance;
        this.maxClusterDistance = maxClusterDistance;
    }
    
    public TraceSet generateTrace(int eventCount){
        
        Random rand = new Random();
        //Trace generieren
        SynchronizationConstraintGenerator trace = new SynchronizationConstraintGenerator(streamCount);
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, tolerance, 1,
                minClusterDistance, maxClusterDistance)){
            trace = new SynchronizationConstraintGenerator(streamCount);
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOSTRONGSYNCHRONIZATIONCONSTRAINT + "\"\n");
            
            for (int i = 0; i < streamCount; i++)
                fileWriter.write("in event" + i + ": Events[Int]\n");
            fileWriter.write("def tolerance =" + tolerance + "\n");
            
            fileWriter.write("def constraint := StrongSynchronizationConstraint"+ streamCount + "(");
            for (int i = 0; i < streamCount; i++)
                fileWriter.write("event" + i + ", ");
            fileWriter.write("tolerance)\n");

            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}