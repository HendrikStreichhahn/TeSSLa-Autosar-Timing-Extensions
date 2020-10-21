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
            case "RepeatConstraint":
                trace = repeatConstraint(args);
                break;
            case "RepetitionConstraint":
                trace = repetitionConstraint(args);
                break;
            case "SynchronizationConstraint":
                trace = synchronizationConstraint(args);
                break;
            case "StrongSynchronizationConstraint":
                trace = strongSynchronizationConstraint(args);
                break;
            case "ExecutionTimeConstraint":
                trace = executionTimeConstraint(args);
                break;
            case "OrderConstraint":
                trace = orderConstraint(args);
                break;
            case "SporadicConstraint":
                trace = sporadicConstraint(args);
                break;
            case "PeriodicConstraint":
                trace = periodicConstraint(args);
                break;
            case "PatternConstraint":
                trace = patternConstraint(args);
                break;
            case "BurstConstraint":
                trace = BurstConstraint(args);
                break;
            case "ReactionConstraint":
                trace = ReactionConstraint(args);
                break;
            case "AgeConstraint":
                trace = AgeConstraint(args);
                break;
            case "OutputSynchronizationConstraint":
                trace = OutputSynchronizationConstraint(args);
                break;
            case "InputSynchronizationConstraint":
                trace = InputSynchronizationConstraint(args);
                break;
			default:
				System.out.println("Unknown Constraint");
				return;
			
		}
        if (trace == null) {
            System.out.println("could not create trace!");
            return;
        }
		//store events
		if (!trace.saveToFile(args[1]))
			System.out.println("could not store trace");
		else
			System.out.println("finished");
	}
    
    private static InputSynchronizationConstraintGenerator InputSynchronizationConstraint(String[] args){
		
		//read parameters
		int[] parameters = readArguments(args, 4);
		if (parameters == null){
			System.out.println("Invalid Arguments responseCount EventCount tolerance clusterDistance");
			return null;
		}
        InputSynchronizationConstraintGenerator trace = new InputSynchronizationConstraintGenerator(
            parameters[0]);
		// generate events
		trace.generateTestTrace(parameters[1], parameters[2], parameters[3]);
		return trace;
	}
    
    private static OutputSynchronizationConstraintGenerator OutputSynchronizationConstraint(String[] args){
		
		//read parameters
		int[] parameters = readArguments(args, 4);
		if (parameters == null){
			System.out.println("Invalid Arguments responseCount EventCount tolerance clusterDistance");
			return null;
		}
        OutputSynchronizationConstraintGenerator trace = new OutputSynchronizationConstraintGenerator(
            parameters[0]);
		// generate events
		trace.generateTestTrace(parameters[1], parameters[2], parameters[3]);
		return trace;
	}
    
    private static AgeConstraintGenerator AgeConstraint(String[] args){
		AgeConstraintGenerator trace = new AgeConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 5);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount minResponseDistace maxResponseDistace " +
                "minimum maximum");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4]);
		return trace;
	}
    
    private static ReactionConstraintGenerator ReactionConstraint(String[] args){
		ReactionConstraintGenerator trace = new ReactionConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 5);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount minStimulusDistace maxStimulusDistace " +
                "minimum maximum");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4]);
		return trace;
	}
    
    private static BurstConstraintGenerator BurstConstraint(String[] args){
		BurstConstraintGenerator trace = new BurstConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 3);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount length maxOccurrences");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2]);
		return trace;
	}
    
    private static PatternConstraintGenerator patternConstraint(String[] args){
		PatternConstraintGenerator trace = new PatternConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 6);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount period offset1 offset2 offset3 jitter");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], 
            new int[]{parameters[2], parameters[3], parameters[4]}, parameters[5]);
		return trace;
	}
    
    private static PeriodicConstraintGenerator periodicConstraint(String[] args){
		PeriodicConstraintGenerator trace = new PeriodicConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 3);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount period jitter");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2]);
		return trace;
	}
    
    private static RepetitionConstraintGenerator sporadicConstraint(String[] args){
		RepetitionConstraintGenerator trace = new RepetitionConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 4);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount lower "+ 
				"upper jitter");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], 1, parameters[3]);
		return trace;
	}
    
    private static OrderConstraintGenerator orderConstraint(String[] args){
		//read parameters
		int[] parameters = readArguments(args, 3);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount maxDistSourceSource maxDistSourceTarget");
			return null;
		}
        OrderConstraintGenerator trace = new OrderConstraintGenerator();
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2]);
		return trace;
	}
    
    private static ExecutionTimeConstraintGenerator executionTimeConstraint(String[] args){
		//read parameters
		int[] parameters = readArguments(args, 7);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount lower upper minDistance maxDistance "+ 
                "maxPreemptions maxPreemptionTime");
			return null;
		}
        ExecutionTimeConstraintGenerator trace = new ExecutionTimeConstraintGenerator();
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4],
            parameters[5], parameters[6]);
		return trace;
	}
    
    private static SynchronizationConstraintGenerator strongSynchronizationConstraint(String[] args){
		//read parameters
		int[] parameters = readArguments(args, 5);
		if (parameters == null){
			System.out.println("Invalid Arguments StreamCount EventCount tolerance "+ 
                "minClusterDistance maxClusterDistance");
			return null;
		}
        SynchronizationConstraintGenerator trace = new SynchronizationConstraintGenerator(parameters[0]);
		// generate events
		trace.generateTestTrace(parameters[1], parameters[2], 1, parameters[3], parameters[4]);
		return trace;
	}
    
    private static SynchronizationConstraintGenerator synchronizationConstraint(String[] args){
		//read parameters
		int[] parameters = readArguments(args, 6);
		if (parameters == null){
			System.out.println("Invalid Arguments StreamCount EventCount tolerance "+ 
                "maxEventsPerClusterPerStream minClusterDistance maxClusterDistance");
			return null;
		}
        SynchronizationConstraintGenerator trace = new SynchronizationConstraintGenerator(parameters[0]);
		// generate events
		trace.generateTestTrace(parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
		return trace;
	}
    
    private static RepetitionConstraintGenerator repetitionConstraint(String[] args){
		RepetitionConstraintGenerator trace = new RepetitionConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 5);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount lower "+ 
				"upper span jitter");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4]);
		return trace;
	}
    
    private static RepeatConstraintGenerator repeatConstraint(String[] args){
		RepeatConstraintGenerator trace = new RepeatConstraintGenerator();
		//read parameters
		int[] parameters = readArguments(args, 4);
		if (parameters == null){
			System.out.println("Invalid Arguments EventCount lower "+ 
				"upper span");
			return null;
		}
		// generate events
		trace.generateTestTrace(parameters[0], parameters[1], parameters[2], parameters[3]);
		return trace;
	}
	
	private static StrongDelayConstraintGenerator strongDelay(String[] args){
		StrongDelayConstraintGenerator trace = new StrongDelayConstraintGenerator();
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