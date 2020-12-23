import java.util.Random;

public class OrderConstraintGenerator extends TraceSet{
    
    public OrderConstraintGenerator(){
		// init Traces
		traces = new Trace[2];
        traces[0] = new Trace("source");
        traces[1] = new Trace("target");
	}
    
    public Trace[] getTraces(){
        return traces;
    }

	public boolean generateTestTrace(int eventCount, int maxDistSource, int maxDistSourceTarget){
        Random rand = new Random();
		int timeNow = 0;
        int targetTime = 0;
        while (eventCount > 0) {
            //source event
            timeNow+= rand.nextInt(maxDistSource) + 1;
            traces[0].insertEvent(new Event(timeNow, 0));
            //targetEvent
            boolean inserted = false;
            targetTime = timeNow + rand.nextInt(maxDistSourceTarget+1);
            while(!inserted){
                inserted = traces[1].insertEvent(new Event(targetTime, 0));
                targetTime++;
            }
            eventCount-= 2;
        }
        return true;
	}
}
