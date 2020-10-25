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
        Process process = Runtime.getRuntime ().exec (command);
        
        stdin = process.getOutputStream ();  
        stderr = process.getErrorStream ();  
        stdout = process.getInputStream ();
        
        stdoutReader = new BufferedReader(new InputStreamReader(stdout));
        stderrReader = new BufferedReader(new InputStreamReader(stderr));
    }
    
    public void setDebugOutput(boolean nVal){
        debugOutput = nVal;
    }

    public long timeToAnswer(String stdinString) throws IOException{
        byte[] byteArr = stdinString.getBytes();
        //time measure start
        long time1 = System.nanoTime();
        // write to stdin
        stdin.write(byteArr);
        stdin.flush();
        //System.out.println("wrote: " + stdinString);
            
            
        int availableErr = 0;
        int availableOut = 0;

        //wait, until something is in stoud or stdin
        do {
            availableErr = stderr.available();
            availableOut = stdout.available();
        } while(availableErr == 0 && availableOut == 0);

        // time measure end
        long time2 = System.nanoTime();
        
        // read bytes from streams, output errors if existent 
        if (availableErr != 0)
            System.out.println(stderrReader.readLine());
        if (availableOut != 0)
            if (debugOutput) 
                System.out.println(stdoutReader.readLine());
            else
                stdoutReader.readLine();

        return time2-time1;

    }
    
    public void writeNoWait(String stdinString) throws IOException{
        stdin.write(stdinString.getBytes());
        stdin.flush();
        //System.out.println("wrote: " + stdinString);
    }
}