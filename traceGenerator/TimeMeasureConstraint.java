import java.io.IOException;

public abstract class TimeMeasureConstraint{
    static final String PATHTOMAIN = "../../main/t2uConstraints.tessla";
    
    //generate an random trace
    public abstract TraceSet generateTrace(int eventCount);
    
    public abstract boolean generateTeSSLaFile(String fileName);
    
    public SingleMeasureResult measureConstraintSingle(TraceSet trace, String tesslaCommand){
        //start TeSSLa
        TimeMeasureProcessInstance program = null;
        try {
            program = new TimeMeasureProcessInstance(tesslaCommand);
        } catch(IOException e){
            System.out.println("Could not start program: " + e);
            return null;
        }
        //sleep 5 seconds-> wait until TeSSLa is ready
        try{
            Thread.sleep(5*1000);
        } catch (InterruptedException e){
            //ignore
        }
        //measure time per event
        trace.initOutput();
        long completeTime = 0;
        long min = Long.MAX_VALUE;
        long max = 0;
        int eventCount = 1;
        //program.setDebugOutput(true);
        try{
            // first timestamp without waiting
            String tesslaInput = trace.getNextTimestampsEvents();
            program.writeNoWait(tesslaInput);
            //System.out.print("write: " + tesslaInput);
            for (tesslaInput = trace.getNextTimestampsEvents(); tesslaInput != ""; 
                    tesslaInput = trace.getNextTimestampsEvents()){
                //System.out.print("write: " + tesslaInput);
                long time = program.timeToAnswer(tesslaInput);
                //System.out.println("answer after: " + time);
                //update time vals
                min = Math.min(min, time);
                max = Math.max(max, time);
                completeTime += time;
                eventCount++;
            }
        } catch (IOException e){
            System.err.println("IOException between TeSSLa and Timemeasure!");
            System.err.println(e);
            return null;
        } finally {
            try {
               program.close(); 
            } catch (IOException e){
                System.err.println(e);
            }
            
        }
        
        return new SingleMeasureResult(min, max, completeTime/eventCount);
    }
    
    protected String generateTesslaIntMap(int[] keys, int[] vals){
        if (keys.length != vals.length)
            return null;
        if (keys.length == 0)
            return "Map_empty[Int, Int]";
        String res = "";
        for (int i = 0; i < keys.length; i++)
            res+= "Map_add(";
        res+= "Map_empty[Int, Int]";
        for (int i = 0; i < keys.length; i++)
            res+= ", " + keys[i] + ", " + vals[i] + ")";
        return res;
    }
    
    protected String generateTesslaIntList(int[] vals){
        if (vals.length != vals.length)
            return null;
        if (vals.length == 0)
            return "List_empty[Int]";
        String res = "";
        for (int i = 0; i < vals.length; i++)
            res+= "List_append(";
        res+= "List_empty[Int]";
        for (int i = 0; i < vals.length; i++)
            res+= ", " + vals[i] + ")";
        return res;
    }
    
}