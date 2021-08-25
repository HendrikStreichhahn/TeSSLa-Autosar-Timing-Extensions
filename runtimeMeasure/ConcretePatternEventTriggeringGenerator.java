import java.util.Random;

public class ConcretePatternEventTriggeringGenerator extends TraceSet{
	public ConcretePatternEventTriggeringGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public boolean generateTestTrace(int eventCount, int period, int offset[], int jitter){
        // generate x events
        PeriodicConstraintGenerator xTimestamps = new PeriodicConstraintGenerator();
		xTimestamps.generateTestTrace(eventCount/offset.length, period, jitter);
        //generate actual events
        Random rand = new Random();
        Trace xTrace = xTimestamps.getTraces()[0];
        xTrace.initOutput();
        
        boolean inserted;
        while(xTrace.getNextEvent() != null){
            int currentX = xTrace.popNextEvent().getTimeStamp();
            for (int i = 0; i < offset.length; i++){
                inserted = traces[0].insertEvent(new Event(currentX + offset[i], 0));
                if (!inserted)
                    return false;
            }
        }
        return true;
	}
}