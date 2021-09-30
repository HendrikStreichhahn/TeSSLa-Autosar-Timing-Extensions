import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.UnsupportedOperationException;

public class TimeMeasureExecutionTimeConstraint extends TimeMeasureConstraint{
	int lower, upper;

	public TimeMeasureExecutionTimeConstraint(int lower, int upper){
		this.lower = lower;
		this.upper = upper;
	}

	public TraceSet generateTrace(int eventCount){
		throw new UnsupportedOperationException();
	}

	public TraceSet generateTrace(int eventCount, int minDistance, int maxDistance,
			int maxPreemptions, int maxPreemptionTime){
		Random rand = new Random();
		//Trace generieren
		ExecutionTimeConstraintGenerator trace = new ExecutionTimeConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, lower, upper, minDistance, maxDistance,
				maxPreemptions, maxPreemptionTime)){
			trace = new ExecutionTimeConstraintGenerator();
			//System.out.println("trace regenerated");
		}
		return trace;
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
			fileWriter.write("in start: Events[Int]\n");
			fileWriter.write("in preempt: Events[Int]\n");
			fileWriter.write("in resume: Events[Int]\n");
			fileWriter.write("in stop: Events[Int]\n");
			fileWriter.write("def constraint := TADL2.executionTimeConstraint(start, stop, preempt, resume, " +
				lower + ", " + upper + ")\n");
			fileWriter.write("def final = constraint.final\n");
			fileWriter.write("def value = constraint.value\n");
			fileWriter.write("out value\n");
			fileWriter.write("out final\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
