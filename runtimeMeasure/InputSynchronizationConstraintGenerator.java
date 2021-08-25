import java.util.Random;

public class InputSynchronizationConstraintGenerator extends TraceSet{

	public InputSynchronizationConstraintGenerator(int streamCount){
		// init Traces
		traces = new Trace[streamCount+1];
		traces[0] = new Trace("response");
		for (int i = 1; i <= streamCount; i++)
			traces[i] = new Trace("stimulus" + i);
	}

	public boolean generateTestTrace(int eventCount, int tolerance, int clusterDistance){
		Random rand = new Random();
		int timeNow= rand.nextInt(clusterDistance) + tolerance + clusterDistance;
		int clr = 0;

		while(eventCount > 0){
			boolean inserted1 = true;
			// stimulus event
			timeNow+= clusterDistance + rand.nextInt(clusterDistance);
			inserted1 &= traces[0].insertEvent(new Event(timeNow, clr));
			// response events
			int clusterStart = timeNow - (rand.nextInt(clusterDistance)+1);
				for (int i = 1; i < traces.length; i++){
					boolean inserted = false;
					for (int j = 0; j < 25 && !inserted; j++)
						inserted = traces[i].insertEvent(new Event(clusterStart - rand.nextInt(tolerance), clr));
					if (!inserted){
						return false;
					}
				}


			if (!inserted1){
				return false;
			}

			eventCount-= traces.length;
			clr++;
		}
		return true;

	}
}