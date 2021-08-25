import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureConcretePatternEventTriggering extends TimeMeasureConstraint{
    int period, jitter;
    int[] offsets;
    
    public TimeMeasureConcretePatternEventTriggering(int period, int[] offsets, int jitter){
        this.period = period;
        this.jitter = jitter;
        this.offsets = offsets;
    }
    
    public TraceSet generateTrace(int eventCount){
        Random rand = new Random();
        //Trace generieren
        ConcretePatternEventTriggeringGenerator trace = new ConcretePatternEventTriggeringGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, period, offsets, jitter)){
            trace = new ConcretePatternEventTriggeringGenerator();
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        int[] mapKeys = new int[offsets.length];
        for (int i = 0; i < mapKeys.length; i++)
            mapKeys[i] = i;
        String offsetString = generateTesslaIntMap(mapKeys, offsets);
        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := AUTOSAR_TIMEX.ConcretePatternEventTriggering(event, 0, " + offsetString + 
                ", " + period + ", " + jitter + ")\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    

}