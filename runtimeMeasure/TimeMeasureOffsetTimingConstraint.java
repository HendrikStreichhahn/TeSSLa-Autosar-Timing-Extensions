import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureOffsetTimingConstraint extends TimeMeasureConstraint{
	int lower, upper, sourceDistance;

	public TimeMeasureOffsetTimingConstraint(int lower, int upper, int sourceDistance){
		this.lower = lower;
		this.upper = upper;
		this.sourceDistance = sourceDistance;
	}

	public TraceSet generateTrace(int eventCount){
		Random rand = new Random();
		//Trace generieren
		DelayConstraintGenerator trace = new DelayConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, sourceDistance, sourceDistance, lower, upper)){
			trace = new DelayConstraintGenerator();
			System.out.println("trace regenerated");
		}
		return trace;
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
			fileWriter.write("in source: Events[Int]\n");
			fileWriter.write("in target: Events[Int]\n");
			fileWriter.write("def lower = " + lower + "\n");
			fileWriter.write("def upper = " + upper + "\n");
			fileWriter.write("def constraint := AUTOSAR_TIMEX.offsetTimingConstraint(source , target, " + lower + ", " +
				upper + ")\n");
			fileWriter.write("out constraint\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}