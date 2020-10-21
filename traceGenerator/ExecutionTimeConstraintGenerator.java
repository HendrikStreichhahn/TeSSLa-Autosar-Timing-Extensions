import java.util.Random;

public class ExecutionTimeConstraintGenerator extends TraceSet{
    
    public ExecutionTimeConstraintGenerator(){
		// init Traces
		traces = new Trace[4];
        traces[0] = new Trace("start");
        traces[1] = new Trace("stop");
        traces[2] = new Trace("preempt");
        traces[3] = new Trace("resume");
	}
    
    public Trace[] getTraces(){
        return traces;
    }

	public void generateTestTrace(int eventCount, int lower, int upper,
            int minDistance, int maxDistance, int maxPreemptions, int maxPreemptionTime){
        Random rand = new Random();
		int timeNow = 0;
        while (eventCount > 0) {
            //start event
            timeNow += minDistance + rand.nextInt(maxDistance)+1;
            int timeStart = timeNow;
            traces[0].insertEvent(new Event(timeStart, 0));
            eventCount--;
            //preemptions
            int preemptNum = rand.nextInt(maxPreemptions);
            if (preemptNum != 0) {
                int timeBetweenPreempts = ((lower + upper)/2)/(preemptNum+2);
                if (!(lower <= 5 * timeBetweenPreempts && timeBetweenPreempts <= upper))
                    System.out.println("Fehler!");
                for (int i = 0; i < preemptNum; i++){
                    timeNow += timeBetweenPreempts;
                    traces[2].insertEvent(new Event(timeNow, 0));
                    timeNow+= rand.nextInt(maxPreemptionTime)+1;
                    traces[3].insertEvent(new Event(timeNow, 0));
                    eventCount-= 2;
                }
                timeNow += timeBetweenPreempts;
            } else {
                timeNow += lower + rand.nextInt(upper - lower);
            }
            
            // end event
            
            traces[1].insertEvent(new Event(timeNow, 0));
            eventCount--;
        }
	}
}
