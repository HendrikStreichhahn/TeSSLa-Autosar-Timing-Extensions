import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

public abstract class TimeMeasureConstraint{
    static final String PATHTOMAIN = "../../main/t2uConstraints.tessla";
    
    private String traceStrings = "";
    
    public String getTrace(){
        return traceStrings;
    }
    
    //generate an random trace
    public abstract TraceSet generateTrace(int eventCount);
    
    public abstract boolean generateTeSSLaFile(String fileName);
	
	/**
	*	Compiles a given TeSSLa Specification to a .jar file
	* 
	* @param teSSLaJarPath		The path to the TeSSLa executabale file to use for compiling
	* @param teSSLaFilePath		The path to the TeSSLa specification that should be compiled
	* @param outputFilePath		The path to wich the compiled specification should be written
	* @return 					true if no error occurred, else false
	*/
	public boolean compileTeSSLaFile(String teSSLaJarPath, String teSSLaFilePath, String outputFilePath){
		
		// start the TeSSLa executable
		try {
			Process process = Runtime.getRuntime ().exec
				("java -jar " + teSSLaJarPath + " compile -j " + outputFilePath + " " + teSSLaFilePath);
			//get the streams 
			InputStream stderr = process.getErrorStream ();  
			InputStream stdout = process.getInputStream ();
			BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(stdout));
			BufferedReader stderrReader = new BufferedReader(new InputStreamReader(stderr));
			//wait for compiler to finish
			process.waitFor();
			// check for errors on the streams
			if (stdout.available() == 0 && stderr.available() == 0){
				stdoutReader.close();
				stderrReader.close();
				return true;
			}
			if (stdout.available() != 0){
				System.out.println("Got stdout from compiler: ");
				while(stdout.available() != 0)
					System.out.println(stdoutReader.readLine());
			}
			if (stderr.available() != 0){
				System.out.println("Got stderr from compiler: ");
				while(stderr.available() != 0)
					System.out.println(stderrReader.readLine());
			}
			stdoutReader.close();
			stderrReader.close();
			return false;
		} catch (IOException e) {
			System.err.println(e);
			return false;
		} catch (InterruptedException e) {
			System.err.println(e);
			return false;
		}
	}
	
	/**
	* Measures the runtime for the individual events on a trace.
	* Waits between TeSSLa program start and first event for 5000ms, which is long enough for interpreting on
	* most modern systems.
	* 
	* @param trace The Trace, which is used for monitoring
	* @param tesslaCommand The command line command used to start the monitoring.
	* @return Instance of SingleMeasureResult containing the minimal, maximal, complete and average runtime
	*/
	public SingleMeasureResult measureConstraintSingle(TraceSet trace, String tesslaCommand){
		return measureConstraintSingle(trace, tesslaCommand, 5000);
	}

	/**
	* Measures the runtime for the individual events on a trace.
	* 
	* @param trace The Trace, which is used for monitoring
	* @param tesslaCommand The command line command used to start the monitoring.
	* @param waitTimeForProgramReady Time(ms) between sending the command to start the program and the first 
	*	input. For starting compiled TeSSLa specifications, this parameter should be 500, for interpreted 
	*	TeSSLa specifications, it should be 5000 (on fast systems, it could be lowered, on slow systems, like 
	*	Raspberry Pis, it should be increased)
	* @return Instance of SingleMeasureResult containing the minimal, maximal, complete and average runtime
	*/
    public SingleMeasureResult measureConstraintSingle(TraceSet trace, String tesslaCommand, int waitTimeForProgramReady){
        //start TeSSLa
        TimeMeasureProcessInstance program = null;
        try {
            program = new TimeMeasureProcessInstance(tesslaCommand);
        } catch(IOException e){
            System.out.println("Could not start program: " + e);
            return null;
        }
        //sleep 5 seconds-> wait until TeSSLa is ready
		if (waitTimeForProgramReady != 0) {
			try{
				//Thread.sleep(5*1000);
				Thread.sleep(waitTimeForProgramReady);
			} catch (InterruptedException e){
				System.out.println(e);
			}
		}
        //measure time per event
        trace.initOutput();
        long completeTime = 0;
        long min = Long.MAX_VALUE;
        long max = 0;
        int eventCount;
        //program.setDebugOutput(true);
        try{
            // first timestamp without waiting
            String tesslaInput = trace.getNextTimestampsEvents();
            traceStrings+= tesslaInput + "\n";
            program.writeNoWait(tesslaInput);
            //int eventThisTimeStamp = numEvents(tesslaInput);
            eventCount = 1;
            //System.out.print("write: " + tesslaInput);
            for (tesslaInput = trace.getNextTimestampsEvents(); tesslaInput != ""; 
                    tesslaInput = trace.getNextTimestampsEvents()){
                //eventThisTimeStamp = numEvents(tesslaInput);
                //System.out.print("write: " + tesslaInput);
                traceStrings+= tesslaInput + "\n";
                long time = program.timeToAnswer(tesslaInput);
                //System.out.println("answer after: " + time);
                //update time vals
                min = Math.min(min, time);
                max = Math.max(max, time);
                completeTime += time;
                eventCount+= 1;
            }
        } catch (IOException e){
            System.err.println("IOException between TeSSLa and Timemeasure!");
            System.err.println(e);
            return null;
        } finally {
            try {
               program.close(); 
            } catch (IOException e){
                System.err.println(e);
            }
            
        }
        return new SingleMeasureResult(min, max, completeTime, completeTime/eventCount);
    }
    
    protected int numEvents(String TesslaInput){
        int res = 0;
        for (char chr : TesslaInput.toCharArray())
            if (chr == '\n')
                res++;
        return res;
    }
    
    protected String generateTesslaIntMap(int[] keys, int[] vals){
        if (keys.length != vals.length)
            return null;
        if (keys.length == 0)
            return "Map.empty[Int, Int]";
        String res = "";
        for (int i = 0; i < keys.length; i++)
            res+= "Map.add(";
        res+= "Map.empty[Int, Int]";
        for (int i = 0; i < keys.length; i++)
            res+= ", " + keys[i] + ", " + vals[i] + ")";
        return res;
    }
    
    protected String generateTesslaIntList(int[] vals){
        if (vals.length != vals.length)
            return null;
        if (vals.length == 0)
            return "List.empty[Int]";
        String res = "";
        for (int i = 0; i < vals.length; i++)
            res+= "List.append(";
        res+= "List.empty[Int]";
        for (int i = 0; i < vals.length; i++)
            res+= ", " + vals[i] + ")";
        return res;
    }
    
}