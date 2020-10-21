import java.util.Random;

public class RepeatConstraintGenerator extends TraceSet{
	public RepeatConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}
    
    public Trace[] getTraces(){
        return traces;
    }

	public void generateTestTrace(int eventCount, int lower, int upper, int span){
        Random rand = new Random();
        
        int startTime = rand.nextInt(upper);
        
        int spanDistance = lower/(span);
        
        for (int i = 0; i < span; i++){
            int timeNow = startTime + i * spanDistance;
            int lastUpdate = -1;
            for (int j = 0; j < eventCount / span; j++){
                //insert event
                boolean inserted = traces[0].insertEvent(new Event(timeNow, i));
                int lastUpdateStart = lastUpdate;
                int timeNowStart = timeNow;
                while (!inserted && lastUpdate <= upper){
                    lastUpdate++;
                    timeNow++;
                    inserted = traces[0].insertEvent(new Event(timeNow, i));
                }
                if (!inserted)
                    lastUpdate = lastUpdateStart;
                while (!inserted && lastUpdate >= lower){
                    lastUpdate--;
                    timeNow--;
                    inserted = traces[0].insertEvent(new Event(timeNow, i));
                }
                if (!inserted)
                    System.out.println("Tried to insert multiple events in one timestamp(" + timeNow +
                        ") in one stream! Trace might be invalid!");
                lastUpdate = lower + rand.nextInt(upper - lower + 1);
                timeNow+= lastUpdate;
            }
        }

	}
}
