import java.util.Random;

public class ARAgeConstraintGenerator extends TraceSet{
	public ARAgeConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public boolean generateTestTrace(int eventCount, int minimum, int maximum, int distMin, int distMax){
		Random rand = new Random();

		int diffMinMax = maximum - minimum;

		int timeNow= maximum + rand.nextInt(diffMinMax);

		while(eventCount > 0){

			boolean inserted = false;

			while(!inserted) {
				inserted = traces[0].insertEvent(new Event(timeNow, timeNow - (minimum + rand.nextInt(diffMinMax)), traces[0]));
			}
			timeNow += distMin + rand.nextInt(distMax - distMin);
			eventCount--;
		}
		return true;

	}
}