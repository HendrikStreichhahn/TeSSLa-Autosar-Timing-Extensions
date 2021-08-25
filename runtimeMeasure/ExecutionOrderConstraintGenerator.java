import java.util.Random;

public class ExecutionOrderConstraintGenerator extends TraceSet{
	public ExecutionOrderConstraintGenerator(){
		// init Traces
		traces = new Trace[1];
		traces[0] = new Trace("event");
	}

	public boolean generateTestTrace(int eventCount, int eventDistace){
		int timeNow = 0;
		for (int i = 1; i <= eventCount; i++){
			// increase time
			timeNow+= eventDistace;
			traces[0].insertEvent(new Event(timeNow, i));
		}
		return true;
	}

	int eventCount;

	private void insertEvents(int maxEventCount, int timeNow, int eventDistance, int hierarchDepth,
			int maxHierarchDepth, int maxHierarchWidth){
		if (eventCount >= maxEventCount || hierarchDepth >= maxHierarchDepth)
			return;
		traces[0].insertEvent(new Event(timeNow, 0));
		for (int i = 0; i < maxHierarchWidth; i++){
			insertEvents(maxEventCount, timeNow + (i+1) * eventDistance, eventDistance, hierarchDepth + 1, maxHierarchDepth, maxHierarchWidth);
		}
	}

	public boolean generateTestTrace(int eventCount, int eventDistance, int hierarchDepth, int hierarchWidth){
		//insertEvents(eventCount, eventDistance, eventDistance, 0, hierarchDepth, 0, hierarchWidth);
		insertEvents(eventCount, eventDistance, eventDistance, 0, hierarchDepth, hierarchWidth);
		return true;
	}
}
