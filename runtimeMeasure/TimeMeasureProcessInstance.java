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
	boolean hadErrorStreamContent = false;

	/**
	* Starts a process by the given command line argument
	* @command the command to start the process. Can be absolute or relative to this program.
	*/
	public TimeMeasureProcessInstance(String command) throws IOException {
		Process process = Runtime.getRuntime ().exec (command);

		stdin = process.getOutputStream ();  
		stderr = process.getErrorStream ();  
		stdout = process.getInputStream ();

		stdoutReader = new BufferedReader(new InputStreamReader(stdout));
		stderrReader = new BufferedReader(new InputStreamReader(stderr));
	}

	/**
	* Closes all streams to the program. Does not necessarily end the other program, but will lead to Exceptions in it.
	*/
	public void close() throws IOException{
		stdoutReader.close();
		stderrReader.close();
		stdin.close();
	}

	/**
	* Activates or deactives the debug output. If activated, all strings of stdout from the other program is printed.
	* @param nVal if false, the debug ouput is deactivated. Otherwise, it is activated.
	*/
	public void setDebugOutput(boolean nVal){
		debugOutput = nVal;
	}

	/**
	* Measures the time, that the other program took to answer to a string on the standard input stream.
	* @param stdinString the string to send to the program
	* @return the time the program took to respond in microseconds.
	*/
	public long timeToAnswer(String stdinString) throws IOException{
		byte[] byteArr = stdinString.getBytes();
		//time measure start
		long time1 = System.nanoTime();
		// write to stdin
		stdin.write(byteArr);
		stdin.flush();
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
		if (availableErr != 0){
			hadErrorStreamContent = true;
			System.out.println("stderr of TeSSLa has Content:");
		}
		while (stderr.available() != 0){
			String line = stderrReader.readLine();
			System.out.println("e: " + line);
		}
		if (availableOut != 0){
			String answer = stdoutReader.readLine();
			if (debugOutput || answer.contains("{final = true, value = false}")){
				System.out.println(answer);
			}
		}

		return time2-time1;

	}

	/**
	* Writes a string to the standard input stream, but doesn't wait for a response.
	* @param stdinString the string to write
	*/
	public void writeNoWait(String stdinString) throws IOException{
		stdin.write(stdinString.getBytes());
		stdin.flush();
	}

	/**
	* Checks, if there was any content on the standard error stream of the other program.
	* @return true, if there was any content on the standard error stream of the other program. Otherwise false.
	*/
	public boolean getHadErrorStreamContent(){
		return hadErrorStreamContent;
	}
}