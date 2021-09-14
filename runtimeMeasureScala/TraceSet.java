import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
* The class TraceSet represents a set of traces, which should be contained in a .trace file for TeSSLa.
*/
public abstract class TraceSet{

	/**
	* An array containing the traces of this trace set, which represents .trace file.
	*/
	protected Trace[] traces;

	/**
	* Checks, if the writing of the trace set into a file is finished.
	* @return true, if all traces do not any events anymore. Otherwise false.
	*/
	private boolean finishedWriting(){
		for (int i = 0; i < traces.length; i++)
			if (traces[i].getNextEventNoIncrement() != null)
				return false;
		return true;
	}

	/**
	* Gets the time value of the earliest event in all of the Traces in this TraceSet.
	* @return The timestamp of the earliest event. If no events are available, the result is Integer.MAX_VALUE.
	*/
	private int nextTimeStamp(){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < traces.length; i++)
			if (traces[i].getNextEventNoIncrement() != null && traces[i].getNextEventNoIncrement().getTimeStamp() < min)
				min = traces[i].getNextEventNoIncrement().getTimeStamp();
		return min;
	}
	
	public Event[] getNextTimestampsEvents(){
		int timeStamp= nextTimeStamp();
		int allCount = 0;
		for (int i = 0; i < traces.length; i++)	
			if (traces[i].getNextEventNoIncrement() != null && traces[i].getNextEventNoIncrement().getTimeStamp() == timeStamp)
				allCount++;
		Event[] result = new Event[allCount];
		int count = 0;
		for (int i = 0; i < traces.length; i++)	
			if (traces[i].getNextEventNoIncrement() != null && traces[i].getNextEventNoIncrement().getTimeStamp() == timeStamp){
				result[count] = traces[i].getNextEvent();
				count++;
			}
		return result;
	}
	
	public String getNextTimestampsEventsString(){
		Event[] events = getNextTimestampsEvents();
		String result = "";
		for (int i = 0; i < events.length; i++)
			result += "\n" + events[i] + "\n";
		return result;
	}

	/**
	* Activates output mode for all traces.
	*/
	public void initOutput(){
		for (int i = 0; i < traces.length; i++)
			traces[i].initOutput();
	}
	
	public void resetOutputCounter(){
		for (int i = 0; i < traces.length; i++)
			traces[i].resetOutputCounter();
	}

	/**
	* Saves the TraceSet into a .trace file, which is readable by TeSSLa.
	* @param path the path to the file, which should be written to.
	* @return false, if there was an IOException. Otherwise true.
	*/
	public boolean saveToFile(String path){
		initOutput();

		try {
			FileWriter fileWriter = new FileWriter(path);
			while (!finishedWriting()){
				// find 'next' timeStamp
				int timeStamp = nextTimeStamp();
				// write all events with this timestamp, pop them from traces
				for (int i = 0; i < traces.length; i++)
					if (traces[i].getNextEventNoIncrement() != null && traces[i].getNextEventNoIncrement().getTimeStamp() == timeStamp){
						Event evt = traces[i].getNextEvent();
						fileWriter.write("" + timeStamp + ": " + traces[i].getName() + " = " + evt.getColor() + "\n");
					}

			}
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}