import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureLatencyTimingConstraint extends TimeMeasureConstraint{
    int minimum, maximum;
    int minStimulusDist, maxStimulusDist;
    
    boolean isConstraintTypeAge;
    
    public TimeMeasureLatencyTimingConstraint(boolean isConstraintTypeAge, int maximum, int minimum,
            int minStimulusDist, int maxStimulusDist){
        this.minimum = minimum;
        this.maximum = maximum;
        this.minStimulusDist = minStimulusDist;
        this.maxStimulusDist = maxStimulusDist;
        this.isConstraintTypeAge = isConstraintTypeAge;
    }
    
    public TraceSet generateTrace(int eventCount){
        //Ageconstraint
        if (isConstraintTypeAge) {
            AgeConstraintGenerator trace = new AgeConstraintGenerator();
            //generate trace, repeat until fulfilled trace generated
            while (!trace.generateTestTrace(eventCount, minStimulusDist, maxStimulusDist, minimum, maximum)){
                trace = new AgeConstraintGenerator();
            }
            return trace;
        } else {
            //ReactionConstraint
            //Trace generieren
            ReactionConstraintGenerator trace = new ReactionConstraintGenerator();
            //generate trace, repeat until fulfilled trace generated
            while (!trace.generateTestTrace(eventCount, minStimulusDist, maxStimulusDist, minimum, maximum)){
                trace = new ReactionConstraintGenerator();
            }
            return trace;
        }
    }
    
    public boolean generateTeSSLaFile(String fileName){

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
            fileWriter.write("in stimulus: Events[Int]\n");
            fileWriter.write("in response: Events[Int]\n");
            fileWriter.write("def constraint := AUTOSAR_TIMEX.LatencyTimingConstraint(stimulus, response, " +
                isConstraintTypeAge + ", " + maximum + ", " + minimum + ", 0)\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    

}