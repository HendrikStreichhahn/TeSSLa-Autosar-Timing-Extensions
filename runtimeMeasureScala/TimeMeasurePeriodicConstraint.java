import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasurePeriodicConstraint extends TimeMeasureConstraint{
	int period, jitter;

	public TimeMeasurePeriodicConstraint(int period, int jitter){
		this.period = period;
		this.jitter = jitter;
	}

	public TraceSet generateTrace(int eventCount){
		Random rand = new Random();
		//Trace generieren
		PeriodicConstraintGenerator trace = new PeriodicConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, period, jitter)){
			trace = new PeriodicConstraintGenerator();
			//System.out.println("trace regenerated");
		}
		return trace;
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
			fileWriter.write("in event: Events[Int]\n");
			fileWriter.write("def constraint := TADL2.periodicConstraint(event, " + period + ", "
				+ jitter + ", 1)\n");
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