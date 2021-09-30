import java.util.Random;
import java.io.IOException;
import java.security.InvalidParameterException;

public class ArbitraryConstraintGenerator extends TraceSet{
	public ArbitraryConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public void generateTestTrace(int eventCount, int min1, int min2, int min3, int max1, int max2, int max3){
		Random rand = new Random();

		int timeNow = min1 + rand.nextInt(max1 - min1);
		int numEvents = 0;

		int prev1 = -1;
		int prev2 = -1;

		while (numEvents < eventCount){
			System.out.println("Event at: " + timeNow);
			traces[0].insertEvent(new Event(timeNow, traces[0]));
			//calc bounds for next event
			int lowerBoundNext = 0;
			if (numEvents == 0)
				lowerBoundNext = timeNow + min1;
			if (numEvents == 1)
				lowerBoundNext = Math.max(timeNow + min1, prev1 + min2);
			if (numEvents >= 2)
				lowerBoundNext = Math.max(Math.max(timeNow + min1, prev1 + min2), prev2 + min3);
			int UpperBoundNext = 0;
			if (numEvents == 0)
				UpperBoundNext = timeNow + max1;
			if (numEvents == 1)
				UpperBoundNext = Math.min(timeNow + max1, prev1 + max2);
			if (numEvents >= 2)
				UpperBoundNext = Math.min(Math.max(timeNow + max1, prev1 + max2), prev2 + max3);
			// update previous event time
			prev2 = prev1;
			prev1 = timeNow;
			//calc next Event
			if (UpperBoundNext < lowerBoundNext)
				System.out.println("" + UpperBoundNext + "<" + lowerBoundNext);
			timeNow = lowerBoundNext + rand.nextInt(UpperBoundNext - lowerBoundNext);
			numEvents++;
		}
	}

	public boolean generateTestTrace(int eventCount, int[] min, int[] max){
		Random rand = new Random();
		if (min.length == 0 || max.length == 0)
			throw new InvalidParameterException();
		int timeNow = min[0] + rand.nextInt(max[0] - min[0]+1);
		int numEvents = 0;

		int[] prevEventTimes = new int[min.length];
		while (numEvents < eventCount){
			//System.out.println("Event at: " + timeNow);
			//insert event
			traces[0].insertEvent(new Event(timeNow, traces[0]));
			numEvents++;
			//update prev events
			for (int i = prevEventTimes.length-2; i >= 0; i--)
				prevEventTimes[i+1]= prevEventTimes[i];
			prevEventTimes[0] = timeNow;

			//lower bound for next event
			int lowerBoundNext = Integer.MIN_VALUE;
			for (int i = 0; i < min.length && i < numEvents; i++)
				lowerBoundNext = Math.max(lowerBoundNext, prevEventTimes[i] + min[i]);
			//upper bound for next event
			int upperBoundNext = Integer.MAX_VALUE;
			for (int i = 0; i < max.length && i < numEvents; i++)
				upperBoundNext = Math.min(upperBoundNext, prevEventTimes[i] + max[i]);

			//calc next Event
			if (upperBoundNext < lowerBoundNext){

				return false;
			}
			timeNow = lowerBoundNext + rand.nextInt(upperBoundNext - lowerBoundNext+1);
		}
		return true;
	}

}