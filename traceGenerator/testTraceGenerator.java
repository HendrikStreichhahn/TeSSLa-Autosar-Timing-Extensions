public class testTraceGenerator{

	public static void main(String [] args){
		if (args.length == 0){
			System.out.println("invalid parameters!");
			System.out.println("Usage: testTraceGenerator ConstraintName outputName " + 
				"constraintParameter1 constraintParameter2 ...");
			return;
		}
		
		TraceSet trace;
		
		switch (args[0]){
			case "StrongDelayConstraint":
				trace = strongDelay(args);
				break;
			case "DelayConstraint":
				trace = delay(args);
				break;
			default:
				System.out.println("Unknown Constraint");
				return;
			
		}
		//store events
		if (!trace.saveToFile(args[1]))
			System.out.println("could not store trace");
		else
			System.out.println("finished");
	}
	
	private static StrongDelayConstraintGenerator strongDelay(String[] args){
		StrongDelayConstraintGenerator trace = new StrongDelayConstraintGenerator();
		trace.initEvents();
		//read parameters
		int[] parameters = readArguments(args, 5);
		if (parameters == null){
			System.out.println("Invalid Arguments sourceEventCount minDistanceSource "+ 
				"maxDistanceSource lower upper");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], parameters[3],
			parameters[4]);
		return trace;
	}
	
	private static DelayConstraintGenerator delay(String[] args){
		DelayConstraintGenerator trace = new DelayConstraintGenerator();
		trace.initEvents();
		//read parameters
		int[] parameters = readArguments(args, 5);
		if (parameters == null){
			System.out.println("Invalid Arguments sourceEventCount minDistanceSource "+ 
				"maxDistanceSource lower upper");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], parameters[3],
			parameters[4]);
		return trace;
	}
	
	private static int[] readArguments(String [] args, int count){
		int[] result = new int[count];
		boolean parameterSuccess = args.length == count + 2;
		if (parameterSuccess){
			try{
				for (int i = 0; i < count; i++)
					result[i] = Integer.parseInt(args[i+2]);
			} catch (NumberFormatException e){
				System.out.println(e);
				return null;
			}
		} else
			return null;
		return result;
	}
	
}