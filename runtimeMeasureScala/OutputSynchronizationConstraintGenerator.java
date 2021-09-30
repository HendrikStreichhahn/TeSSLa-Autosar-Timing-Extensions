import java.util.Random;

public class OutputSynchronizationConstraintGenerator extends TraceSet{

	public OutputSynchronizationConstraintGenerator(int streamCount){
		// init Traces
		traces = new Trace[streamCount+2];
		traces[0] = new Trace("stimulus");
		traces[traces.length-1] = new Trace("empty");
		for (int i = 1; i <= streamCount; i++)
			traces[i] = new Trace("response" + i);
	}

	public boolean generateTestTrace(int eventCount, int tolerance, int clusterDistance){
		Random rand = new Random();
		int timeNow= rand.nextInt(clusterDistance);
		int clr = 0;

		while(eventCount > 0){
			boolean inserted1 = true;
			// stimulus event
			timeNow+= clusterDistance + rand.nextInt(clusterDistance);
			inserted1 &= traces[0].insertEvent(new Event(timeNow, clr, traces[0]));
			// response events
			int clusterStart = timeNow + rand.nextInt(clusterDistance);
				for (int i = 1; i < traces.length-1; i++){
					boolean inserted = false;
					for (int j = 0; j < 25 && !inserted; j++)
						inserted = traces[i].insertEvent(
							new Event(clusterStart + rand.nextInt(tolerance), clr, traces[i]));
					if (!inserted){
						return false;
					}
				}


			if (!inserted1){
				return false;
			}

			eventCount-= traces.length - 1;
			clr++;
		}
		return true;
	}
}