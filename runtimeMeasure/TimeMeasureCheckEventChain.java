import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureCheckEventChain extends TimeMeasureReactionConstraint{

	public TimeMeasureCheckEventChain(int minimum, int maximum, int minStimulusDist, int maxStimulusDist){
		super(minimum, maximum, minStimulusDist, maxStimulusDist);
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
			fileWriter.write("in stimulus: Events[Int]\n");
			fileWriter.write("in response: Events[Int]\n");
			fileWriter.write("def constraint := TADL2.checkEventChain(stimulus, response)\n");
			fileWriter.write("out constraint\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}