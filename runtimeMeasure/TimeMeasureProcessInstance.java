import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TimeMeasureProcessInstance {
    
    OutputStream stdin = null;  
    InputStream stderr = null;  
    InputStream stdout = null;
    
    BufferedReader stdoutReader = null;
    BufferedReader stderrReader = null;
    
    boolean debugOutput = false;
    
    public TimeMeasureProcessInstance(String command) throws IOException {
        //System.out.println("Command: " + command);
        
        Process process = Runtime.getRuntime ().exec (command);
        
        stdin = process.getOutputStream ();  
        stderr = process.getErrorStream ();  
        stdout = process.getInputStream ();
        
        stdoutReader = new BufferedReader(new InputStreamReader(stdout));
        stderrReader = new BufferedReader(new InputStreamReader(stderr));
    }
    
    public void close() throws IOException{
        stdoutReader.close();
        stderrReader.close();
        stdin.close();
    }
    
    public void setDebugOutput(boolean nVal){
        debugOutput = nVal;
    }

    public long timeToAnswer(String stdinString) throws IOException{
        //System.out.println("TimeMeasureProcessInstance.timeToAnswer(" + stdinString + ")");
        byte[] byteArr = stdinString.getBytes();
        //time measure start
        long time1 = System.nanoTime();
        // write to stdin
        stdin.write(byteArr);
        stdin.flush();
        //System.out.println("TimeMeasureProcessInstance.timeToAnswer b");
            
            
        int availableErr = 0;
        int availableOut = 0;

        //wait, until something is in stoud or stdin
        do {
            //System.out.println("TimeMeasureProcessInstance.timeToAnswer c");
            availableErr = stderr.available();
            //System.out.println("TimeMeasureProcessInstance.timeToAnswer d");
            availableOut = stdout.available();
        } while(availableErr == 0 && availableOut == 0);
        //System.out.println("TimeMeasureProcessInstance.timeToAnswer f");
        //System.out.println("got answer");
        // time measure end
        long time2 = System.nanoTime();
        
        // read bytes from streams, output errors if existent 
        //System.out.println("TimeMeasureProcessInstance.timeToAnswer h");
        if (availableErr != 0)
            System.out.println(stderrReader.readLine());
        //System.out.println("TimeMeasureProcessInstance.timeToAnswer i");
        if (availableOut != 0){
            String answer = stdoutReader.readLine();
            //System.out.println(stdinString.replace('\n', ' ') + "=>" + answer);
            if (debugOutput || answer.contains("{final = true, value = false}")){
                System.out.println(answer);
                System.exit(-1);
            }
                
        }
            
                

        return time2-time1;

    }
    
    public void writeNoWait(String stdinString) throws IOException{
        stdin.write(stdinString.getBytes());
        stdin.flush();
    }
}