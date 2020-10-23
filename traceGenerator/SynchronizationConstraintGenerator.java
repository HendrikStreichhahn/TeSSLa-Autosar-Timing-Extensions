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

	public void generateTestTrace(int eventCount, int tolerance, int maxEventsPerClusterPerStream,
            int minClusterDistance, int maxClusterDistance){
        Random rand = new Random();
		int timeNow = 0;
        while (eventCount > 0) {
            timeNow += minClusterDistance + rand.nextInt(maxClusterDistance)+1;
            for (int i = 0; i < traces.length; i++){
                int NumberEventsThisStreamThisCluster = rand.nextInt(maxEventsPerClusterPerStream)+1;
                for (int j = 0; j < NumberEventsThisStreamThisCluster; j++){
                    //25 tries to find free spot
                    int k = 25;
                    boolean inserted = false;
                    while(k > 0 && !inserted) {
                        inserted = traces[i].insertEvent(new Event(timeNow + rand.nextInt(tolerance), 0));
                        k--;
                    }
                    eventCount--;
                    if (!inserted)
                        System.out.println("Tried to insert multiple events in one timestamp " +
                            " in one stream! Trace might be invalid!");
                }
            }
        }
	}
}