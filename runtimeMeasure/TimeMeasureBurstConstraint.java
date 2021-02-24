import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureBurstConstraint extends TimeMeasureConstraint{
    int length, maxOccurrences;
    
    public TimeMeasureBurstConstraint(int length, int maxOccurrences){
        this.length = length;
        this.maxOccurrences = maxOccurrences;
    }
    
    public TraceSet generateTrace(int eventCount){
        Random rand = new Random();
        //Trace generieren
        BurstConstraintGenerator trace = new BurstConstraintGenerator();
        //generate trace, repeat until fulfilled trace generated
        while (!trace.generateTestTrace(eventCount, length, maxOccurrences)){
            trace = new BurstConstraintGenerator();
            //System.out.println("trace regenerated");
        }
        return trace;
    }
    
    public boolean generateTeSSLaFile(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := TADL2.burstConstraint(event, " + length + ", "
                + maxOccurrences + ", 1)\n");
            fileWriter.write("out constraint\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean generateTeSSLaFileFiltered(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("include \"" + PATHTOMAIN + "\"\n");
            fileWriter.write("in event: Events[Int]\n");
            fileWriter.write("def constraint := TADL2.burstConstraint(event, " + length + ", "
                + maxOccurrences + ", 1)\n");
            fileWriter.write("out filter(constraint, !constraint)\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
        
    //generates a TeSSLa file, which monitors the RepeatConstraint with the given parameters
    //args length, maxOccurences, outputFile
    public static void main(String[] args){
        if (args.length != 3)
            System.out.println("Wrong parameters! Use length, maxOccurences, outputFile");
        else{
            TimeMeasureBurstConstraint constraint =
                new TimeMeasureBurstConstraint(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            if (constraint.generateTeSSLaFileFiltered(args[2]))
                System.out.println("File saved");
            else
                System.out.println("Could not save file");
        }

    }
}