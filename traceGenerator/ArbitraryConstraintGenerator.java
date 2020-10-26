import java.util.Random;

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
            traces[0].insertEvent(new Event(timeNow, 0));
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
    
    /*private int min3(int val1, int val2, int val3){
        int res = val1;
        if (val2 = -1)
            res= Math.min(res, val2);
        if (val3 = -1)
            res= Math.min(res, val3);
        return res;
    }
    private int max3(int val1, int val2, int val3){
        int res = val1;
        if (val2 = -1)
            res= Math.max(res, val2);
        if (val3 = -1)
            res= Math.max(res, val3);
        return res;
    }*/
}