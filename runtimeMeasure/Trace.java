import java.util.LinkedList;
import java.util.Collections;

/**
* The class Trace represents a TeSSLa stream.
*/
public class Trace{

	/**
	* Constructor.
	* @param name the name of the Trace. Must be unique in the TraceSet, otherwise the created .trace file may be unreadable.
	*/
	public Trace(String name){
		if (name.contains(" ") || name.contains(":") || name.contains(".") || name.contains("="))
			throw new IllegalArgumentException("Trace Name contains illegal character.");
		events = new LinkedList<Event>();
		this.name = name;
	}

	/**
	* List of events in this trace. Chronological order must be ensured while inserting, when in outputMode.
	*/
	private LinkedList<Event> events;

	/**
	* The name of the Trace
	*/
	private String name;

	/**
	* Outputmode. If true, inserting is prohibited and the events must be chronologically sorted.
	*/
	private boolean outputMode = false;

	/**
	* Checks, if there is an event in the specified timestamp
	* @param timeStamp the point in time which should be checked
	* @return true, if the timestamp is already occupied. False otherwise.
	*/
	private boolean timeStampUsed(int timeStamp){
		for (Event evt : events){
			if (evt.getTimeStamp() == timeStamp)
				return true;
		}
		return false;
	}

	/**
	* Getter for the name of the trace/stream
	*/
	public String getName(){
		return this.name;
	}

	/**
	* Inserts an event into the trace.
	* @param evt the event to be inserted.
	* @return false, if the timestamp is already used or inputmode is activated. Otherwise inserting is successfull and true is returned.
	*/
	public boolean insertEvent(Event evt){
		if (timeStampUsed(evt.getTimeStamp()) || outputMode)
			return false;
		events.add(evt);
		return true;
	}

	/**
	* Initiates and activates the outputMode, which sorts the events chronologically, which ensures the events are outputted in the correct order.
	*/
	public void initOutput(){
		// sort
		Collections.sort(events);
		outputMode = true;
	}

	/**
	* Returns the earliest event and removes it from the list.
	* @return the eraliest available event
	*/
	public Event popNextEvent(){
		if (!outputMode || events.size() == 0)
			return null;
		Event res = events.getFirst();
		events.removeFirst();
		return res;
	}

	/**
	* Returns the earliest event, does not change the stored events.
	* @return the eraliest available event
	*/ 
	public Event getNextEvent(){
		if (!outputMode || events.size() == 0)
			return null;
		return events.getFirst();
	}
}