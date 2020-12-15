import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.UnsupportedOperationException;

public class TimeMeasureOrderConstraint extends TimeMeasureConstraint{
    
    public TraceSet generateTrace(int eventCount){
        throw new UnsupportedOperationException();
    }
    
    public TraceSet generateTrace(int eventCount, int maxDistSource, int maxDistSourceTarget){
        OrderConstraintGenerator trace = new OrderConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, maxDistSource, maxDistSourceTarget)){
            trace = new OrderConstraintGenerator();
            //System.out.println("trace regenerated");
        }
        return trace;
    }

    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
            fileWriter.write("in source: Events[Int]\n");
            fileWriter.write("in target: Events[Int]\n");
            fileWriter.write("def constraint := orderConstraint(source, target)\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
