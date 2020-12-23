import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.UnsupportedOperationException;

public class TimeMeasureExecutionTimeConstraint extends TimeMeasureConstraint{
    int lower, upper, span;
    
    public TimeMeasureExecutionTimeConstraint(int lower, int upper){
        this.lower = lower;
        this.upper = upper;
    }
    
    public TraceSet generateTrace(int eventCount){
        throw new UnsupportedOperationException();
    }
    
    public TraceSet generateTrace(int eventCount, int minDistance, int maxDistance,
            int maxPreemptions, int maxPreemptionTime){
        Random rand = new Random();
        //Trace generieren
        ExecutionTimeConstraintGenerator trace = new ExecutionTimeConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, lower, upper, minDistance, maxDistance,
                maxPreemptions, maxPreemptionTime)){
            trace = new ExecutionTimeConstraintGenerator();
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
            fileWriter.write("in start: Events[Int]\n");
            fileWriter.write("in preempt: Events[Int]\n");
            fileWriter.write("in resume: Events[Int]\n");
            fileWriter.write("in stop: Events[Int]\n");
            fileWriter.write("def constraint := executionTimeConstraint(start, stop, preempt, resume, " +
                lower + ", " + upper + ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
