import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureReactionConstraint extends TimeMeasureConstraint{
	int minimum, maximum, minStimulusDist, maxStimulusDist;

	public TimeMeasureReactionConstraint(int minimum, int maximum, int minStimulusDist, int maxStimulusDist){
		this.minimum = minimum;
		this.maximum = maximum;
		this.minStimulusDist = minStimulusDist;
		this.maxStimulusDist = maxStimulusDist;
	}

	public TraceSet generateTrace(int eventCount){
		Random rand = new Random();
		//Trace generieren
		ReactionConstraintGenerator trace = new ReactionConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, minStimulusDist, maxStimulusDist, minimum, maximum)){
			trace = new ReactionConstraintGenerator();
			//System.out.println("trace regenerated");
		}
		return trace;
	}

	public boolean generateTeSSLaFile(String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
			fileWriter.write("in stimulus: Events[Int]\n");
			fileWriter.write("in response: Events[Int]\n");
			fileWriter.write("def constraint := TADL2.reactionConstraint(stimulus, response, " + minimum + ", "
				+ maximum + ")\n");
			fileWriter.write("out constraint\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}