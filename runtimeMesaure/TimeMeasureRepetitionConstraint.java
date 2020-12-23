import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureRepetitionConstraint extends TimeMeasureConstraint{
    int lower, upper, span, jitter;
    
    public TimeMeasureRepetitionConstraint(int lower, int upper, int span, int jitter){
        this.lower = lower;
        this.upper = upper;
        this.span = span;
        this.jitter = jitter;
    }
    
    public TraceSet generateTrace(int eventCount){
        Random rand = new Random();
        //Trace generieren
        RepetitionConstraintGenerator trace = new RepetitionConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, lower, upper, span, jitter)){
            trace = new RepetitionConstraintGenerator();
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := repetitionConstraint(event, " + lower + ", " +
                upper + ", " + span + ", "+ jitter + ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}