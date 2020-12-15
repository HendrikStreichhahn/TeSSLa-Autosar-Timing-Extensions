import java.util.Random;
import java.util.LinkedList;
import java.util.Iterator;

public class RepeatConstraintGenerator extends TraceSet{
	public RepeatConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}
    
    public Trace[] getTraces(){
        return traces;
    }

	public boolean generateTestTrace(int eventCount, int lower, int upper, int span){
        Random rand = new Random();
        
        int spanDistance = lower/(span);
        
        LinkedList<Integer> spanLast = new LinkedList<Integer>();
        for (int i = 0; i < span; i++){
            spanLast.add(spanDistance * (i+1));
            traces[0].insertEvent(new Event(spanDistance * (i+1), 0));
        }
        
        for (int i = span; i < eventCount; i++){
            int lowestPossibleTimestamp = minTimestamp(spanLast, lower);
            int highestPossibleTimestamp = spanLast.getFirst() + upper;
            if (lowestPossibleTimestamp > highestPossibleTimestamp){
                //System.out.println("Order is broken as Event " + i + "! Trace is invalid!");
                return false;
            }
            int nextEvent = lowestPossibleTimestamp + rand.nextInt(highestPossibleTimestamp - lowestPossibleTimestamp + 1);
            
            boolean inserted = traces[0].insertEvent(new Event(nextEvent, 0));
            //place not free, forward search
            while (!inserted && nextEvent <= spanLast.getFirst() + upper){
                nextEvent++;
                inserted = traces[0].insertEvent(new Event(nextEvent, i));
            }
            //place not free, backward search
            while (!inserted && nextEvent >= lowestPossibleTimestamp){
                nextEvent--;
                inserted = traces[0].insertEvent(new Event(nextEvent, i));
            }
            if (!inserted)
                return false;
                //System.out.println("Could not find free matching timestamp for event " + i + "! Trace is invalid!");
            if (!ascendingListOrder(spanLast))
                return false;
                //System.out.println("Order is broken as Event " + i + "! Trace is invalid!");
            spanLast.add(nextEvent);
            spanLast.remove();
        }
        return true;
	}
    
    //hinter jedem eintrag der list & upper hinter head der liste
    private int minTimestamp(LinkedList<Integer> aList, int lower){
        int min = aList.getFirst() + lower;
        for (int curVal : aList){
            if (curVal > min)
                min = curVal;
            //System.out.println("curVal = " + curVal);
        }
        //System.out.println("min = " + min);
        return min;
    }
    
    private boolean ascendingListOrder(LinkedList<Integer> aList){
        if (aList.size() <= 1)
            return true;
        if (aList.size() == 2)
            return aList.getFirst() <= aList.getLast();

        Iterator<Integer> it = aList.iterator();
        int lastVal = it.next();
        while(it.hasNext()) {
            int curVal = it.next();
            if (! (lastVal < curVal))
                return false;
            lastVal = curVal;
        }
        return true;
    }
}
