import java.io._

object TimeMeasureTADLBurst {
		
	var eventCount 		: Int = 1000000
	var burstLength		: Int = 10
	var maxOccurrences	: Int = 3
	
	var traceSet: BurstConstraintGenerator = null
	
	var tesslaBurstMonitor : TesslaMonitorClass = null

	/**
	* @param args Command line arguments of the file.
	*/
	def main(args: Array[String]): Unit = {
		generateTrace()
		measureMultiple(2, "burstTestOutput.txt")
		//traceSet.saveToFile("burstTest.trace")
	}
	
	def generateTrace(): Boolean = {
		tesslaBurstMonitor = new TesslaMonitorClass()
		traceSet = new BurstConstraintGenerator()
		var res: Boolean = traceSet.generateTestTrace(eventCount, burstLength, maxOccurrences)
		if (res) {
			traceSet.initOutput();
		}
		res
	}
	
	def measureConstraint() : (Long, Long, Long) = {
		var min = Long.MaxValue
		var max = Long.MinValue
		var avg = 0L
		
		var eventCount = 0
		tesslaBurstMonitor = new TesslaMonitorClass()
		tesslaBurstMonitor.out_constraint = outputFunc
		
		//get  earliest timestamp with events
		var currentEvents: Array[Event] = traceSet.getNextTimestampsEvents();
		
		var ctr = 0
		
		// loop over all events
		while (currentEvents.length != 0) {
			//if (ctr % 10000 == 0)
				//println("timestamp no. " + ctr)
			// get the events of the current timestamp
//start def generateMeasureConstraintWriteEvents(writer: FileWriter, prevTabCount: Int)
			for (i <- 0 to currentEvents.length-1){
				if (currentEvents(i).getOwnerStream().getName().equals("event"))
					tesslaBurstMonitor.set_var_event(currentEvents(i).getColor(), currentEvents(i).getTimeStamp())
				eventCount = eventCount+1
			}
// end def generateMeasureConstraintWriteEvents(writer: FileWriter, prevTabCount: Int)
			//measure time before and after flush
			var time1= System.nanoTime()
			tesslaBurstMonitor.flush();
			var time2= System.nanoTime
			var timeEvent = time2-time1
			min = if (timeEvent < min) timeEvent else min
			max = if (timeEvent > max) timeEvent else max
			avg += timeEvent
			currentEvents = traceSet.getNextTimestampsEvents();
			ctr = ctr+1
		}
		traceSet.resetOutputCounter()
		(min, max, avg / eventCount)
	}
	
	def measureMultiple(count: Int, resultFilePath: String) : Unit = {
		var results: Array[(Long, Long, Long)] = new Array[(Long, Long, Long)](count)
		for (i <- 0 to count-1){
			println("Measure " + i + " of " + count)
			var result = measureConstraint()
			results(i) = result
		}
		if (!storeResultsToFile(results, resultFilePath))
			println("Cannot write results to " + resultFilePath);
	}
	
	/**
	* measures: (min, max, avg) 
	*/
	def storeResultsToFile(measures: Array[(Long, Long, Long)], filePath: String) : Boolean = {
		try {
			var fileWriter = new FileWriter(filePath)
			fileWriter.write("(min, max, average) of the run times per event in the individual runs.\n")
			var averageVals = average(measures)
			fileWriter.write("overallAverage: (" + averageVals._1/1000 + ", " + averageVals._2/1000 + ", " + averageVals._3/1000 + ")\n")
			for (i <- 0 to measures.length-1) {
				fileWriter.write("measure " + i+1 + " of " + (measures.length) + ": (" + measures(i)._1/1000 + ", " + measures(i)._2/1000 + ", " + 
					measures(i)._3/1000 + ")\n")
			}
			fileWriter.close()
		} catch {
			case e: IOException => return false
		}
		return true;
	}
	
	def average(measures: Array[(Long, Long, Long)]): (Long, Long, Long) = {
		var results = (0L, 0L, 0L)
		for (i <- 0 to measures.length-1){
			results = (results._1 + measures(i)._1,
						results._2 + measures(i)._2,
						results._3 + measures(i)._3)
		}
		return (results._1 / measures.length,
				results._2 / measures.length,
				results._3 / measures.length)
	}
	
	def outputFunc(value: (Boolean, Boolean), timestamp: Long, name: String, error: Throwable) : Unit = {
		if (error != null){
			println("An Error occurred at timestamp " + timestamp + "\n" + error.getMessage());
		} else {
			if (value == (true, false))
				println("Error! Invalid Output!");
		}
	}
}