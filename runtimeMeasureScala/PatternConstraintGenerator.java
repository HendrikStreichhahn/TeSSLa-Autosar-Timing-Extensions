import java.util.Random;

public class PatternConstraintGenerator extends TraceSet{
	public PatternConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public boolean generateTestTrace(int eventCount, int period, int offset[], int jitter){
		//System.out.println("PatternConstraintGenerator generateTestTrace (" + eventCount + ", " + period + ", " + offset + ", " + jitter + ")");
		// generate x events
		PeriodicConstraintGenerator xTimestamps = new PeriodicConstraintGenerator();
		xTimestamps.generateTestTrace(eventCount/offset.length, period, 0);
		//generate actual events
		Random rand = new Random();
		Trace xTrace = xTimestamps.getTraces()[0];
		xTrace.initOutput();

		boolean inserted;
		Event nextEvent = xTrace.getNextEvent();
		
		while(nextEvent != null){
			int currentX = nextEvent.getTimeStamp();
			//System.out.println("patternConstraint currentX: " + (currentX));
			for (int i = 0; i < offset.length; i++){
				if (jitter != 0)
					inserted = traces[0].insertEvent(new Event(currentX + offset[i] + rand.nextInt(jitter+1), traces[0]));
				else
					inserted = traces[0].insertEvent(new Event(currentX + offset[i], traces[0]));
				
				//System.out.println("patternConstraint event at " + (currentX + offset[i]));
				
				if (!inserted)
					return false;
					//System.out.println("Tried to insert multiple events in one timestamp" +
					//	" in one stream! Trace might be invalid!");
			}
			nextEvent = xTrace.getNextEvent();
		}
		return true;
	}
}