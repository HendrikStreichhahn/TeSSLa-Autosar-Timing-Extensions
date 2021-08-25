import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasurePeriodicEventTriggering extends TimeMeasureConstraint{
    int period, jitter, minDist;
    
    public TimeMeasurePeriodicEventTriggering(int period, int jitter, int minDist){
        this.period = period;
        this.jitter = jitter;
        this.minDist = minDist;
        if (minDist > period)
            throw new IllegalArgumentException("Minimal Distance must be smaller then period.");
    }
    
    public TraceSet generateTrace(int eventCount){
        //Trace generieren
        PeriodicConstraintGenerator trace = new PeriodicConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, period, jitter)){
            trace = new PeriodicConstraintGenerator();
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := AUTOSAR_TIMEX.PeriodicEventTriggering(event, " + period + ", " + jitter + ", " + minDist +")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}