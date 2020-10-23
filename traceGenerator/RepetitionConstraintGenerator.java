import java.util.Random;

public class RepetitionConstraintGenerator extends TraceSet{
	public RepetitionConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public void generateTestTrace(int eventCount, int lower, int upper, int span, int jitter){
        // generate x events
        RepeatConstraintGenerator xTimestamps = new RepeatConstraintGenerator();
		xTimestamps.generateTestTrace(eventCount, lower, upper, span);
        //generate actual events
        Random rand = new Random();
        Trace xTrace = xTimestamps.getTraces()[0];
        xTrace.initOutput();
        while(xTrace.getNextEvent() != null){
            int currentX = xTrace.popNextEvent().getTimeStamp();
            int i = 10;
            boolean inserted = false;
            while(i > 0 && !inserted) {
                inserted = traces[0].insertEvent(
                new Event(currentX + rand.nextInt(jitter+1), 0));
                i--;
            }
            if (!inserted)
                System.out.println("Tried to insert multiple events in one timestamp" +
                    " in one stream! Trace might be invalid!");
        }
	}
}