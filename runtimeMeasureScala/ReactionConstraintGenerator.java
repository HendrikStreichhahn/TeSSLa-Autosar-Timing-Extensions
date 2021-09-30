import java.util.Random;

public class ReactionConstraintGenerator extends TraceSet{
	public ReactionConstraintGenerator(){
		// init Traces
		traces = new Trace[2];
		traces[0] = new Trace("stimulus");
		traces[1] = new Trace("response");
	}

	public boolean generateTestTrace(int eventCount, int minStimulusDistace, int maxStimulusDistace,
			int minimum, int maximum){
		Random rand = new Random();
		int timeNow= rand.nextInt(maxStimulusDistace);
		int clr = 0;

		while(eventCount > 0){
			// stimulus event
			timeNow+= minStimulusDistace + rand.nextInt(maxStimulusDistace - minStimulusDistace+1);
			traces[0].insertEvent(new Event(timeNow, clr, traces[0]));
			// response event
			int i = 10;
			boolean inserted = false;
			while(i > 0 && !inserted) {
				inserted = traces[1].insertEvent(new Event(timeNow + minimum + rand.nextInt(maximum - minimum+1)
					, clr, traces[1]));
				i--;
			}
			if (!inserted){
				return false;
			}
			eventCount-= 2;
			clr++;
		}
		return true;
	}
}