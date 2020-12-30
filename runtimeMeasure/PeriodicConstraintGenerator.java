import java.util.Random;

public class PeriodicConstraintGenerator extends TraceSet{
    
    public PeriodicConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
        traces[0] = new Trace("event");
	}
    
    public Trace[] getTraces(){
        return traces;
    }

	public boolean generateTestTrace(int eventCount, int period, int jitter){
        Random rand = new Random();
		int timeNow = rand.nextInt(period)+1;
        boolean allInserted = true;
        while (eventCount > 0) {
            //source event
            timeNow+= period;
            allInserted &= traces[0].insertEvent(new Event(timeNow + rand.nextInt(jitter+1), 0));
            eventCount--;
        }
        return allInserted;
	}
}
