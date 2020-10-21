import java.util.Random;

public class OrderConstraintGenerator extends TraceSet{
    
    public OrderConstraintGenerator(){
		// init Traces
		traces = new Trace[3];
        traces[0] = new Trace("source");
        traces[1] = new Trace("target");
        traces[2] = new Trace("endOfObservation");
	}
    
    public Trace[] getTraces(){
        return traces;
    }

	public void generateTestTrace(int eventCount, int maxDistSource, int maxDistSourceTarget){
        Random rand = new Random();
		int timeNow = 0;
        int targetTime = 0;
        while (eventCount > 0) {
            //source event
            timeNow+= rand.nextInt(maxDistSource) + 1;
            traces[0].insertEvent(new Event(timeNow, 0));
            //targetEvent
            boolean inserted = false;
            targetTime = timeNow + rand.nextInt(maxDistSourceTarget);
            while(!inserted){
                inserted = traces[1].insertEvent(new Event(targetTime, 0));
                targetTime++;
            }
            eventCount-= 2;
        }
        traces[2].insertEvent(new Event(targetTime + maxDistSourceTarget +1, 0));
	}
}
