import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public abstract class TraceSet{
	
	protected Trace[] traces;
	
	private boolean finishedWriting(){
		for (int i = 0; i < traces.length; i++)
			if (traces[i].getNextEvent() != null)
				return false;
		return true;
	}
	
	private int nextTimeStamp(){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < traces.length; i++)
			if (traces[i].getNextEvent() != null && traces[i].getNextEvent().getTimeStamp() < min)
				min = traces[i].getNextEvent().getTimeStamp();
		return min;
	}
	
	public boolean saveToFile(String path){
		for (int i = 0; i < traces.length; i++)
			traces[i].initOutput();
		
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