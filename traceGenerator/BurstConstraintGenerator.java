import java.util.Random;

public class BurstConstraintGenerator extends TraceSet{
	public BurstConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public boolean generateTestTrace(int eventCount, int length, int maxOccurrences){
        Random rand = new Random();
        int timeNow= rand.nextInt(length);
        int clr = 0;
        
        while(eventCount > 0){
            
            timeNow+= 2*length + rand.nextInt(length);
            int eventsThisCluster = rand.nextInt(maxOccurrences)+1;
            traces[0].insertEvent(new Event(timeNow, 0));
            for (int j= 0; j < (eventsThisCluster-1); j++){
                int i = 10;
                boolean inserted = false;
                while(i > 0 && !inserted) {
                    inserted = traces[0].insertEvent(new Event(timeNow + rand.nextInt(length), clr));
                    i--;
                }
                if (!inserted){
                    return false;
                }
            }
            eventCount-= eventsThisCluster;
            clr++;
        }
        return true;
        
	}
}