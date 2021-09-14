import java.lang.Process
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.FileReader
import java.io.FileWriter
import java.util.concurrent.TimeUnit

object timeMeasureRunner {
	def main(args: Array[String]) : Unit ={
		runTADL2Burst("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Burst.scala", "measureTADL2Burst",
			"TimeMeasureTADL2BurstConstraint.tessla", "results/TADL2Burst.txt", 3, 10000, 20, 3)
	}
	
	def runTADL2Burst(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, burstLength: Int,
			maxOccurrences: Int) : Boolean = {
		// create the scala object
		println("preparing TADL2 BurstConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLBurst = new TimeMeasureScalaClassCreatorTADLBurst()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, burstLength, maxOccurrences)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmBurstConstraint : TimeMeasureBurstConstraint = new TimeMeasureBurstConstraint(burstLength, maxOccurrences)
		tmBurstConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName))
			return false
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala"))
			return false
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName))
			return false
		//run the measurements
		println("start measuring TADL2 BurstConstraint")
		if (!runCommand("scala " + "-cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def modifyTesslaMonitorFile (fileName: String) : Boolean = {
		var fileContent : String = ""
		try {
			//  read the content from the file
			var tesslaSpecFile: FileReader = new FileReader(fileName)
			while (tesslaSpecFile.ready())
				fileContent += tesslaSpecFile.read().toChar
			tesslaSpecFile.close()
		} catch {
			case e: IOException => {
				println(e.toString() + " in modifyTesslaMonitorFile while reading. The fileName was \"" + fileName + "\"")
				return false
			}
		}
		//modify content
		fileContent = fileContent.replaceFirst("object TesslaMonitor", "class TesslaMonitor")
		//write content to file
		try {
			//  read the content from the file
			var tesslaSpecFile: FileWriter = new FileWriter(fileName)
			tesslaSpecFile.write(fileContent)
			tesslaSpecFile.flush()
			tesslaSpecFile.close()
		} catch {
			case e: IOException => {
				println(e.toString() + " in modifyTesslaMonitorFile while writing")
				return false
			}
		}
		return true
	}
	
	def runCommand(command: String): Boolean = {
		runCommand(command, false)
	}

	def runCommand(command: String, debugOutput: Boolean): Boolean = {
		var gotError: Boolean = false
		if (debugOutput)
			println("runCommand(\"" + command + "\")")
		try {
			//println("command " + command + " start")
			var process: Process = Runtime.getRuntime ().exec (command);

			var stdin = process.getOutputStream ();  
			var stderr = process.getErrorStream ();  
			var stdout = process.getInputStream ();

			var stdoutReader = new BufferedReader(new InputStreamReader(stdout));
			var stderrReader = new BufferedReader(new InputStreamReader(stderr));
			
			while(process.isAlive()){
				if (debugOutput){
					while(stdout.available() != 0){
						println("o: " + stdoutReader.readLine());
					}
				}
				process.waitFor(100, TimeUnit.MILLISECONDS)
			}
			//process.waitFor();
			while (stderr.available() != 0){
				println("e: " + stderrReader.readLine());
				gotError = true
			}
			
			
			
			//println("command " + command + " error reading done")
		} catch {
			case e: IOException => {
				println(e.toString());
				return false
			}
			case e: InterruptedException => {
				println(e.toString());
				return false
			}
		}
		return !gotError
	}
}