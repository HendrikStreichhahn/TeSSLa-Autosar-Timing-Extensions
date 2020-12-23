import java.lang.Comparable;

public class Event implements Comparable{
	private int timeStamp;
	private int color;
	
	public int getTimeStamp(){
		return timeStamp;
	}
	
	public int getColor(){
		return color;
	}
	
	public Event(int timeStamp, int color){
		this.timeStamp = timeStamp;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "" + timeStamp + ": " + color;
	}
	
	@Override
    public int compareTo(Object o) {
        Event other = (Event) o;
        return Integer.valueOf(this.timeStamp).compareTo(Integer.valueOf(other.timeStamp));
    }
}