import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureARAgeConstraint extends TimeMeasureConstraint{
    int minimum, maximum, minDist, maxDist;
    
    public TimeMeasureARAgeConstraint(int minimum, int maximum, int minDist, int maxDist){
        this.minimum = minimum;
        this.maximum = maximum;
        this.minDist = minDist;
        this.maxDist = maxDist;
    }
    
    public TraceSet generateTrace(int eventCount){
        //Trace generieren
        ARAgeConstraintGenerator trace = new ARAgeConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, minimum, maximum, minDist, maxDist)){
            trace = new ARAgeConstraintGenerator();
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := AUTOSAR_TIMEX.AgeConstraint(event, " + maximum + ", " + minimum + ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}