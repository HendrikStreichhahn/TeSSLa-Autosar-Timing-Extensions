import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureArbitraryEventTriggering extends TimeMeasureConstraint{
	int[] minimum, maximum;

	public TimeMeasureArbitraryEventTriggering(int[] minimum, int[] maximum){
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public TraceSet generateTrace(int eventCount){
		Random rand = new Random();
		//Trace generieren
		ArbitraryConstraintGenerator trace = new ArbitraryConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, minimum, maximum)){
			trace = new ArbitraryConstraintGenerator();
			//System.out.println("trace regenerated");
		}
		return trace;
	}

	public boolean generateTeSSLaFile(String fileName){

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
			fileWriter.write("in event: Events[Int]\n");

			fileWriter.write(generateTesslaIntList2(minimum, "minimum") + "\n");
			fileWriter.write(generateTesslaIntList2(maximum, "maximum") + "\n");

			fileWriter.write("def constraint := AUTOSAR_TIMEX.ArbitraryEventTriggering(event, " +
				"minimum" + ", " + "maximum" +")\n");
			fileWriter.write("out constraint\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


}