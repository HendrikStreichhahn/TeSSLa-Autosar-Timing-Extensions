import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.UnsupportedOperationException;

public class TimeMeasureARExecutionTimeConstraintNet extends TimeMeasureExecutionTimeConstraint{
    
    public TimeMeasureARExecutionTimeConstraintNet(int low, int up){
        super(low, up);
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
            fileWriter.write("in start: Events[Int]\n");
            fileWriter.write("in preempt: Events[Int]\n");
            fileWriter.write("in resume: Events[Int]\n");
            fileWriter.write("in stop: Events[Int]\n");
            fileWriter.write("def constraint := AUTOSAR_TIMEX.ExecutionTimeConstraintNet(start, stop, preempt, resume, " +
                upper + ", " + lower + ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
