import java.io.FileWriter
import java.io.IOException

class TimeMeasureScalaClassCreatorTADLBurst extends TimeMeasureScalaClassCreator{

	def generateEntireObject(scalaFilePath: String, scalaObjectName: String, resultFilePath: String, repetitionCount: Int, eventCount: Int,
			burstLength: Int, maxOccurrences: Int): Boolean= {
		var burstCreator = new TimeMeasureScalaClassCreatorTADLBurst
		try {
			var fileWriter = new FileWriter(scalaFilePath)
			fileWriter.write("import java.io._\n")
			fileWriter.write("object " + scalaObjectName + "{\n")
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
			case e: IOException => return false
		}
		return true
	}

	protected def generateMemberVariableListExtended(writer: FileWriter, prevTabCount: Int, burstLength: Int, maxOccurrences: Int) : Unit = {
		writer.write(tabs(prevTabCount) + "var burstLength: Int = " + burstLength + "\n")
		writer.write(tabs(prevTabCount) + "var maxOccurrences : Int = " + maxOccurrences + "\n")
		writer.write(tabs(prevTabCount) + "var traceSet : BurstConstraintGenerator = null" + "\n")
	}
	
	protected def generateGenerateTrace(writer: FileWriter, prevTabCount: Int, repetitionCount: Int, resultFilePath: String) : Unit = {
		writer.write(tabs(prevTabCount) + "def generateTrace(): Boolean = {" + "\n")
		writer.write(tabs(prevTabCount+1) + "tesslaMonitorInstance = new TesslaMonitor()" + "\n")
		writer.write(tabs(prevTabCount+1) + "traceSet = new BurstConstraintGenerator()" + "\n")
		writer.write(tabs(prevTabCount+1) + "var res: Boolean = traceSet.generateTestTrace(eventCount, burstLength, maxOccurrences)" + "\n")
		writer.write(tabs(prevTabCount+1) + "if (res) {" + "\n")
		writer.write(tabs(prevTabCount+2) + "traceSet.initOutput();" + "\n")
		writer.write(tabs(prevTabCount+1) + "}" + "\n")
		writer.write(tabs(prevTabCount+1) + "res" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
	
	protected def generateMeasureConstraintWriteEvents(writer: FileWriter, prevTabCount: Int) : Unit = {
		writer.write(tabs(prevTabCount) + "for (i <- 0 to currentEvents.length-1){" + "\n")
		writer.write(tabs(prevTabCount+1) + "if (currentEvents(i).getOwnerStream().getName().equals(\"event\"))" + "\n")
		writer.write(tabs(prevTabCount+2) + "tesslaMonitorInstance.set_var_event(currentEvents(i).getColor(), currentEvents(i).getTimeStamp())" + "\n")
		writer.write(tabs(prevTabCount+1) + "eventCounter = eventCounter+1" + "\n")
		writer.write(tabs(prevTabCount) + "}" + "\n")
	}
}