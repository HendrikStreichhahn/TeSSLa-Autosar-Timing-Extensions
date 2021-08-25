import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.UnsupportedOperationException;

public class TimeMeasureARExecutionTimeConstraintGross extends TimeMeasureExecutionTimeConstraint{

	public TimeMeasureARExecutionTimeConstraintGross(int low, int up){
		super(low, up);
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
			fileWriter.write("in start: Events[Int]\n");
			fileWriter.write("in stop: Events[Int]\n");
			fileWriter.write("def constraint := AUTOSAR_TIMEX.ExecutionTimeConstraintGross(start, stop, " +
				upper + ", " + lower + ")\n");
			fileWriter.write("out constraint\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
