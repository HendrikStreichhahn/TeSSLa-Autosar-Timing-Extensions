import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureARExecutionOrderConstraint extends TimeMeasureConstraint{

	boolean isOrdinary;

	int eventDistance, hierarchWidth, hierarchDepth, eventCount;

	/**
	* Constructor for ordinary ExecutionOrderConstraint.
	* @param eventDistance the distance between subsequent events
	*/
	public TimeMeasureARExecutionOrderConstraint(int eventCount, int eventDistance){
		isOrdinary= true;

		this.eventDistance = eventDistance;
		this.eventCount = eventCount;

		generateOrderMapCounter= 1;
	}

	/**
	* Constructor for the hierarchical ExecutionOrderConstraint.
	*
	* @param eventDistance the distance between subsequent events
	* @param hierarchDepth
	* @param hierarchWidth
	*/
	public TimeMeasureARExecutionOrderConstraint(int eventDistance, int hierarchDepth, int hierarchWidth){
		isOrdinary = false;
		this.eventDistance = eventDistance;
		this.hierarchWidth = hierarchWidth;
		this.hierarchDepth = hierarchDepth;

		generateOrderMapCounter= 1;
	}

	/**
	* Generates a trace that fulfills the ordinary ExecutionOrderConstraint with the parameters given in the constructor.
	* @param eventCount number of events in the trace
	* @return a traceSet described above
	*/
	public TraceSet generateTrace(int eventCount){
		this.eventCount = eventCount;
		if (!isOrdinary)
			throw new IllegalArgumentException("generateTrace(int) is only allowed for ordinary ExecutionOrderConstraint");
		//Trace generieren
		ExecutionOrderConstraintGenerator trace = new ExecutionOrderConstraintGenerator();
		//generate trace, repeat until fulfilled trace generated
		while (!trace.generateTestTrace(eventCount, eventDistance)){
			trace = new ExecutionOrderConstraintGenerator();
		}
		return trace;
	}

	/**
	* Generates a trace that fulfills the hierarchical ExecutionOrderConstraint with the parameters given in the constructor.
	* A number of events can not be specified, because it is already defined by the parameters in the constructor.
	* @return a traceSet described above
	*/
	public TraceSet generateTrace(){
		if (isOrdinary)
			throw new IllegalArgumentException("generateTrace(int, int) is only allowed for hierarchial ExecutionOrderConstraint");
		//Trace generieren
		ExecutionOrderConstraintGenerator trace = new ExecutionOrderConstraintGenerator();
		int ctr = 0;
		for (int i = 0; i < hierarchDepth; i++)
			ctr += Math.pow(hierarchWidth, i);
		trace.generateTestTrace(ctr, eventDistance);
		return trace;
	}

	/**
	* Generates a string containing the TeSSLa Map specifying the order.
	* @param name The name of the map, which is used in the TeSSLaSpecification. This name must be unique in the tessla file.
	*/
	private String generateTeSSLaOrderMap2(String name) {
		Map<Integer, LinkedList<Integer>> aMap = generateOrderMap(new HashMap<Integer, LinkedList<Integer>>(), hierarchDepth, hierarchWidth);
		Set<Integer> mapKeys = aMap.keySet();
		//generate all lists
		String res= "";
		for (var it : mapKeys){
			res += "def " + name + "List" + it + ":= " + listToTeSSLaList(aMap.get(it)) + "\n";
		}
		//generate maps
		res += "def " + name + "Map0:= Map.empty[Int, List[Int]]\n";
		int mapCtr = 0;
		for (var it : mapKeys){
			mapCtr++;
			res+= "def " + name + "Map" + mapCtr + ":= Map.add(" + name + "Map" + (mapCtr-1) + ", " + it + ", " + name + "List" + it + ")\n";
		}
		res += "def " + name + " := " + name + "Map" + mapCtr;
		return res;
	}

	private String listToTeSSLaList(List<Integer> aList) {
		String res = "";
		for (int i = 0; i < aList.size(); i++)
			res+= "List.append(";
		res+= "List.empty[Int]";
		for (var it : aList)
			res+= ", " + it + ")";
		return res;
	}
	
	private String linearOrderList(int count) {
		String res = "";
		for (int i = 0; i < count; i++)
			res+= "List.append(";
		res+= "List.empty[Int], ";
		for (int i = 1; i <= count; i++)
			res+= "" + i + "), ";
		return res.substring(0, res.length()-2);
	}


	/**
	* @param currMap the map, that should be filled
	* @param parentEvent 
	* @param counter
	* @param remDepth
	* @param hierarchWidth
	* @return the modified map
	*/
	static int generateOrderMapCounter = 1;
	private Map<Integer, LinkedList<Integer>> generateOrderMap(Map<Integer, LinkedList<Integer>> currMap, int remDepth, int hierarchWidth){
		// recursion end
		if (remDepth <= 0)
			return currMap;
		// add this node and the first list entry to the map
		LinkedList<Integer> successorList = new LinkedList<Integer>();
		//successorList.add(blaCounter + 1);
		int startCounter = generateOrderMapCounter;
		//recursive call
		for (int i = 0; i < hierarchWidth; i++){
			generateOrderMapCounter++;
			successorList.add(generateOrderMapCounter);
			if (remDepth != 1)
				currMap = generateOrderMap(currMap, remDepth-1, hierarchWidth);
		}
		currMap.put(startCounter, successorList);
		return currMap;
	}


	public boolean generateTeSSLaFile(String fileName){
		if (isOrdinary) {
			try {
				FileWriter fileWriter = new FileWriter(fileName);
				fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
				fileWriter.write("in event: Events[Int]\n\n");

				fileWriter.write("def order = " + linearOrderList(eventCount) + "\n\n");

				fileWriter.write("def constraint = AUTOSAR_TIMEX.ExecutionOrderConstraintOrdinary(event, order, TADL2.pseudoInfty)\n");
				fileWriter.write("def value:= constraint.value\n");
				fileWriter.write("def final:= constraint.final\n");
				fileWriter.write("out value\n");
				fileWriter.write("out final\n");

				fileWriter.close();

			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		} else{
			try {
				FileWriter fileWriter = new FileWriter(fileName);
				fileWriter.write("include \"" + PATHTOTIMEXMAIN + "\"\n");
				fileWriter.write("in event: Events[Int]\n");

				//fileWriter.write("def order = " + generateTeSSLaOrderMap(hierarchDepth, hierarchWidth)+ "\n");
				fileWriter.write(generateTeSSLaOrderMap2("order") + "\n");

				fileWriter.write("def constraint := AUTOSAR_TIMEX.ExecutionOrderConstraintHierarchical(event, order, TADL2.pseudoInfty)\n");
				fileWriter.write("def value:= constraint.value\n");
				fileWriter.write("def final:= constraint.final\n");
				fileWriter.write("out value\n");
				fileWriter.write("out final\n");
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}

		return true;
	}

}