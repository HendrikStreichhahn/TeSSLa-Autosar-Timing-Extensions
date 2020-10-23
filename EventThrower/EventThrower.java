import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EventThrower{
    public static void main(String [] args) throws InterruptedException{
        System.out.println("#Usage: java EventThrower startDelay(s) eventDelay(ms) traceFile");
        //first event to trigger TeSSLa interpretation
        System.out.println("0: HalloWelt");
        // sleep for .. seconds
        int sleepDuration = Integer.parseInt(args[0])*1000;
        Thread.sleep(sleepDuration);
        System.out.println("#Done sleeping, now starting Trace");
        int timePerEvent = Integer.parseInt(args[1]);
        try{
            // Read input file line by line
            BufferedReader reader = new BufferedReader(new FileReader(args[2]));
            for (String currentLine = reader.readLine(); currentLine != null; currentLine = reader.readLine()){
                if (currentLine.charAt(0) != '#' && currentLine.length() != 0){
                    Thread.sleep(timePerEvent);
                    System.out.println(currentLine);
                }
                
            }
            
        } catch (IOException e) {
            System.out.println("Could not read from File " + args[2]);
            System.out.println(e);
            return;
        }

    }
    
}
