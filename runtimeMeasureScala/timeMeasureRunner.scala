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
		def repetitionCount = 5
	
		runTADL2Burst("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Burst.scala", "measureTADL2Burst",
			"TimeMeasureTADL2BurstConstraint.tessla", "results/TADL2Burst.txt", repetitionCount, eventCount, 2000, 50, printInputEvents)
		runTADL2Delay("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Delay.scala", "measureTADL2Delay",
			"TimeMeasureTADL2DelayConstraint.tessla", "results/TADL2Delay.txt", repetitionCount, eventCount, 16, 50, 50, printInputEvents)
		runTADL2StrongDelay("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2StrongDelay.scala", "measureTADL2StrongDelay",
			"TimeMeasureTADL2StrongDelayConstraint.tessla", "results/TADL2StrongDelay.txt", repetitionCount, eventCount, 16, 50, 50, printInputEvents)
		runTADL2Repeat("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Repeat.scala", "measureTADL2Repeat",
			"TimeMeasureTADL2RepeatConstraint.tessla", "results/TADL2Repeat.txt", repetitionCount, eventCount, 500, 1000, 50, printInputEvents)
		runTADL2Repetition("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Repetition.scala", "measureTADL2Repetition",
			"TimeMeasureTADL2RepetitionConstraint.tessla", "results/TADL2Repetition.txt", repetitionCount, eventCount, 500, 900, 1, 250, printInputEvents)
		runTADL2Synchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Synchronization.scala", "measureTADL2Synchronization",
			"TimeMeasureTADL2SynchronizationConstraint.tessla", "results/TADL2Synchronization.txt", 
				repetitionCount,
				eventCount,
				2,	//tolerance
				16, 	//streamCount
				2,  //maxEventsPerClusterPerStream
				64, //minClusterDistance
				64, //maxClusterDistance
				printInputEvents)
		runTADL2StrongSynchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2StrongSynchronization.scala", "measureTADL2StrongSynchronization",
			"TimeMeasureTADL2StrongSynchronizationConstraint.tessla", "results/TADL2StrongSynchronization.txt", 
				repetitionCount,
				eventCount,
				2,	//tolerance
				16, 	//streamCount
				64, //minClusterDistance
				64, //maxClusterDistance
				printInputEvents)
		runTADL2ExecutionTime("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2ExecutionTime.scala", "measureTADL2ExecutionTime",
			"TimeMeasureTADL2ExecutionTimeConstraint.tessla", "results/TADL2ExecutionTime.txt", repetitionCount, eventCount, 500, 600, 50,50, 21, 100, printInputEvents)
		runTADL2Order("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Order.scala", "measureTADL2Order",
			"TimeMeasureTADL2OrderConstraint.tessla", "results/TADL2Order.txt", repetitionCount, eventCount, 50, 50, printInputEvents)
		runTADL2Sporadic("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Sporadic.scala", "measureTADL2Sporadic",
			"TimeMeasureTADL2SporadicConstraint.tessla", "results/TADL2Sporadic.txt", repetitionCount, eventCount, 500, 600, 11, 1, printInputEvents)
		runTADL2Periodic("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Periodic.scala", "measureTADL2Periodic",
			"TimeMeasureTADL2PeriodicConstraint.tessla", "results/TADL2Periodic.txt", repetitionCount, eventCount, 50, 5, 1, printInputEvents)
		runTADL2Pattern("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Pattern.scala", "measureTADL2Pattern",
			"TimeMeasureTADL2PatternConstraint.tessla", "results/TADL2Pattern.txt", repetitionCount, eventCount, 50, Array(1,2,3), 0, printInputEvents)
		runTADL2Arbitrary("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Arbitrary.scala", "measureTADL2Arbitrary",
			"TimeMeasureTADL2ArbitraryConstraint.tessla", "results/TADL2Arbitrary.txt", repetitionCount, eventCount, Array(40,80,120), Array(80,160,240), printInputEvents)
		runTADL2Reaction("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Reaction.scala", "measureTADL2Reaction",
			"TimeMeasureTADL2ReactionConstraint.tessla", "results/TADL2Reaction.txt", repetitionCount, eventCount, 500, 500, 64, printInputEvents)
		runTADL2Age("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2Age.scala", "measureTADL2Age",
			"TimeMeasureTADL2Age.Constraint.tessla", "results/TADL2Age.txt", repetitionCount, eventCount, 500, 500, 64, printInputEvents)
		runTADL2OutputSynchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2OutputSynchronization.scala", "measureTADL2OutputSynchronization",
			"TimeMeasureTADL2OutputSynchronizationConstraint.tessla", "results/TADL2OutputSynchronization.txt", 
				repetitionCount,
				eventCount,
				2,	//tolerance
				16, 	//streamCount
				2,  //maxEventsPerClusterPerStream
				64, //ClusterDistance
				printInputEvents)
		runTADL2InputSynchronization("../../tessla-assembly-1.2.3.jar", "tmp/", "measureTADL2InputSynchronization.scala", "measureTADL2InputSynchronization",
			"TimeMeasureTADL2InputSynchronizationConstraint.tessla", "results/TADL2InputSynchronization.txt", 
				repetitionCount,
				eventCount,
				2,	//tolerance
				16, 	//streamCount
				2,  //maxEventsPerClusterPerStream
				64, //ClusterDistance
				printInputEvents)
				
		runARPeriodicEventTriggering("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARPeriodic.scala", "measureARPeriodic",
			"TimeMeasureARPeriodicConstraint.tessla", "results/ARPeriodic.txt", repetitionCount, eventCount, 50, 5, 1, printInputEvents)
		runARSporadicEventTriggering("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARSporadic.scala", "measureARSporadic",
			"TimeMeasureARSporadicConstraint.tessla", "results/ARSporadic.txt", repetitionCount, eventCount, 11, 600, 500, printInputEvents)
		runARConcretePatternEventTriggering("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARConcretePattern.scala", "measureARConcretePattern",
			"TimeMeasureARConcretePatternConstraint.tessla", "results/ARConcretePattern.txt", repetitionCount, eventCount, Array(1,2,3), 1, 50, 50, printInputEvents)
		runARArbitrary("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARArbitrary.scala", "measureARArbitrary",
			"TimeMeasureARArbitraryConstraint.tessla", "results/ARArbitrary.txt", repetitionCount, eventCount, Array(40,80,120), Array(80,160, 240), printInputEvents)
		runARLatencyReaction("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARLatencyReaction.scala", "measureARLatencyReaction",
			"TimeMeasureARLatencyReaction.tessla", "results/ARLatencyReaction.txt", repetitionCount, eventCount, 500, 500, 64, printInputEvents)
		runARLatencyAge("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARLatencyAge.scala", "measureARLatencyAge",
			"TimeMeasureARLatencyAgeConstraint.tessla", "results/ARLatencyAge.txt", repetitionCount, eventCount, 500, 500, 64, printInputEvents)
		
		runARAge("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARAge.scala", "measureARAge",
			"TimeMeasureARAgeConstraint.tessla", "results/ARAge.txt", repetitionCount, eventCount, 100, 200, 64, printInputEvents)
			
		measureARSynchronizationConstraintEventsSingle("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARSynchroEventsSingle.scala", "measureARSynchroEventsSingle",
			"TimeMeasureARSynchroEventsSingleConstraint.tessla", "results/ARSynchroEventsSingle.txt", repetitionCount, eventCount, 16, 2, 64,  printInputEvents)
		
		measureARSynchronizationConstraintEventsMultiple("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARSynchroEventsMultiple.scala", "measureARSynchroEventsMultiple",
			"TimeMeasureARSynchroEventsMultipleConstraint.tessla", "results/ARSynchroEventsMultiple.txt", repetitionCount, eventCount, 16, 2, 64, 2, printInputEvents)
			
		measureARSynchronizationConstraintEventsResponse("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARSynchroResponse.scala", "measureARSynchroResponse",
			"TimeMeasureARSynchroResponse.tessla", "results/ARSynchroResponse.txt", 
				repetitionCount,
				eventCount,
				2,	//tolerance
				16, 	//streamCount
				2,  //maxEventsPerClusterPerStream
				64, //ClusterDistance
				printInputEvents)
		measureARSynchronizationConstraintEventsStimulus("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARSynchroStimulus.scala", "measureARSynchroStimulus",
			"TimeMeasureARSynchroStimulus.tessla", "results/ARSynchroStimulus.txt", 
				repetitionCount,
				eventCount,
				2,	//tolerance
				16, 	//streamCount
				2,  //maxEventsPerClusterPerStream
				64, //ClusterDistance
				printInputEvents)
		runAROffsetTiming("../../tessla-assembly-1.2.3.jar", "tmp/", "measureAROffsetTiming.scala", "measureAROffsetTiming",
			"measureAROffsetTimingConstraint.tessla", "results/AROffsetTiming.txt", repetitionCount, eventCount, 16, 50, 50, printInputEvents)
		
		runARExecutionOrderConstraintOrdinary("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARExecutionOrderConstraintOrdinary.scala", "measureARExecutionOrderConstraintOrdinary",
			"measureARExecutionOrderConstraintOrdinary.tessla", "results/ARExecutionOrderConstraintOrdinary.txt", repetitionCount, 20, 20, printInputEvents)
		
		runARExecutionOrderConstraintHierarchical("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARExecutionOrderConstraintHierarchical.scala", "measureARExecutionOrderConstraintHierarchical",
			"measureARExecutionOrderConstraintHierarchical.tessla", "results/ARExecutionOrderConstraintHierarchical.txt", repetitionCount, 4, 2, 20, printInputEvents)
			
		runARExecutionTimeNet("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARExecutionTimeNet.scala", "measureARExecutionTimeNet",
			"TimeMeasureARExecutionTimeNetConstraint.tessla", "results/ARExecutionTimeNet.txt", repetitionCount, eventCount, 500, 600, 50,50, 21, 100, printInputEvents)
			
		runARExecutionTimeGross("../../tessla-assembly-1.2.3.jar", "tmp/", "measureARExecutionTimeGross.scala", "measureARExecutionTimeGross",
			"TimeMeasureARExecutionTimeGrossConstraint.tessla", "results/ARExecutionTimeGross.txt", repetitionCount, eventCount, 500, 600, printInputEvents)
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
	
	def runARPeriodicEventTriggering(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, period: Int, jitter: Int,
			minimum: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing AR PeriodicEventTriggering")
		var creator: TimeMeasureScalaClassCreatorARPeriodicEventTriggering = new TimeMeasureScalaClassCreatorARPeriodicEventTriggering()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, period, jitter, minimum, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmPeriodicConstraint : TimeMeasureARPeriodicEventTriggering = new TimeMeasureARPeriodicEventTriggering(period, jitter, minimum)
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
		println("start measuring AR PeriodicEventTriggering")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runARSporadicEventTriggering(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, jitter: Int,
			maxInterArrivalTime: Int, period: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing AR SporadicEventTriggering")
		var creator: TimeMeasureScalaClassCreatorARSporadicEventTriggering =
			new TimeMeasureScalaClassCreatorARSporadicEventTriggering()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, jitter, maxInterArrivalTime, period, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmSporadicConstraint : TimeMeasureARSporadicEventTriggering = new TimeMeasureARSporadicEventTriggering(jitter,
				maxInterArrivalTime, period)
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
		println("start measuring AR SporadicEventTriggering")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runARConcretePatternEventTriggering(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, offset: Array[Int],
			patternJitter: Int, patternLength: Int, patternPeriod: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing AR ARConcretePatternEventTriggering")
		var creator: TimeMeasureScalaClassCreatorARConcretePatternEventTriggering =
			new TimeMeasureScalaClassCreatorARConcretePatternEventTriggering()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, offset, patternJitter, patternLength, patternPeriod, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmConcretePatternConstraint : TimeMeasureARConcretePatternEventTriggering =
			new TimeMeasureARConcretePatternEventTriggering(patternPeriod, offset, patternJitter)
		tmConcretePatternConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring ARConcretePatternEventTriggering")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runARArbitrary(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, minimum: Array[Int], 
			maximum: Array[Int], printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARArbitraryEventTriggeringConstraint")
		var creator: TimeMeasureScalaClassCreatorARArbitrary = new TimeMeasureScalaClassCreatorARArbitrary()
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
		println("start measuring AR ArbitraryEventTriggeringConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runARLatencyReaction(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, minimum: Int, 
			maximum: Int, stimulusDistance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARLatency Type Reaction")
		var creator: TimeMeasureScalaClassCreatorARLatency = new TimeMeasureScalaClassCreatorARLatency()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, false, minimum, maximum, stimulusDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmReactionConstraint : TimeMeasureARLatencyTimingConstraint = new TimeMeasureARLatencyTimingConstraint(false,
			minimum, maximum, stimulusDistance, stimulusDistance)
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
		println("start measuring ARLatency Type Reaction")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runARLatencyAge(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, minimum: Int, 
			maximum: Int, stimulusDistance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARLatency Type  Age")
		var creator: TimeMeasureScalaClassCreatorARLatency = new TimeMeasureScalaClassCreatorARLatency()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, true, minimum, maximum, stimulusDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmAgeConstraint : TimeMeasureARLatencyTimingConstraint = new TimeMeasureARLatencyTimingConstraint(true, minimum,
			maximum, stimulusDistance, stimulusDistance)
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
		println("start measuring ARLatency Type  Age")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runARAge(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, minimum: Int, 
			maximum: Int, distance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARAgeConstraint")
		var creator: TimeMeasureScalaClassCreatorARAge = new TimeMeasureScalaClassCreatorARAge()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, minimum, maximum, distance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmAgeConstraint : TimeMeasureARAgeConstraint = new TimeMeasureARAgeConstraint(minimum, maximum,
			distance, distance)
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
		println("start measuring ARAgeConstraint")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def measureARSynchronizationConstraintEventsSingle(tesslaJarFile: String, tmpPath: String, scalaFileName: String,
			scalaObjectName: String, tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int,
			numStreams: Int, tolerance: Int, clusterDistance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARSynchronizationConstraintEventsSingle")
		var creator: TimeMeasureScalaClassCreatorARSynchronizationEventsSingle =
			new TimeMeasureScalaClassCreatorARSynchronizationEventsSingle()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount,tolerance, numStreams, clusterDistance, clusterDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmSynchroConstraint : TimeMeasureARSynchronizationConstraintEventsSingle =
			new TimeMeasureARSynchronizationConstraintEventsSingle(tolerance, numStreams, clusterDistance, clusterDistance)
		tmSynchroConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring ARSynchronizationConstraintEventsSingle")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def measureARSynchronizationConstraintEventsMultiple(tesslaJarFile: String, tmpPath: String, scalaFileName: String,
			scalaObjectName: String, tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int,
			numStreams: Int, tolerance: Int, clusterDistance: Int, maxEventPerClusterPerStream: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARSynchronizationConstraintEventsMultiple")
		var creator: TimeMeasureScalaClassCreatorARSynchronizationEventsMultiple =
			new TimeMeasureScalaClassCreatorARSynchronizationEventsMultiple()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount,tolerance, numStreams, clusterDistance, clusterDistance, maxEventPerClusterPerStream,
				printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmSynchroConstraint : TimeMeasureARSynchronizationConstraintEventsMultiple =
			new TimeMeasureARSynchronizationConstraintEventsMultiple(tolerance, numStreams, maxEventPerClusterPerStream,
				clusterDistance, clusterDistance)
		tmSynchroConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring ARSynchronizationConstraintEventsMultiple")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def measureARSynchronizationConstraintEventsResponse(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, tolerance: Int,
			streamCount: Int, maxEventsPerClusterPerStream: Int, clusterDistance: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARSynchronizationResponse")
		var creator: TimeMeasureScalaClassCreatorARSynchronizationResponse = new TimeMeasureScalaClassCreatorARSynchronizationResponse()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, tolerance, streamCount, maxEventsPerClusterPerStream, clusterDistance, clusterDistance,
				printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmOutputSynchronizationConstraint : TimeMeasureARSynchronizationConstraintResponse =
			new TimeMeasureARSynchronizationConstraintResponse(streamCount, clusterDistance, tolerance)
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
		println("start measuring ARSynchronizationResponse")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def measureARSynchronizationConstraintEventsStimulus(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, tolerance: Int,
			streamCount: Int, maxEventsPerClusterPerStream: Int, clusterDistance: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARSynchronizationStimulus")
		var creator: TimeMeasureScalaClassCreatorARSynchronizationStimulus = new TimeMeasureScalaClassCreatorARSynchronizationStimulus()
		//creator.setStreamCount(streamCount)
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, tolerance, streamCount, maxEventsPerClusterPerStream, clusterDistance, clusterDistance,
				printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmOutputSynchronizationConstraint : TimeMeasureARSynchronizationConstraintStimulus =
			new TimeMeasureARSynchronizationConstraintStimulus(streamCount, clusterDistance, tolerance)
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
		println("start measuring ARSynchronizationStimulus")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runAROffsetTiming(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, sourceDistance: Int,
			lower: Int, upper: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing AROffsetTiming")
		var creator: TimeMeasureScalaClassCreatorAROffsetTimingConstraint = new TimeMeasureScalaClassCreatorAROffsetTimingConstraint()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, lower, upper, sourceDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmOffsetTimingConstraint : TimeMeasureOffsetTimingConstraint = new TimeMeasureOffsetTimingConstraint(lower, upper, sourceDistance)
		tmOffsetTimingConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring AROffsetTiming")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runARExecutionOrderConstraintOrdinary(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, eventDistance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARExecutionOrderConstraintOrdinary")
		var creator: TimeMeasureScalaClassCreatorARExecutionOrderConstraintOrdinary = new TimeMeasureScalaClassCreatorARExecutionOrderConstraintOrdinary()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount, eventDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmExecOrderConstraint : TimeMeasureARExecutionOrderConstraint = new TimeMeasureARExecutionOrderConstraint(eventCount, eventDistance)
		tmExecOrderConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring ARExecutionOrderConstraintOrdinary")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runARExecutionOrderConstraintHierarchical(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, height: Int, width: Int, eventDistance: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARExecutionOrderConstraintHierarchical")
		var creator: TimeMeasureScalaClassCreatorARExecutionOrderConstraintHierarchical = new TimeMeasureScalaClassCreatorARExecutionOrderConstraintHierarchical()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				height, width, eventDistance, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmExecOrderConstraint : TimeMeasureARExecutionOrderConstraint = new TimeMeasureARExecutionOrderConstraint(eventDistance, height, width)
		tmExecOrderConstraint.generateTeSSLaFile(tmpPath + tesslaFileName)
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
		println("start measuring ARExecutionOrderConstraintHierarchical")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true))
			return false
		return true
	}
	
	def runARExecutionTimeNet(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, lower: Int, upper: Int,
			minDistance: Int, maxDistance: Int, numPreemptions: Int, preemptLength: Int, printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARExecutionTimeNet")
		var creator: TimeMeasureScalaClassCreatorARExecutionTimeNet = new TimeMeasureScalaClassCreatorARExecutionTimeNet()
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount,lower, upper, minDistance, maxDistance, numPreemptions, preemptLength, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmExecutionTimeConstraint : TimeMeasureARExecutionTimeConstraintNet = new TimeMeasureARExecutionTimeConstraintNet(lower, upper)
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
		println("start measuring ARExecutionTimeNet")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
		return true
	}
	
	def runARExecutionTimeGross(tesslaJarFile: String, tmpPath: String, scalaFileName: String, scalaObjectName: String,
			tesslaFileName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int, lower: Int, upper: Int,
			printInputEvents: Boolean) : Boolean = {
		// create the scala object
		println("preparing ARExecutionTimeGross")
		var creator: TimeMeasureScalaClassCreatorARExecutionTimeGross = new TimeMeasureScalaClassCreatorARExecutionTimeGross()
		//(scalaFilePath: String, scalaObjectName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int,
		//	lower: Int, upper: Int, minDistance: Int, maxDistance: Int, numPreemptions: Int, preemptLength: Int, printInputEvents: Boolean)
		if (!creator.generateEntireObject(tmpPath + scalaFileName, scalaObjectName, resultFilePath, repetitionCount,
				eventCount,lower, upper, printInputEvents)) {
			println("Could not create " + tmpPath + scalaFileName)
			return false
		}
		// create and compile the tessla specification
		var tmExecutionTimeConstraint : TimeMeasureARExecutionTimeConstraintGross = new TimeMeasureARExecutionTimeConstraintGross(lower, upper)
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
		println("start measuring ARExecutionTimeGross")
		if (!runCommand("scala " + "-d " + tmpPath + " -cp " + tmpPath + ":./ " + scalaObjectName, true)){
			println("Command crashed: " + "scala " + " -cp " + tmpPath + ":./ " + scalaObjectName)
			return false
		}
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