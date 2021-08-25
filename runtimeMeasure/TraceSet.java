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
			if (traces[i].getNextEvent() != null)
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
			if (traces[i].getNextEvent() != null && traces[i].getNextEvent().getTimeStamp() < min)
				min = traces[i].getNextEvent().getTimeStamp();
		return min;
	}

	/**
	* Creates a string, which consists of the lines, that creates the events in the earliest available timestamp.
	* @return see avove.
	*/
	public String getNextTimestampsEvents(){
		String result = "";
		// find 'next' timeStamp
		int timeStamp = nextTimeStamp();
		for (int i = 0; i < traces.length; i++)
			if (traces[i].getNextEvent() != null && traces[i].getNextEvent().getTimeStamp() == timeStamp){
				Event evt = traces[i].popNextEvent();
			   result += "" + timeStamp + ": " + traces[i].getName() + " = " + evt.getColor() + "\n";
			}
		return result;
	}

	/**
	* Activates output mode for all traces.
	*/
	public void initOutput(){
		for (int i = 0; i < traces.length; i++)
			traces[i].initOutput();
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
					if (traces[i].getNextEvent() != null && traces[i].getNextEvent().getTimeStamp() == timeStamp){
						Event evt = traces[i].popNextEvent();
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