import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureJustOutput extends TimeMeasureConstraint{

	public TraceSet generateTrace(int eventCount){
		//Trace generieren
		PeriodicConstraintGenerator trace = new PeriodicConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, 10, 0)){
			trace = new PeriodicConstraintGenerator();
		}
		return trace;
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
			fileWriter.write("in event: Events[Int]\n");
			fileWriter.write("out event\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}