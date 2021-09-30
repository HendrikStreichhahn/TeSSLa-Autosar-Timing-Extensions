import java.util.Random;

public class DelayConstraintGenerator extends TraceSet{
	public DelayConstraintGenerator(){
		// init Traces
		traces = new Trace[2];
		traces[0] = new Trace("source");
		traces[1] = new Trace("target");
	}

	public boolean generateTestTrace(int sourceEventCount,  int minDistanceSource, int maxDistanceSource,
			int lower, int upper){
		int eventCount = 0;
		int timeNow = 0;
		Random rand = new Random();
		while (eventCount < sourceEventCount){
			// increase time
			timeNow+= minDistanceSource + rand.nextInt(maxDistanceSource - minDistanceSource+1);

			// insert events
			boolean inserted = true;
			//insert source
			inserted&= traces[0].insertEvent(new Event(timeNow, 0, traces[0]));
			//insert target
			boolean insertedTarget = false;
			for (int i = 0; i < rand.nextInt(3) + 1; i++)
				while (!insertedTarget){
					int targetTime= timeNow + lower + rand.nextInt(upper - lower+1);
					boolean currentInserted = traces[1].insertEvent(new Event(targetTime, 0, traces[1]));
					insertedTarget|= currentInserted;
					if (currentInserted) {
						eventCount++;
						//System.out.println("DelayConstraintGenerator.generateTestTrace created target event in timestamps " + 
						//	targetTime);
					}
				}

			if (!inserted || !insertedTarget){
				return false;
			}
			eventCount++;
		}
		return true;
	}
}
