import java.util.Random;

public class DelayConstraintGenerator extends TraceSet{
	public void initEvents(){
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
            //insert source
			inserted&= traces[0].insertEvent(new Event(timeNow, 0));
            //insert target
			for (int i = 0; i <= rand.nextInt(minDistanceSource/5)+1; i++)
				traces[1].insertEvent(new Event(timeNow + lower + rand.nextInt(upper - lower+1), 0));
			if (!inserted)
				System.out.println("Tried to insert multiple events in one timestamp!");
			eventCount++;
		}
	}
}
