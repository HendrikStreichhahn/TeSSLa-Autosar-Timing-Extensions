import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureRepeatConstraint extends TimeMeasureConstraint{
    int lower, upper, span;
    
    public TimeMeasureRepeatConstraint(int lower, int upper, int span){
        this.lower = lower;
        this.upper = upper;
        this.span = span;
    }
    
    public TraceSet generateTrace(int eventCount){
        Random rand = new Random();
        //Trace generieren
        RepeatConstraintGenerator trace = new RepeatConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, lower, upper, span)){
            trace = new RepeatConstraintGenerator();
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := repeatConstraint(event, " + lower + ", " +
                upper + ", " + span + ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}