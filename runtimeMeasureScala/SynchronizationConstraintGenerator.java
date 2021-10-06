import java.util.Random;

public class SynchronizationConstraintGenerator extends TraceSet{

	public SynchronizationConstraintGenerator(int streamCount){
		// init Traces
		traces = new Trace[streamCount];
		for (int i = 0; i < streamCount; i++)
			traces[i] = new Trace("event" + i);
	}

	public Trace[] getTraces(){
		return traces;
	}

	public boolean generateTestTrace(int eventCount, int tolerance, int maxEventsPerClusterPerStream,
			int minClusterDistance, int maxClusterDistance){
		//System.out.println("SynchronizationConstraintGenerator.generateTrace(eventCount=" + eventCount +", tolerance=" + tolerance + ", maxEventsPerClusterPerStream=" + maxEventsPerClusterPerStream + ", minClusterDistance=" + 
		//		minClusterDistance + ", maxClusterDistance= "  + maxClusterDistance +")");
		//Random rand = new Random();
		int timeNow = 0;
		int counter = 0;
		while (eventCount > 0) {
			//System.out.println("generateTestTrace" + traces.length);
			//timeNow += minClusterDistance + rand.nextInt(maxClusterDistance+1);
			timeNow += minClusterDistance + (maxClusterDistance/2);
			for (int i = 0; i < traces.length; i++){
				//int NumberEventsThisStreamThisCluster = rand.nextInt(maxEventsPerClusterPerStream)+1;
				int NumberEventsThisStreamThisCluster = maxEventsPerClusterPerStream;
				for (int j = 0; j < NumberEventsThisStreamThisCluster; j++){
					//25 tries to find free spot
					int k = 25;
					boolean inserted = false;
					while(k > 0 && !inserted) {
						//inserted = traces[i].insertEvent(new Event(timeNow + rand.nextInt(tolerance+1), counter, traces[i]));
						inserted = traces[i].insertEvent(new Event(timeNow + j*(tolerance/NumberEventsThisStreamThisCluster), counter, traces[i]));
						k--;
					}
					eventCount--;
					if (!inserted){
						//System.out.println("generateTestTrace trace false");
						//System.out.println("SynchronizationConstraintGenerator Inserted invalid event");
						return false;
					}
					//System.out.println("SynchronizationConstraintGenerator Inserted event at " + (timeNow + (tolerance/NumberEventsThisStreamThisCluster)));
				}
			}
			counter++;
		}
		return true;
	}
}
