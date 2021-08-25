import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureSporadicEventTriggering extends TimeMeasureConstraint{
    int lower, upper, jitter;
    
    public TimeMeasureSporadicEventTriggering(int jitter, int maxInterArrivalTime, int period){
        this.lower = period;
        this.upper = maxInterArrivalTime;
        this.jitter = jitter;
    }
    
    public TraceSet generateTrace(int eventCount){
        Random rand = new Random();
        //Trace generieren
        RepetitionConstraintGenerator trace = new RepetitionConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, lower, upper, 1, jitter)){
            trace = new RepetitionConstraintGenerator();
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");

            fileWriter.write("def constraint := AUTOSAR_TIMEX.sporadicEventTriggering(event, " + jitter + ", "+ upper + ", 1, " + lower + ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}