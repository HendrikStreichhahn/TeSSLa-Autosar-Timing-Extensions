import java.util.Random;

public class StrongDelayConstraintGenerator extends TraceSet{
	public StrongDelayConstraintGenerator(){
		// init Traces
		traces = new Trace[2];
		traces[0] = new Trace("source");
		traces[1] = new Trace("target");
	}

	public void generateTestTrace(int sourceEventCount,  int minDistanceSource, int maxDistanceSource,
			int lower, int upper){
		int eventCount = 0;
		int timeNow = 0;
		Random rand = new Random();
		while (eventCount < sourceEventCount){
			// increase time
			timeNow+= minDistanceSource + rand.nextInt(maxDistanceSource - minDistanceSource+1)-1;
			
			// insert events
			boolean inserted = true;
			inserted&= traces[0].insertEvent(new Event(timeNow, 0));
			inserted&= traces[1].insertEvent(new Event(timeNow + lower + rand.nextInt(upper - lower+1), 0));
			if (!inserted)
				System.out.println("Tried to insert multiple events in one timestamp!");
			eventCount++;
		}
	}
}
