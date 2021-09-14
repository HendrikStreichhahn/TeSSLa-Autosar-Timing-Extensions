import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public abstract class TimeMeasureConstraint{
	static final String PATHTOMAIN = "../../main/t2uConstraints.tessla";
	static final String PATHTOTIMEXMAIN = "../../main/TIMEXConstraints.tessla";

	private String traceStrings = "";

	/**
	* Getter for the trace, which has been sent to the TeSSLa Instance. Only the events, the already has been sent to the TeSSLa Instance will be returned.
	* @return the trace, which already has been sent to the TeSSLa Instance
	*/
	public String getTrace(){
		return traceStrings;
	}

	/**
	* Generates a trace that fulfills the constraint with the parameters given in the constructor.
	* @param eventCount number of events in the trace
	* @return a traceSet described above
	*/
	public abstract TraceSet generateTrace(int eventCount);

	/**
	* Generates a TeSSLa Specification file, that checks the constraint with the parameters given in the constructor.
	* @param fileName the path and filename, at which the file should be stored
	* @return true if no error occurred, else false
	*/
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
				(Runtime.getRuntime().exec("rm -r " + pathComponent(outputFilePath) + "/compile* ")).waitFor();
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
			System.out.println("TimeMeasureConstraint.compileTeSSLaFile IOException");
			System.err.println(e);
			return false;
		} catch (InterruptedException e) {
			System.out.println("TimeMeasureConstraint.compileTeSSLaFile InterruptedException");
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
		try{
			// first timestamp without waiting
			String tesslaInput = trace.getNextTimestampsEventsString();
			traceStrings+= tesslaInput;
			//System.out.print(tesslaInput);
			program.writeNoWait(tesslaInput);
			eventCount = 1;
			for (tesslaInput = trace.getNextTimestampsEventsString(); tesslaInput != ""; 
					tesslaInput = trace.getNextTimestampsEventsString()){
				traceStrings+= tesslaInput;
				//System.out.print(tesslaInput);
				long time = program.timeToAnswer(tesslaInput);
				if (program.getHadErrorStreamContent()){
					System.out.println("HadErrorStreamContent");
					if (!saveStringToFile("ErrorTrace.trace", traceStrings))
						System.out.println("Could not sace file \"ErrorTrace.trace\"");
				}

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

	/**
	* Counts the number of line endings in a string
	*/
	protected int numEvents(String TesslaInput){
		int res = 0;
		for (char chr : TesslaInput.toCharArray())
			if (chr == '\n')
				res++;
		return res;
	}

	/**
	* Generates a TeSSLaMap with the given keys and their values.
	* @param keys The keys in the map.
	* @param vals The values in the map. Associated values and keys are defined by the indices.
	* @return the string, in which the map is generated
	*/
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

	/**
	* Generates a TeSSLa List of integers with the given values. The list is generated in one line.
	* The Method only returns the string creating the list.
	* @param vals The values, that should be written in the list.
	* @return a string creating the list in TeSSLa.
	*/
	protected String generateTesslaIntList(int[] vals){
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

	/**
	* Generates a TeSSLa List of integers with the given values. The list is generated in multiple lines with multiple partial definitions.
	* The method returns a string creating and defining the list.
	* @param vals The values, that should be written in the list.
	* @param name The name of the list. Must be unique in the TeSSLa Specification.
	* @return a string creating the list in TeSSLa.
	*/
	protected String generateTesslaIntList2(int[] vals, String name){
		if (vals.length == 0)
			return "def " + name + " := List.empty[Int]";
		String res = "def " + name + "0 := List.empty[Int]\n";
		for (int i = 0; i < vals.length; i++)
			res+= "def " + name + (i+1) + " := List.append(" + name + Integer.toString(i) + ", " + vals[i] + ")\n";
		res+= "def " + name + ":= " + name + Integer.toString(vals.length);
		return res;
	}

	/**
	* Removes the fileName from a path
	* @param filename a path to a file
	* @return the path without the filename and its ending.
	*/
	protected static String pathComponent(String filename) {
		int i = filename.lastIndexOf('/');
		return (i > -1) ? filename.substring(0, i) : filename;
	}

	/**
	* Saves a string to a file.
	* @param filePath the path to write the string to
	* @param stringToSave the String that should be stored
	* @return false, if IOException. True otherwise
	*/
	private static boolean saveStringToFile(String filePath, String stringToSave){
		try {
			FileWriter fileWriter = new FileWriter(filePath);
			fileWriter.write(stringToSave);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}