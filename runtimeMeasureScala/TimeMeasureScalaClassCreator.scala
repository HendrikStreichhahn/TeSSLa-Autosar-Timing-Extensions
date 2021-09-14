import java.io._

abstract class TimeMeasureScalaClassCreator {
	//private var className: String = ""
	//var filePath: String = ""

	protected def generateMainMethod(writer: FileWriter, prevTabCount: Int, repetitionCount: Int, resultFilePath: String): Unit = {
		writer.write(tabs(prevTabCount) + "def main(args: Array[String]): Unit = {" + "\n")
		writer.write(tabs(prevTabCount+1) + "generateTrace()" + "\n")
		writer.write(tabs(prevTabCount+1) + "measureMultiple(" + repetitionCount + ", \"" + resultFilePath + "\")" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
	
	protected def generateMemberVariableListGeneral(writer: FileWriter, prevTabCount: Int, eventCount: Int) : Unit = {
		writer.write(tabs(prevTabCount) + "var eventCount: Int = " + eventCount + "\n")
		writer.write(tabs(prevTabCount) + "var tesslaMonitorInstance : TesslaMonitor = null" + "\n")
	}
	
	protected def generateMeasureConstraint(writer: FileWriter, prevTabCount: Int) : Unit = {
		writer.write(tabs(prevTabCount) + "def measureConstraint() : (Long, Long, Long) = {" + "\n")
		writer.write(tabs(prevTabCount+1) + "var min = Long.MaxValue" + "\n")
		writer.write(tabs(prevTabCount+1) + "var max = Long.MinValue" + "\n")
		writer.write(tabs(prevTabCount+1) + "var avg = 0L" + "\n")
		writer.write(tabs(prevTabCount+1) + "var eventCounter = 0" + "\n")
		
		
		writer.write(tabs(prevTabCount+1) + "tesslaMonitorInstance = new TesslaMonitor()" + "\n")
		writer.write(tabs(prevTabCount+1) + "tesslaMonitorInstance.out_constraint = outputFunc" + "\n")
		writer.write(tabs(prevTabCount+1) + "var currentEvents: Array[Event] = traceSet.getNextTimestampsEvents();" + "\n")
		writer.write(tabs(prevTabCount+1) + "var ctr = 0" + "\n")
		writer.write(tabs(prevTabCount+1) + "while (currentEvents.length != 0) {" + "\n")
		generateMeasureConstraintWriteEvents(writer, prevTabCount+2)
		writer.write(tabs(prevTabCount+2) + "var time1= System.nanoTime()" + "\n")
		writer.write(tabs(prevTabCount+2) + "tesslaMonitorInstance.flush();" + "\n")
		writer.write(tabs(prevTabCount+2) + "var time2= System.nanoTime" + "\n")
		writer.write(tabs(prevTabCount+2) + "var timeEvent = time2-time1" + "\n")
		writer.write(tabs(prevTabCount+2) + "min = if (timeEvent < min) timeEvent else min" + "\n")
		writer.write(tabs(prevTabCount+2) + "max = if (timeEvent > max) timeEvent else max" + "\n")
		writer.write(tabs(prevTabCount+2) + "avg += timeEvent" + "\n")
		writer.write(tabs(prevTabCount+2) + "currentEvents = traceSet.getNextTimestampsEvents();" + "\n")
		writer.write(tabs(prevTabCount+2) + "ctr = ctr+1" + "\n")
		writer.write(tabs(prevTabCount+1) + "}" + "\n")
		writer.write(tabs(prevTabCount+1) + "traceSet.resetOutputCounter()" + "\n")
		writer.write(tabs(prevTabCount+1) + "(min, max, avg / eventCounter)" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
	
	protected def generateMeasureConstraintWriteEvents(writer: FileWriter, prevTabCount: Int) : Unit
	
	protected def generateMeasureMultiple(writer: FileWriter, prevTabCount: Int): Unit = {
		writer.write(tabs(prevTabCount) + "def measureMultiple(count: Int, resultFilePath: String) : Unit = {" + "\n")
		writer.write(tabs(prevTabCount + 1) + "var results: Array[(Long, Long, Long)] = new Array[(Long, Long, Long)](count)" + "\n")
		writer.write(tabs(prevTabCount + 1) + "for (i <- 0 to count-1){" + "\n")
		writer.write(tabs(prevTabCount + 2) + "println(\"Measure \" + (i+1) + \" of \" + count)" + "\n")
		writer.write(tabs(prevTabCount + 2) + "var result = measureConstraint()" + "\n")
		writer.write(tabs(prevTabCount + 2) + "results(i) = result" + "\n")
		writer.write(tabs(prevTabCount + 1) + "}" + "\n")
		writer.write(tabs(prevTabCount + 1) + "if (!storeResultsToFile(results, resultFilePath))" + "\n")
		writer.write(tabs(prevTabCount + 2) + "println(\"Cannot write results to \" + resultFilePath);" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
	
	protected def generateStoreResultsToFile(writer: FileWriter, prevTabCount: Int) : Unit = {
		writer.write(tabs(prevTabCount) + "def storeResultsToFile(measures: Array[(Long, Long, Long)], filePath: String) : Boolean = {" + "\n")
		writer.write(tabs(prevTabCount + 1) + "try{" + "\n")
		writer.write(tabs(prevTabCount + 2) + "var fileWriter = new FileWriter(filePath)" + "\n")
		writer.write(tabs(prevTabCount + 2) + "fileWriter.write(\"(min, max, average) of the run times per event in the individual runs.\\n\")" + "\n")
		writer.write(tabs(prevTabCount + 2) + "var averageVals = average(measures)" + "\n")
		writer.write(tabs(prevTabCount + 2) + "fileWriter.write(\"overallAverage: (\" + averageVals._1/1000 + \", \" + averageVals._2/1000 + \", \" + averageVals._3/1000 + \"\\n)\")" + "\n")
		writer.write(tabs(prevTabCount + 2) + "for (i <- 0 to measures.length-1) {" + "\n")
		writer.write(tabs(prevTabCount + 3) + "fileWriter.write(\"measure \" + i+1 + \" of \" + (measures.length) + \": (\" + measures(i)._1/1000 + \", \" + measures(i)._2/1000 + \", \" + measures(i)._3/1000+ \"\\n\")" + "\n")
		writer.write(tabs(prevTabCount + 2) + "}" + "\n")
		writer.write(tabs(prevTabCount + 2) + "fileWriter.close()" + "\n")
		writer.write(tabs(prevTabCount + 1) + "} catch {" + "\n")
		writer.write(tabs(prevTabCount + 2) + "case e: IOException => return false" + "\n")
		writer.write(tabs(prevTabCount + 1) + "}" + "\n")
		writer.write(tabs(prevTabCount + 1) + "return true" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
	
	protected def generateAverage(writer: FileWriter, prevTabCount: Int) : Unit = {
		writer.write(tabs(prevTabCount) + "def average(measures: Array[(Long, Long, Long)]): (Long, Long, Long) = {" + "\n")
		writer.write(tabs(prevTabCount + 1) + "var results = (0L, 0L, 0L)" + "\n")
		writer.write(tabs(prevTabCount + 1) + "for (i <- 0 to measures.length-1){" + "\n")
		writer.write(tabs(prevTabCount + 2) + "results = (results._1 + measures(i)._1," + "\n")
		writer.write(tabs(prevTabCount + 5) + "results._2 + measures(i)._2," + "\n")
		writer.write(tabs(prevTabCount + 5) + "results._3 + measures(i)._3)" + "\n")
		writer.write(tabs(prevTabCount + 1) + "}" + "\n")
		writer.write(tabs(prevTabCount + 1) + "return (results._1 / measures.length," + "\n")
		writer.write(tabs(prevTabCount + 4) + "results._2 / measures.length," + "\n")
		writer.write(tabs(prevTabCount + 4) + "results._3 / measures.length)" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
	
	protected def generateOutputFunc(writer: FileWriter, prevTabCount: Int) : Unit = {
		writer.write(tabs(prevTabCount) + "def outputFunc(value: (Boolean, Boolean), timestamp: Long, name: String, error: Throwable) : Unit = {" + "\n")
		writer.write(tabs(prevTabCount+1) + "if (error != null){" + "\n")
		writer.write(tabs(prevTabCount+2) + "println(\"An Error occurred at timestamp \" + timestamp + \": \" + error.getMessage());" + "\n")
		writer.write(tabs(prevTabCount+1) + "} else {" + "\n")
		writer.write(tabs(prevTabCount+2) + "if (value == (true, false))" + "\n")
		writer.write(tabs(prevTabCount+3) + "println(\"Error! Invalid Output!\");" + "\n")
		writer.write(tabs(prevTabCount+1) + "}" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
	
	protected def tabs(tabCount: Int): String = {
		var res: String = ""
		for (i <- 1 to tabCount)
			res += "\t"
		res
	}
}