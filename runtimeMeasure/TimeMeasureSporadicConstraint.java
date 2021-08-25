import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureSporadicConstraint extends TimeMeasureConstraint{
	int lower, upper, jitter;

	public TimeMeasureSporadicConstraint(int lower, int upper, int jitter){
		this.lower = lower;
		this.upper = upper;
		this.jitter = jitter;
	}

	public TraceSet generateTrace(int eventCount){
		Random rand = new Random();
		//Trace generieren
		RepetitionConstraintGenerator trace = new RepetitionConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, lower, upper, 1, jitter)){
			trace = new RepetitionConstraintGenerator();
			//System.out.println("trace regenerated");
		}
		return trace;
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
			fileWriter.write("in event: Events[Int]\n");
			fileWriter.write("def constraint := TADL2.sporadicConstraint(event, " + lower + ", " +
				upper + ", " + jitter + ", 1)\n");
			fileWriter.write("out constraint\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}