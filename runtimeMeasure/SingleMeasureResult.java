public class SingleMeasureResult{
	private long min, max, complete, avg;
	public long getMin() {return min;}
	public long getMax() {return max;}
	public long getComplete() {return complete;}
	public long getAvg() {return avg;}

	public SingleMeasureResult(long min, long max, long complete, long avg){
		this.min = min;
		this.max = max;
		this.avg = avg;
		this.complete = complete;
	}

	public String toString(){
		return "Minimum: " + ((float)min)/1000000 + "ms Maximum: " + ((float)max)/1000000 + "ms Complete: " + 
			((float)complete)/1000000 + "ms Average: " + ((float)avg)/1000000 + " ms";
 
   }
}