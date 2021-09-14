import java.io._

object testTADL2Creator {
	def main(args: Array[String]) : Unit ={
		var scalaFilePath = "tmp/burstCreated.scala"
		var resultFilePath = "tmp/burstCreatedOutput.txt"
		var repetitionCount = 5
		var eventCount = 1000000
		var burstLength = 20
		var maxOccurrences = 3
	
	
		var creator: TimeMeasureScalaClassCreatorTADLBurst = new TimeMeasureScalaClassCreatorTADLBurst()
		creator.generateEntireObject(scalaFilePath, "dontrunthis", resultFilePath, repetitionCount, eventCount, burstLength, maxOccurrences)
		
		/*var resultFilePath = "burstCreatedOutput.txt"
		var repetitionCount = 5
		var eventCount = 1000000
		var burstLength = 20
		var maxOccurrences = 3
		
		try {
			var fileWriter = new FileWriter("timeMeasureBurstCreated.scala")
			fileWriter.write("import java.io._\n")
			fileWriter.write("object timeMeasureBurstCreated {\n")
			burstCreator.generateMainMethod(fileWriter, 1, repetitionCount, resultFilePath)
			burstCreator.generateMemberVariableListGeneral(fileWriter, 1, eventCount)
			burstCreator.generateMemberVariableListExtended(fileWriter, 1, burstLength, maxOccurrences)
			burstCreator.generateMeasureConstraint(fileWriter, 1)
			burstCreator.generateMeasureMultiple(fileWriter, 1)
			burstCreator.generateStoreResultsToFile(fileWriter, 1)
			burstCreator.generateAverage(fileWriter, 1)
			burstCreator.generateOutputFunc(fileWriter, 1)
			burstCreator.generateGenerateTrace(fileWriter, 1, repetitionCount, resultFilePath)
			fileWriter.write("}\n")
			fileWriter.flush()
			fileWriter.close()
		} catch {
			case e: IOException => println("Something went wrong...");
		}*/
		
	}
}