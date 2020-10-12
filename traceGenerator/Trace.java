import java.util.LinkedList;
import java.util.Collections;

public class Trace{
	private LinkedList<Event> events;
	private String name;
	
	private boolean timeStampUsed(int timeStamp){
		for (Event evt : events){
			if (evt.getTimeStamp() == timeStamp)
				return true;
		}
		return false;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean insertEvent(Event evt){
		if (timeStampUsed(evt.getTimeStamp()) || outputMode)
			return false;
		events.add(evt);
		return true;
	}
	
	boolean outputMode = false;
	
	public void initOutput(){
		// sort
		Collections.sort(events);
		outputMode = true;
	}
	
	public Event popNextEvent(){
		if (!outputMode || events.size() == 0)
			return null;
		Event res = events.getFirst();
		events.removeFirst();
		return res;
	}
	
	public Event getNextEvent(){
		if (!outputMode || events.size() == 0)
			return null;
		return events.getFirst();
	}
	
	public Trace(String name){
		events = new LinkedList<Event>();
		this.name = name;
	}
	
}