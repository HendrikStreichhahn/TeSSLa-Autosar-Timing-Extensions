import java.util.LinkedList;
import java.util.Collections;
import java.util.HashSet;

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
	
	private Event[] eventArray= null;
	
	private int outputCounter = 0;
	
	private HashSet<Integer> usedTimeStamps = new HashSet<Integer>();

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
		//if (timeStampUsed(evt.getTimeStamp()) || eventArray != null)
		if (usedTimeStamps.contains(evt.getTimeStamp()) || eventArray != null)
			return false;
		events.addLast(evt);
		usedTimeStamps.add(evt.getTimeStamp());
		return true;
	}

	/**
	* Initiates and activates the outputMode, which sorts the events chronologically, which ensures the events are outputted in the correct order.
	*/
	public void initOutput(){
		// sort
		Collections.sort(events);
		// put into array
		eventArray= new Event[events.size()];
		int i = 0;
		for (Event evt : events) {
			eventArray[i] = evt;
			i++;
		}
		outputCounter = 0;
	}
	
	public void resetOutputCounter(){
		if (eventArray == null)
			initOutput();
		else
			outputCounter = 0;
	}

	public Event getNextEvent(){
		if (eventArray == null || outputCounter >= eventArray.length)
			return null;
		else{
			return eventArray[outputCounter++];
		}
	}
	
	public Event getNextEventNoIncrement(){
		if (eventArray == null || outputCounter >= eventArray.length)
			return null;
		else{
			return eventArray[outputCounter];
		}
	}
}