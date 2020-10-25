import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TimeMeasure{
    
    public static void main(String[] args) throws InterruptedException{
        if (args.length != 3 && args.length != 4){
            System.out.println("param1: startDelay \"command\" \"input file\"");
            return;
        }
        //read input file
        String[] inputLines = readFile(args[2]);
        //start programm
        TimeMeasureProcessInstance program = null;
        try {
            program = new TimeMeasureProcessInstance(args[1]);
        } catch(IOException e){
            System.out.println("Could not start program: " + e);
            return;
        }
        if (args.length == 4){
            program.setDebugOutput(true);
            System.out.println("Debugoutput activated");
        }
        System.out.println("TeSSLa started. Sleep " + args[0] + "s");
        Thread.sleep(Integer.parseInt(args[0])*1000);
        System.out.println("Sleep finished");
        long completeTime = 0;
        long min = Long.MAX_VALUE;
        long max = 0;
        try {
            program.writeNoWait(inputLines[0]);
            for (int i = 1; i < inputLines.length; i++){
                // ignore comment lines
                if (inputLines[i].charAt(0) == '#')
                    continue;
                //next events has same timestamp -> write all events this timestamp
                if (i < inputLines.length-1 && inputLines[i].split(":")[0].equals(inputLines[i+1].split(":")[0])){
                    program.writeNoWait(inputLines[i]);
                }
                else{
                    // measure time
                    long time = program.timeToAnswer(inputLines[i]);
                    //update time vals
                    min = Math.min(min, time);
                    max = Math.max(max, time);
                    completeTime += time;
                }
                
            }
        } catch(IOException e){
            System.out.println("Could not read or write to/from stdout/stdin " + e);
            return;
        }
        
        System.out.println("Time complete: " + completeTime/(1000000) + "ms");
        System.out.println("Average: " + (((float)completeTime) / (float)inputLines.length)/(1000000) + "ms");
        System.out.println("Minimum: " + ((float)min) /(1000000) + "ms");
        System.out.println("Maximum: " + ((float)max) /(1000000) + "ms");
        
    }
    
    private static String[] readFile(String fileName){
        LinkedList<String> lines= new LinkedList<String>();
        try{
            // read line by line
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                if (currentLine.charAt(0) != '#')
                    lines.add(currentLine);
            }
        } catch (IOException e) {
            System.out.println("Could not read from File " + fileName);
            System.out.println(e);
            return null;
        }
        //write lines to array
        String[] result = new String[lines.size()];
        int i = 0;
        for (String str : lines){
            result[i]= str + "\n";
            i++;
        }
        return result;
    }
}