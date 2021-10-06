import java.util.Random;

public class RepetitionConstraintGenerator extends TraceSet{
	public RepetitionConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public boolean generateTestTrace(int eventCount, int lower, int upper, int span, int jitter){
		// generate x events
		//System.out.println("RepetitionConstraintGenerator generateTestTrace(eventCount=" + eventCount + ", lower=" + lower + ", upper= " + upper + ", span=" + span + ", jitter=" + jitter + ")");
		RepeatConstraintGenerator xTimestamps = new RepeatConstraintGenerator();
		xTimestamps.generateTestTrace(eventCount, lower, upper, span);
		//generate actual events
		Random rand = new Random();
		Trace xTrace = xTimestamps.getTraces()[0];
		xTrace.initOutput();
		var xTimeStamp = xTrace.getNextEvent();
		while(xTimeStamp != null){
			int currentX = xTimeStamp.getTimeStamp()+1;
			int i = 25;
			boolean inserted = false;
			while(i > 0 && !inserted) {
				int timeStamp = currentX + rand.nextInt(jitter+1);
				if (timeStamp == 0)
					System.out.println("RepetitionConstraint Event at 0");
				inserted = traces[0].insertEvent(new Event(timeStamp, 0, traces[0]));
				//if (inserted)
				//	System.out.println("RepetitionConstraintGenerator event at " + timeStamp);
				i--;
			}
			if (!inserted){
				System.out.println("Tried to insert multiple events in one timestamp" +
					" in one stream! Trace might be invalid!");
				return false;
			}
			xTimeStamp = xTrace.getNextEvent();
		}
		return true;
	}
}