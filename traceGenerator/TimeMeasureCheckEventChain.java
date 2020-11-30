import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureCheckEventChain extends TimeMeasureConstraint{
    
    public TimeMeasureCheckEventChain(){
    }
    
    public TraceSet generateTrace(int eventCount){
        //Trace generieren
        ReactionConstraintGenerator trace = new ReactionConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, 1,100,10,10)){
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
            fileWriter.write("def constraint := checkEventChain(stimulus, response)\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}