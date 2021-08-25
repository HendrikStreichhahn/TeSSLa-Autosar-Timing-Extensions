import java.util.Random;
import java.io.IOException;

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

	public boolean generateTestTrace(int eventCount, int lower, int upper,
			int minDistance, int maxDistance, int numPreemptions, int preemptLength){
		Random rand = new Random();
		double timeNow = 0.0;
		double segmentLength = ((double)(lower + (upper - lower)/2)) / (numPreemptions+1);

		while (eventCount > 0) {
			timeNow += minDistance + rand.nextInt(maxDistance+1);
			double timeStart = timeNow;
			//start Event
			traces[0].insertEvent(new Event((int)timeNow, 0)); 

			//split into preemptCount segments of equal length

			for (int i = 0; i < numPreemptions; i++){
				//update time
				timeNow+= segmentLength;
				//preempt event
				traces[2].insertEvent(new Event((int)timeNow, 0));
				//resume event
				timeNow+= preemptLength;
				traces[3].insertEvent(new Event((int)timeNow, 0));
				eventCount-= 2;
			}
			//stop event
			timeNow+= segmentLength;
			traces[1].insertEvent(new Event((int)timeNow, 0));
			eventCount-= 2;

		}
		return true;
	}
}
