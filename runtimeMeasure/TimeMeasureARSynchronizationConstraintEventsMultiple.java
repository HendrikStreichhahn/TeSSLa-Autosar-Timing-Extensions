import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureARSynchronizationConstraintEventsMultiple extends TimeMeasureConstraint{

	private int tolerance;
	private int streamCount;
	private int maxEventsPerClusterPerStream;
	private int minClusterDistance;
	private int maxClusterDistance;


	public TimeMeasureARSynchronizationConstraintEventsMultiple(int tolerance, int streamCount,
			int maxEventsPerClusterPerStream, int minClusterDistance, int maxClusterDistance){
		this.tolerance = tolerance;
		this.streamCount = streamCount;
		this.maxEventsPerClusterPerStream = maxEventsPerClusterPerStream;
		this.minClusterDistance = minClusterDistance;
		this.maxClusterDistance = maxClusterDistance;
	}

	public TraceSet generateTrace(int eventCount){

		Random rand = new Random();
		//Trace generieren
		SynchronizationConstraintGenerator trace = new SynchronizationConstraintGenerator(streamCount);
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, tolerance, maxEventsPerClusterPerStream,
				minClusterDistance, maxClusterDistance)){
			trace = new SynchronizationConstraintGenerator(streamCount);
		}
		return trace;
	}

	private String writeTimeNow(int i){
		if (i == 0)
			return "time(event" + i + ")";
		else
			return "merge(time(event" + i + ")," + writeTimeNow(i-1) + ")";
	}

	private String writeEventsNow(int i){
		if (i == 0)
			//return "def eventList"+i+":= if (TADL2.defaultTime(event"+i+")  >= timeNow) then List.prepend("+(i+1)+",List.empty[Int]) else List.empty[Int]";
			return "def eventList"+i+":= if (TADL2.defaultTime(event"+i+")  >= timeNow) then List.append(List.empty[Int], "+(i+1)+") else List.empty[Int]";
		else
			return writeEventsNow(i-1) + "\n" +
				//"def eventList"+i+":= if (TADL2.defaultTime(event"+i+")  >= timeNow) then List.prepend("+(i+1)+",eventList"+(i-1)+") else eventList"+(i-1);
				"def eventList"+i+":= if (TADL2.defaultTime(event"+i+")  >= timeNow) then List.append(eventList"+(i-1)+", " + (i+1) +") else eventList"+(i-1);
	}

	private String writeEventsNow(){
		return writeEventsNow(streamCount) + "\ndef";
	}


	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");

			for (int i = 0; i < streamCount; i++)
				fileWriter.write("in event" + i + ": Events[Int]\n");

			fileWriter.write("def tolerance =" + tolerance + "\n");
			fileWriter.write("def timeNow:="+writeTimeNow(streamCount-1)+"\n");
			fileWriter.write(writeEventsNow(streamCount-1)+"\n");
			fileWriter.write("def eventsNow:=eventList"+(streamCount-1)+"\n");

			//fileWriter.write("def constraint := AUTOSAR_TIMEX.SynchronizationTimingConstraintEvents(eventsNow, "+streamCount+","+tolerance +", true)\n");

			fileWriter.write("def constraint := AUTOSAR_TIMEX.SynchronizationTimingConstraintEventsMultiple(eventsNow, "+streamCount+","+tolerance +")\n");


			//fileWriter.write("def constraint := TADL2.synchronizationConstraintReset(eventsNow, "+streamCount+","+tolerance +", TADL2.pseudoInfty)\n");


			fileWriter.write("out constraint\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}