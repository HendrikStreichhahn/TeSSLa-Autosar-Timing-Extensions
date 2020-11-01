import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureBurstConstraint extends TimeMeasureConstraint{
    int length, maxOccurrences;
    
    public TimeMeasureBurstConstraint(int length, int maxOccurrences){
        this.length = length;
        this.maxOccurrences = maxOccurrences;
    }
    
    public TraceSet generateTrace(int eventCount){
        Random rand = new Random();
        //Trace generieren
        BurstConstraintGenerator trace = new BurstConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, length, maxOccurrences)){
            trace = new BurstConstraintGenerator();
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := burstConstraint(event, " + length + ", "
                + maxOccurrences + ", 1)\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}