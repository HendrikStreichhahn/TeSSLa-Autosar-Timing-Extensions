import java.lang.Process
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.FileReader
import java.io.FileWriter
import java.util.concurrent.TimeUnit

object timeMeasureRunner {
	def main(args: Array[String]) : Unit ={
		def printInputEvents: Boolean = false
		
		def eventCount = 250000
		def repetitionCount = 20
	
		runTADL2Burst("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Burst.scala", "measureTADL2Burst",
			"TimeMeasureTADL2BurstConstraint.tessla", "results/TADL2Burst.txt", repetitionCount, eventCount, 2000, 50, printInputEvents)
		runTADL2Delay("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Delay.scala", "measureTADL2Delay",
			"TimeMeasureTADL2DelayConstraint.tessla", "results/TADL2Delay.txt", repetitionCount, eventCount, 1, 50, 50, printInputEvents)
		runTADL2StrongDelay("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2StrongDelay.scala", "measureTADL2StrongDelay",
			"TimeMeasureTADL2StrongDelayConstraint.tessla", "results/TADL2StrongDelay.txt", repetitionCount, eventCount, 1, 50, 50, printInputEvents)
		runTADL2Repeat("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Repeat.scala", "measureTADL2Repeat",
			"TimeMeasureTADL2RepeatConstraint.tessla", "results/TADL2Repeat.txt", repetitionCount, eventCount, 500, 1000, 50, printInputEvents)
		runTADL2Repetition("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Repetition.scala", "measureTADL2Repetition",
			"TimeMeasureTADL2RepetitionConstraint.tessla", "results/TADL2Repetition.txt", repetitionCount, eventCount, 10, 10, 1, 0, printInputEvents)
//Synchronization und Strongsynchronization gefühlt zu schnell
		runTADL2Synchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Synchronization.scala", "measureTADL2Synchronization",
			"TimeMeasureTADL2SynchronizationConstraint.tessla", "results/TADL2Synchronization.txt", 
				repetitionCount,
				eventCount,
				5,	//tolerance
				3, 	//streamCount
				1,  //maxEventsPerClusterPerStream
				15, //minClusterDistance
				16, //maxClusterDistance
				printInputEvents)
		runTADL2StrongSynchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2StrongSynchronization.scala", "measureTADL2StrongSynchronization",
			"TimeMeasureTADL2StrongSynchronizationConstraint.tessla", "results/TADL2StrongSynchronization.txt", 
				repetitionCount,
				eventCount,
				5,	//tolerance
				3, 	//streamCount
				15, //minClusterDistance
				15, //maxClusterDistance
				printInputEvents)
		//ExecutionTimeConstraint
		runTADL2ExecutionTime("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2ExecutionTime.scala", "measureTADL2ExecutionTime",
			"TimeMeasureTADL2ExecutionTimeConstraint.tessla", "results/TADL2ExecutionTime.txt", repetitionCount, eventCount, 100, 200, 50,50, 1, 100, printInputEvents)
		runTADL2Order("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Order.scala", "measureTADL2Order",
			"TimeMeasureTADL2OrderConstraint.tessla", "results/TADL2Order.txt", repetitionCount, eventCount, 50, 50, printInputEvents)
		runTADL2Sporadic("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Sporadic.scala", "measureTADL2Sporadic",
			"TimeMeasureTADL2SporadicConstraint.tessla", "results/TADL2Sporadic.txt", repetitionCount, eventCount, 500, 600, 1, 1, printInputEvents)
		runTADL2Periodic("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Periodic.scala", "measureTADL2Periodic",
			"TimeMeasureTADL2PeriodicConstraint.tessla", "results/TADL2Periodic.txt", repetitionCount, eventCount, 25, 0, 1, printInputEvents)
		runTADL2Pattern("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Pattern.scala", "measureTADL2Pattern",
			"TimeMeasureTADL2PatternConstraint.tessla", "results/TADL2Pattern.txt", repetitionCount, eventCount, 50, Array(1,2,3,4,5), 0, printInputEvents)
		runTADL2Arbitrary("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Arbitrary.scala", "measureTADL2Arbitrary",
			"TimeMeasureTADL2ArbitraryConstraint.tessla", "results/TADL2Arbitrary.txt", repetitionCount, eventCount, Array(1,2,3,4,5), Array(1,2,3,4,5), printInputEvents)
		
		runTADL2Reaction("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Reaction.scala", "measureTADL2Reaction",
			"TimeMeasureTADL2ReactionConstraint.tessla", "results/TADL2Reaction.txt", repetitionCount, eventCount, 50, 50, 25, printInputEvents)
			
		runTADL2Age("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Age.scala", "measureTADL2Age",
			"TimeMeasureTADL2Age.Constraint.tessla", "results/TADL2Age.txt", repetitionCount, eventCount, 50, 50, 25, printInputEvents)
		
		runTADL2OutputSynchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2OutputSynchronization.scala", "measureTADL2OutputSynchronization",
			"TimeMeasureTADL2OutputSynchronizationConstraint.tessla", "results/TADL2OutputSynchronization.txt", 
				repetitionCount,
				eventCount,
				5,	//tolerance
				3, 	//streamCount
				1,  //maxEventsPerClusterPerStream
				15, //ClusterDistance
				printInputEvents)
		
		runTADL2InputSynchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2InputSynchronization.scala", "measureTADL2InputSynchronization",
			"TimeMeasureTADL2InputSynchronizationConstraint.tessla", "results/TADL2InputSynchronization.txt", 
				repetitionCount,
				eventCount,
				5,	//tolerance
				3, 	//streamCount
				1,  //maxEventsPerClusterPerStream
				15, //ClusterDistance
				printInputEvents)
	}
	
	def runTADL2Delay(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, sourceDistance: Int,
			lower: Int, upper: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 DelayConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLDelay = new TimeMeasureScalaClassCreatorTADLDelay()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, lower, upper, sourceDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmDelayConstraint : TimeMeasureDelayConstraint = new TimeMeasureDelayConstraint(lower, upper, sourceDistance)
		tmDelayConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 DelayConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
			
	}
	
	def runTADL2StrongDelay(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, sourceDistance: Int,
			lower: Int, upper: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 StrongDelayConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLStrongDelay = new TimeMeasureScalaClassCreatorTADLStrongDelay()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, lower, upper, sourceDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmDelayConstraint : TimeMeasureStrongDelayConstraint = new TimeMeasureStrongDelayConstraint(lower, upper, sourceDistance)
		tmDelayConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 StrongDelayConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
			
	}
	
	def runTADL2Repeat(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, lower: Int,
			upper: Int, span: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 RepeatConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLRepeat = new TimeMeasureScalaClassCreatorTADLRepeat()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, lower, upper, span, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmRepeatConstraint : TimeMeasureRepeatConstraint = new TimeMeasureRepeatConstraint(lower, upper, span)
		tmRepeatConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 RepeatConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runTADL2Repetition(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, lower: Int,
			upper: Int, span: Int, jitter: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 RepetitionConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLRepetition = new TimeMeasureScalaClassCreatorTADLRepetition()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, lower, upper, span, jitter, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmRepetitionConstraint : TimeMeasureRepetitionConstraint =
			new TimeMeasureRepetitionConstraint(lower, upper, span, jitter)
		tmRepetitionConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 RepetitionConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runTADL2Synchronization(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, tolerance: Int,
			streamCount: Int, maxEventsPerClusterPerStream: Int, minClusterDistance: Int, maxClusterDistance: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 SynchronizationConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLSynchronization = new TimeMeasureScalaClassCreatorTADLSynchronization()
		//creator.setStreamCount(streamCount)
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, tolerance, streamCount, maxEventsPerClusterPerStream, minClusterDistance, maxClusterDistance,
				printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmSynchronizationConstraint : TimeMeasureSynchronizationConstraint =
			new TimeMeasureSynchronizationConstraint(tolerance, streamCount, maxEventsPerClusterPerStream,
				minClusterDistance, maxClusterDistance)
		tmSynchronizationConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 SynchronizationConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runTADL2StrongSynchronization(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, tolerance: Int,
			streamCount: Int, minClusterDistance: Int, maxClusterDistance: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 StrongSynchronizationConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLStrongSynchronization = new TimeMeasureScalaClassCreatorTADLStrongSynchronization()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, tolerance, streamCount, minClusterDistance, maxClusterDistance,
				printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmStrongSynchronizationConstraint : TimeMeasureStrongSynchronizationConstraint =
			new TimeMeasureStrongSynchronizationConstraint(tolerance, streamCount,
				minClusterDistance, maxClusterDistance)
		tmStrongSynchronizationConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 StrongSynchronizationConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runTADL2ExecutionTime(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, lower: Int, upper: Int,
			minDistance: Int, maxDistance: Int, numPreemptions: Int, preemptLength: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 ExecutionTime")
		var creator: TimeMeasureScalaClassCreatorTADLExecutionTime = new TimeMeasureScalaClassCreatorTADLExecutionTime()
		//(scalaFilePath: String, scalaObjectName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int,
		//	lower: Int, upper: Int, minDistance: Int, maxDistance: Int, numPreemptions: Int, preemptLength: Int, printInputEvents: Boolean)
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount,lower, upper, minDistance, maxDistance, numPreemptions, preemptLength, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmExecutionTimeConstraint : TimeMeasureExecutionTimeConstraint = new TimeMeasureExecutionTimeConstraint(lower, upper)
		tmExecutionTimeConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 ExecutionTimeConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2Order(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int,
			maxDistSource: Int, maxDistSourceTarget: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 Order")
		var creator: TimeMeasureScalaClassCreatorTADLOrder = new TimeMeasureScalaClassCreatorTADLOrder()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, maxDistSource, maxDistSourceTarget, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmOrderConstraint : TimeMeasureOrderConstraint = new TimeMeasureOrderConstraint()
		tmOrderConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 OrderConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2Sporadic(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, lower: Int, upper: Int,
			jitter: Int, minimum: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 SporadicConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLSporadic = new TimeMeasureScalaClassCreatorTADLSporadic()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, lower, upper, jitter, minimum, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmSporadicConstraint : TimeMeasureSporadicConstraint = new TimeMeasureSporadicConstraint(lower, upper, jitter)
		tmSporadicConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 SporadicConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2Periodic(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, period: Int, jitter: Int,
			minimum: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 PeriodicConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLPeriodic = new TimeMeasureScalaClassCreatorTADLPeriodic()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, period, jitter, minimum, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmPeriodicConstraint : TimeMeasurePeriodicConstraint = new TimeMeasurePeriodicConstraint(period, jitter)
		tmPeriodicConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 PeriodicConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2Pattern(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, period: Int, offset: Array[Int], 
			jitter: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 PatternConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLPattern = new TimeMeasureScalaClassCreatorTADLPattern()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, period, offset, jitter, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmPatternConstraint : TimeMeasurePatternConstraint = new TimeMeasurePatternConstraint(period, offset, jitter)
		tmPatternConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 PatternConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2Arbitrary(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, minimum: Array[Int], 
			maximum: Array[Int], printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2ArbitraryConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLArbitrary = new TimeMeasureScalaClassCreatorTADLArbitrary()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, minimum, maximum, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmArbitraryConstraint : TimeMeasureArbitraryConstraint = new TimeMeasureArbitraryConstraint(minimum, maximum)
		tmArbitraryConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 ArbitraryConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}

	def runTADL2Burst(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, burstLength: Int,
			maxOccurrences: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 BurstConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLBurst = new TimeMeasureScalaClassCreatorTADLBurst()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, burstLength, maxOccurrences, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmBurstConstraint : TimeMeasureBurstConstraint = new TimeMeasureBurstConstraint(burstLength, maxOccurrences)
		tmBurstConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 BurstConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2Reaction(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, minimum: Int, 
			maximum: Int, stimulusDistance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2ReactionConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLReaction = new TimeMeasureScalaClassCreatorTADLReaction()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, minimum, maximum, stimulusDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmReactionConstraint : TimeMeasureReactionConstraint = new TimeMeasureReactionConstraint(minimum, maximum,
			stimulusDistance, stimulusDistance)
		tmReactionConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 ReactionConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2Age(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, minimum: Int, 
			maximum: Int, stimulusDistance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2AgeConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLAge = new TimeMeasureScalaClassCreatorTADLAge()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, minimum, maximum, stimulusDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmAgeConstraint : TimeMeasureAgeConstraint = new TimeMeasureAgeConstraint(minimum, maximum,
			stimulusDistance, stimulusDistance)
		tmAgeConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
		if (!runCommand("java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)){
			println("Command crashed: " + "java -jar " + tesslaJarFile + " compile -n -o " + tmpPath + tesslaFileName + ".scala " + tmpPath + tesslaFileName)
			return false
		}
		if (!modifyTesslaMonitorFile(tmpPath + tesslaFileName + ".scala"))
			return false
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + "./:" + tmpPath + " " + tmpPath+tesslaFileName + ".scala")
			return false
		}
		//compile the scala files
		if (!runCommand("scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)){
			println("Command crashed: " + "scalac " + "-d " + tmpPath + " -cp " + tmpPath + ":./" + " " + tmpPath+scalaFileName)
			return false
		}
		//run the measurements
		println("start measuring TADL2 AgeConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runTADL2OutputSynchronization(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, tolerance: Int,
			streamCount: Int, maxEventsPerClusterPerStream: Int, clusterDistance: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 OutputSynchronizationConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLOutputSynchronization = new TimeMeasureScalaClassCreatorTADLOutputSynchronization()
		//creator.setStreamCount(streamCount)
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, tolerance, streamCount, maxEventsPerClusterPerStream, clusterDistance, clusterDistance,
				printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmOutputSynchronizationConstraint : TimeMeasureOutputSynchronizationConstraint =
			new TimeMeasureOutputSynchronizationConstraint(streamCount, clusterDistance, tolerance)
		tmOutputSynchronizationConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 OutputSynchronizationConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runTADL2InputSynchronization(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, tolerance: Int,
			streamCount: Int, maxEventsPerClusterPerStream: Int, clusterDistance: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing TADL2 InputSynchronizationConstraint")
		var creator: TimeMeasureScalaClassCreatorTADLInputSynchronization = new TimeMeasureScalaClassCreatorTADLInputSynchronization()
		//creator.setStreamCount(streamCount)
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, tolerance, streamCount, maxEventsPerClusterPerStream, clusterDistance, clusterDistance,
				printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmInputSynchronizationConstraint : TimeMeasureInputSynchronizationConstraint =
			new TimeMeasureInputSynchronizationConstraint(streamCount, clusterDistance, tolerance)
		tmInputSynchronizationConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring TADL2 InputSynchronizationConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
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
		runCommand(command, true)
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
					var ctr : Int = 0
					while(stdout.available() != 0)
						println("o: " + stdoutReader.readLine());
				}
				while (stderr.available() != 0){
					println("e: " + stderrReader.readLine());
					gotError = true
				}
				process.waitFor(100, TimeUnit.MILLISECONDS)
			}
			//print output, that occured between waiting and process ending
			if (debugOutput){
				var ctr : Int = 0
				while(stdoutReader.ready())
					println("o: " + stdoutReader.readLine());
			}
			while(stdoutReader.ready()){
				println("e: " + stderrReader.readLine());
				gotError = true
			}
		} catch {
			case e: IOException => {
				println("IOException in runCommand: " + e.toString());
				return false
			}
			case e: InterruptedException => {
				println("InterruptedException in runCommand: " + e.toString());
				return false
			}
		}
		if (gotError)
			println("runCommand: an error occurred")
		return !gotError
	}
}