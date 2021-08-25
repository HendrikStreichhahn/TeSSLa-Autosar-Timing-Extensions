import java.lang.Comparable;

public class Event implements Comparable{
	/**
	* The point in time, where the event occurs.
	*/ 
	private int timeStamp;

	/**
	* The color is the event. May be ignored, if not needed.
	*/
	private int color = 0;

	/**
	* Constructor.
	* @param timeStamp The Timestamp of the event.
	*/
	public Event(int timeStamp){
		this.timeStamp = timeStamp;
	}

	/**
	* Constructor.
	* @param timeStamp The Timestamp of the event.
	* @param color The color/integer value of the event.
	*/
	public Event(int timeStamp, int color){
		this.timeStamp = timeStamp;
		this.color = color;
	}

	/**
	* Getter for the timestamp of the event.
	* @return the timestamp of the event.
	*/
	public int getTimeStamp(){
		return timeStamp;
	}

	/**
	* Getter for the color/integer value of the event. May be ignored, if not needed.
	* @return the color/integer value of the event.
	*/
	public int getColor(){
		return color;
	}

	/**
	* Creates the String representation of the event in a TeSSLa .trace file.
	* @return String representation of the event in a TeSSLa .trace file.
	*/
	@Override
	public String toString() {
		return "" + timeStamp + ": " + color;
	}

	/**
	* Compare the timestamps of two given events.
	*/
	@Override
	public int compareTo(Object o) {
		Event other = (Event) o;
		return Integer.valueOf(this.timeStamp).compareTo(Integer.valueOf(other.timeStamp));
	}
}