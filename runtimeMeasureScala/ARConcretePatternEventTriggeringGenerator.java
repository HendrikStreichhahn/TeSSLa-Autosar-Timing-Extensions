import java.util.Random;

public class ARConcretePatternEventTriggeringGenerator extends TraceSet{
	public ARConcretePatternEventTriggeringGenerator(){
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
		Event currentEvent = xTrace.getNextEvent();
		while(currentEvent != null){
			int currentX = currentEvent.getTimeStamp();
			for (int i = 0; i < offset.length; i++){
				inserted = traces[0].insertEvent(new Event(currentX + offset[i], 0, traces[0]));
				if (!inserted)
					return false;
			}
			currentEvent = xTrace.getNextEvent();
		}
		return true;
	}
}