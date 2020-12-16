import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureAll{
    
    private static boolean writeResults(String outputFileName, SingleMeasureResult[] results, String[] params){
        try {
            FileWriter fileWriter = new FileWriter(outputFileName);
            fileWriter.write("average: " + overallAverage(results) + "\n");
            fileWriter.write("minimum: " + minimalResults(results) + "\n");
            fileWriter.write("maximum: " + maximalResults(results) + "\n");
            for (int i = 0; i < results.length; i++){
                fileWriter.write(params[i] + " => " + results[i] + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        //measureDelayConstraint("results/DelayResult.txt", 10000);
        //measureStrongDelayConstraint("results/StrongDelayResult.txt", 10000);
        //measureRepeatConstraint("results/RepeatResult.txt", 10000);
        //measureRepetitionConstraint("results/RepetitionResult.txt", 10000);// nochmal laufen lassen
        //measureSynchronizationConstraint("results/SynchronizationResult.txt", 10000);
        //measureSynchronizationConstraint2("results/SynchronizationResult2.txt", 10000);
        //measureStrongSynchronizationConstraint("results/StrongSynchronizationResult.txt", 10000);//should be fixed 
        //measureExecutionTimeConstraint("results/ExecutionTimeResult.txt", 10000);
        //measureOrderConstraint("results/OrderResult.txt", 10000);
        //measureSporadicConstraint("results/SporadicResult.txt", 10000);
        //measurePeriodicConstraint("results/PeriodicResult.txt", 10000);
        //measurePatternConstraint("results/PatternResult.txt", 10000);
        //measurePatternConstraint1("results/Pattern1Result.txt", 10000);
        //measurePatternConstraint2("results/Pattern2Result.txt", 10000);//should be fixed 
        //measurePatternConstraint3("results/Pattern3Result.txt", 10000);//should be fixed 
        //measureArbitraryConstraint("results/ArbitraryResult.txt", 10000);
        //measureArbitraryConstraint1("results/Arbitrary1Result.txt", 10000);
        //measureArbitraryConstraint2("results/Arbitrary2Result.txt", 10000);
        //measureArbitraryConstraint3("results/Arbitrary3Result.txt", 10000);
        //measureBurstConstraint("results/BurstResult.txt", 10000);
        //measureReactionConstraint("results/ReactionResult.txt", 10000);
        //measureAgeConstraint("results/AgeResult.txt", 10000);
        //measureInputSynchronizationConstraint("results/InputSynchronizationResult.txt", 10000);
        //measureOutputSynchronizationConstraint("results/OutputSynchronizationResult.txt", 10000);
        measureOutputSynchronizationConstraint2("results/OutputSynchronizationResult2.txt", 10000);
        //measureInputSynchronizationConstraint2("results/InputSynchronizationResult2.txt", 10000);
        
        //measureCheckEventChain("results/CheckEventChainResult.txt", 10000);
        
    }
    
    static final String PATHTOTESSLA = "java11 -Xss1024m -jar ../../tessla-assembly-1.2.2.jar interpreter";
    
    private static void measureJustOutput(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/JustOutputTimeMeasure.tessla";
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        for (int i = 0; i < traceCount; i++){
            System.out.println("JustOutputTimeMeasure Trace " + (i+1) + " of " + traceCount);
            params[i] = "num " + (i+1) + " of " + traceCount;
            TimeMeasureJustOutput constraint = new TimeMeasureJustOutput();
            TraceSet trace = constraint.generateTrace(traceSize);
            //generate TesslaFile
            if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                System.out.println(TESSLAFILEPATH + " could not be created!");
            //measure time per event
            results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
            if (results[i] == null){
                System.out.println("result is null");
                return;
            }
        }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureDelayConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/DelayConstraintTimeMeasure.tessla";
        final int traceCount = 102;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int lower = 100; lower <= 1000; lower += 100)
            for (int sourceDistance = 1; sourceDistance <= 2*lower; sourceDistance*= 2){
                int upper = lower;
                System.out.println("DelayConstraint Trace " + (i+1) + " of " + traceCount);
                params[i] = ("lower = " + lower + " upper = " + upper + " sourceDistance = " + sourceDistance);
                System.out.println(params[i]);
                TimeMeasureDelayConstraint constraint = new TimeMeasureDelayConstraint(lower, upper, sourceDistance);
                TraceSet trace = constraint.generateTrace(traceSize);
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                if (results[i] == null){
                    System.out.println("result is null");
                    return;
                }
                i++;
                    
            }
        //save results to file
        writeResults(outputFileName, results, params);
    }

    
    private static void measureStrongDelayConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/StrongDelayConstraintTimeMeasure.tessla";
        final int traceCount = 102;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int lower = 100; lower <= 1000; lower += 100)
                for (int sourceDistance = 1; sourceDistance <= 2*lower; sourceDistance*= 2){
                    int upper = lower;
                    System.out.println("StrongDelayConstraint Trace " + (i+1) + " of " + traceCount);
                    params[i] = ("lower = " + lower + " upper = " + upper + " sourceDistance = " + sourceDistance);
                    System.out.println(params[i]);
                    TimeMeasureStrongDelayConstraint constraint = new TimeMeasureStrongDelayConstraint(lower, upper, sourceDistance);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null){
                        System.out.println("result is null");
                        return;
                    }
                    i++;
                    
            }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureRepeatConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/RepeatConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        int[] spans = new int[]{1, 50, 100, 150};
        for (int lower = 5000; lower <= 9000; lower += 1000)//5
            for (int upper = lower + 1000; upper <= lower + 5000; upper += 1000)//5
                for (int spanCount = 0; spanCount < spans.length; spanCount+= 1){//4
                    int span = spans[spanCount];
                    System.out.println("RepeatConstraint Trace " + (i+1) + " of " + 100);
                    params[i] = ("lower = " + lower + " upper = " + upper + " span = " + span);
                    TimeMeasureRepeatConstraint constraint = new TimeMeasureRepeatConstraint(lower, upper,
                        span);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureRepetitionConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/RepetitionConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        int[] spans = new int[]{1, 100, 250, 500};
        for (int lower = 500; lower <= 900; lower += 100)
            for (int upper = lower + 400; upper <= lower + 800; upper += 100)
               for (int spanCount = 0; spanCount < spans.length; spanCount+= 1){//4
                    int span = spans[spanCount];
                    System.out.println("RepetitionConstraint Trace " + (i+1) + " of " + 100);
                    int jitter = lower/2;
                    params[i] = ("lower = " + lower + " upper = " + upper + " span = " + span +
                        " jitter = " + jitter);
                    System.out.println(params[i]);
                    TimeMeasureRepetitionConstraint constraint = new TimeMeasureRepetitionConstraint(lower,
                        upper, span, jitter);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureSynchronizationConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/SynchronizationConstraintTimeMeasure.tessla";
        int numTraces = 64;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        int i = 0;
        int maxEventsPerCluster = 2;
        int clusterDistance = 200;
        for (int numStreams = 2; numStreams <= 5; numStreams++)//4
            for (int tolerance = 5; tolerance <= 155; tolerance+=10){
                        System.out.println("Synchronization Trace " + (i+1) + " of " + numTraces);
                        params[i] = "|event| = " + numStreams + " tolerance = " + tolerance +
                            " maxEventsPerCluster = " + maxEventsPerCluster + " clusterDistance = "
                            + clusterDistance;
                        System.out.println(params[i]);
                        TimeMeasureSynchronizationConstraint constraint = 
                            new TimeMeasureSynchronizationConstraint(tolerance, numStreams,
                                maxEventsPerCluster, clusterDistance, clusterDistance);
                        TraceSet trace = constraint.generateTrace(traceSize);
                        //generate TesslaFile
                        if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                            System.out.println(TESSLAFILEPATH + " could not be created!");
                        //measure time per event
                        results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA +
                            " " + TESSLAFILEPATH);
                        System.out.println(results[i]);
                        i++;
                    }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureSynchronizationConstraint2(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/SynchronizationConstraintTimeMeasure2.tessla";
        int numTraces = 72;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        int i = 0;
        //int clusterDistance = 100;
        for (int numStreams = 2; numStreams <= 5; numStreams++)//4
            for (int tolerance = 1; tolerance <= 100; tolerance+=30){//4
                int clusterDistance = 2*tolerance;
                 for (int maxEventsPerCluster = 1; maxEventsPerCluster < tolerance;       //3
                            maxEventsPerCluster+= 10){
                        System.out.println("Synchronization2 Trace " + (i+1) + " of " + numTraces);
                        params[i] = "|event| = " + numStreams + " tolerance = " + tolerance +
                            " maxEventsPerCluster = " + maxEventsPerCluster + " clusterDistance = "
                            + clusterDistance;
                        System.out.println(params[i]);
                        TimeMeasureSynchronizationConstraint constraint = 
                            new TimeMeasureSynchronizationConstraint(tolerance, numStreams,
                                maxEventsPerCluster, clusterDistance, clusterDistance);
                        TraceSet trace = constraint.generateTrace(traceSize);
                        //generate TesslaFile
                        if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                            System.out.println(TESSLAFILEPATH + " could not be created!");
                        //measure time per event
                        results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA +
                            " " + TESSLAFILEPATH);
                        System.out.println(results[i]);
                        i++;
                }
            }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureStrongSynchronizationConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/StrongSynchronizationConstraintTimeMeasure.tessla";
        int traceCount = 144;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int numStreams = 2; numStreams <= 5; numStreams++)//4
            for (int tolerance = 1; tolerance <= 100; tolerance+=12)//6
                for (int clusterDistance = 2; clusterDistance <= 246;       //5
                        clusterDistance*=4){
                    System.out.println("StrongSynchronizationConstraint Trace " + (i+1) + " of " + traceCount);
                    params[i] = "|event| = " + numStreams + " tolerance = " + tolerance +
                        " clusterDistance = " + clusterDistance;
                    TimeMeasureStrongSynchronizationConstraint constraint = 
                        new TimeMeasureStrongSynchronizationConstraint(tolerance, numStreams,
                            clusterDistance, clusterDistance);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA +
                        " " + TESSLAFILEPATH);
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }    

    
    private static void measureExecutionTimeConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/ExecutionTimeConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        for (int lower = 100; lower <= 900; lower += 200)//5
            for (int upper = lower + 100; upper <= lower + 2100; upper += 500)//4
                for (int numPreemptions = 1; numPreemptions <= 31; numPreemptions+=10){//4
                    System.out.println("ExecutionTimeConstraint Trace " + (i+1) + " of " + 100);
                    params[i] = "lower = " + lower + " upper = " + upper + " numPreemptions = " +
                        numPreemptions;
                    //generate trace
                    TimeMeasureExecutionTimeConstraint constraint =
                        new TimeMeasureExecutionTimeConstraint(lower, upper);
                    TraceSet trace = constraint.generateTrace(traceSize, lower, upper, numPreemptions,
                        upper);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " "
                        + TESSLAFILEPATH);
                    i++;
            }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureOrderConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/OrderTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        for (int maxDistSource = 1; maxDistSource <= 91; maxDistSource+= 10)//10
            for (int maxDistSourceTarget = 0; maxDistSourceTarget <= 45; maxDistSourceTarget+= 5){//10
                System.out.println("OrderConstraint Trace " + (i+1) + " of " + 100);
                params[i] = "maxDistSource :" + maxDistSource + " maxDistSourceTarget: "
                    + maxDistSourceTarget;
                //generate trace
                TimeMeasureOrderConstraint constraint = new TimeMeasureOrderConstraint();
                TraceSet trace = constraint.generateTrace(traceSize, maxDistSource, maxDistSourceTarget);     
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                i++;
            }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureSporadicConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/SporadicConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        for (int lower = 500; lower <= 900; lower += 100)
            for (int upper = lower + 100; upper <= lower + 500; upper += 100)
                for (int jitter = 1; jitter <=31; jitter+=10){
                    System.out.println("SporadicConstraint Trace " + (i+1) + " of " + 100);
                    params[i] = ("lower = " + lower + " upper = " + upper +
                        " jitter = " + jitter);
                    TimeMeasureSporadicConstraint constraint = new TimeMeasureSporadicConstraint(lower,
                        upper, jitter);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measurePeriodicConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/PeriodicConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        for (int period = 10; period <= 100; period+= 10)
            for (int jitter = 0; jitter < 10; jitter++){
                    System.out.println("PeriodicConstraint Trace " + (i+1) + " of " + 100);
                    params[i] = ("period= " + period + " jitter = " + jitter);
                    TimeMeasurePeriodicConstraint constraint = new TimeMeasurePeriodicConstraint(period,
                        jitter);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measurePatternConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/PatternConstraintTimeMeasure.tessla";
        int numTraces = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        int jitter = 0;
        for (int i = 0; i < 100; i++){
            System.out.println("PatternConstraint1 Trace " + (i+1) + " of " + numTraces);
            int[] offset = new int[i+1];
            for (int j = 0; j <= i; j++)
                offset[j] = j+1;
            int period = 200;
            params[i] = "period= " + period + " |offset|= " + (i+1) + " jitter=0";
            TimeMeasurePatternConstraint constraint = new TimeMeasurePatternConstraint(period, offset, jitter);
            TraceSet trace = constraint.generateTrace(traceSize);
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                if (results[i] == null)
                    return;
        }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measurePatternConstraint1(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/PatternConstraintTimeMeasure1.tessla";
        
        int numTraces = 5*5*5;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        
        int[] offset = new int[1];
        int i = 0;
        for (int period = 10; period <= 100; period+= 20) //5
            for (int jitter = 0; jitter < 10; jitter+= 2) //5
                for (offset[0] = 0; offset[0] < 5; offset[0]++){ //5
                    System.out.println("PatternConstraint1 Trace " + (i+1) + " of " + numTraces);
                    if (offset[0] >= period)
                        System.out.println("offset[1] >= period");
                    params[i] = "period= " + period + " offset=[";
                    for (int off: offset)
                        params[i]+= "" + off + ", ";
                    params[i]+= "] jitter = " + jitter;
                    TimeMeasurePatternConstraint constraint = new TimeMeasurePatternConstraint(period,
                        offset, jitter);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measurePatternConstraint2(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/PatternConstraintTimeMeasure2.tessla";
        
        int numTraces = 5*5*5;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        
        int[] offset = new int[2];
        int i = 0;
        for (offset[0] = 0; offset[0] < 5; offset[0]++) //5
            for (offset[1] = offset[0]+1; offset[1] <= offset[0]+5; offset[1]++)//5
                for (int period = offset[1] + 10; period <= offset[1] + 100; period+= 20){ //5
                    int jitter =  Math.min(period / 10, (offset[1] - offset[0]-1));
                    System.out.println("PatternConstraint2 Trace " + (i+1) + " of " + numTraces);
                    if (offset[1] >= period)
                        System.out.println("offset[1] >= period");
                    params[i] = "period= " + period + " offset=[";
                    for (int off: offset)
                        params[i]+= "" + off + ", ";
                    params[i]+= "] jitter = " + jitter;
                    System.out.println(params[i]);
                    TimeMeasurePatternConstraint constraint = new TimeMeasurePatternConstraint(period,
                        offset, jitter);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measurePatternConstraint3(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/PatternConstraintTimeMeasure3.tessla";
        
        int numTraces = 5*3*3*3;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        
        int[] offset = new int[3];
        int i = 0;
        for (offset[0] = 1; offset[0] <= 3; offset[0]++) //3
            for (offset[1] = offset[0]+1; offset[1] <= offset[0]+3; offset[1]++)
                for (offset[2] = offset[1]+1; offset[2] <= offset[1]+3; offset[2]++)
                    for (int period = offset[2] + 10; period <= offset[2] + 100; period+= 20){ //5
                        int jitter =  Math.min(period / 10,
                            Math.min((offset[1] - offset[0]-1), (offset[2] - offset[1]-1)));
                        System.out.println("PatternConstraint3 Trace " + (i+1) + " of " + numTraces);
                        if (offset[0] >= period)
                            System.out.println("offset[0] >= period");
                        if (offset[1] >= period)
                            System.out.println("offset[1] >= period");
                        if (offset[2] >= period)
                            System.out.println("offset[2] >= period");
                        params[i] = "period= " + period + " offset=[";
                        for (int off: offset)
                            params[i]+= "" + off + ", ";
                        params[i]+= "] jitter = " + jitter;
                        TimeMeasurePatternConstraint constraint = new TimeMeasurePatternConstraint(period,
                            offset, jitter);
                        TraceSet trace = constraint.generateTrace(traceSize);
                        //generate TesslaFile
                        if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                            System.out.println(TESSLAFILEPATH + " could not be created!");
                        //measure time per event
                        results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                        if (results[i] == null)
                            return;
                        i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureArbitraryConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/ArbitraryConstraintTimeMeasure.tessla";
        int numTraces = 60;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        int jitter = 0;
        for (int i = 0; i < 60; i++){
            System.out.println("ArbitraryConstraint Trace " + (i+1) + " of " + numTraces);
            int[] minimum = new int[(i+1)];
            int[] maximum = new int[(i+1)];
            for (int j = 0; j < minimum.length; j++){
                minimum[j] = (j+1)*2;
                maximum[j] = (j+1)*2;
            }
            params[i] = "|maximum|=" + minimum.length ;//+ " min: [";
            /*for (int min : minimum)
                params[i]+= min + ",";
            params[i]+= "] max: [";
            for (int max : maximum)
                params[i]+= max + ",";
             params[i]+= "]";*/
            System.out.println(params[i]);
            TimeMeasureArbitraryConstraint constraint = new TimeMeasureArbitraryConstraint(minimum, maximum);
            TraceSet trace = constraint.generateTrace(traceSize);
            //generate TesslaFile
            if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                System.out.println(TESSLAFILEPATH + " could not be created!");
            //measure time per event
            results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
            if (results[i] == null)
                return;
        }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureArbitraryConstraint1(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/ArbitraryConstraintTimeMeasure1.tessla";
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        int[] minimum = new int[1];
        int[] maximum = new int[1];
        
        for (minimum[0] = 10; minimum[0] <= 100; minimum[0]+= 10)
            for (maximum[0] = minimum[0] ; maximum[0] <= minimum[0] + 90; maximum[0]+= 10){
                System.out.println("ArbitraryConstraint1 Trace " + (i+1) + " of " + traceCount);
                params[i] = "minimum:[";
                for (int val : minimum)
                    params[i]+= val + ", ";
                params[i]+= "] maximum:[";
                for (int val : maximum)
                    params[i]+= val + ", ";
                params[i]+= "]";
                TimeMeasureArbitraryConstraint constraint = new TimeMeasureArbitraryConstraint(minimum, maximum);
                TraceSet trace = constraint.generateTrace(traceSize);
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                if (results[i] == null)
                    return;
                i++;
            }

        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureArbitraryConstraint2(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/ArbitraryConstraintTimeMeasure2.tessla";
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        int[] minimum = new int[2];
        int[] maximum = new int[2];
        
        for (minimum[0] = 10; minimum[0] <= 100; minimum[0]+= 10)
            for (maximum[0] = minimum[0] ; maximum[0] <= minimum[0] + 90; maximum[0]+= 10){
                System.out.println("ArbitraryConstraint2 Trace " + (i+1) + " of " + traceCount);
                minimum[1]= 2*minimum[0];
                maximum[1]= 2*maximum[0];
                params[i] = "minimum:[";
                for (int val : minimum)
                    params[i]+= val + ", ";
                params[i]+= "] maximum:[";
                for (int val : maximum)
                    params[i]+= val + ", ";
                params[i]+= "]";
                TimeMeasureArbitraryConstraint constraint = new TimeMeasureArbitraryConstraint(minimum, maximum);
                TraceSet trace = constraint.generateTrace(traceSize);
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                if (results[i] == null)
                    return;
                i++;
            }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureArbitraryConstraint3(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/ArbitraryConstraintTimeMeasure3.tessla";
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        int[] minimum = new int[3];
        int[] maximum = new int[3];
        
        for (minimum[0] = 10; minimum[0] <= 100; minimum[0]+= 10)
            for (maximum[0] = minimum[0] ; maximum[0] <= minimum[0] + 90; maximum[0]+= 10){
                System.out.println("ArbitraryConstraint3 Trace " + (i+1) + " of " + traceCount);
                minimum[1]= 2*minimum[0];
                maximum[1]= 2*maximum[0];
                minimum[2]= 3*minimum[0];
                maximum[2]= 3*maximum[0];
                params[i] = "minimum:[";
                for (int val : minimum)
                    params[i]+= val + ", ";
                params[i]+= "] maximum:[";
                for (int val : maximum)
                    params[i]+= val + ", ";
                params[i]+= "]";
                TimeMeasureArbitraryConstraint constraint = new TimeMeasureArbitraryConstraint(minimum, maximum);
                TraceSet trace = constraint.generateTrace(traceSize);
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                if (results[i] == null)
                    return;
                i++;
            }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureBurstConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/BurstConstraintTimeMeasure.tessla";
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int length = 2000;
        int i = 0;
        for (int ctr = 1; ctr <= 100; ctr++){
            int maxOccurrences= ctr;
            System.out.println("BurstConstraint Trace " + (i+1) + " of " + traceCount);
            params[i] = "length: " + length + " maxOccurrences: " + maxOccurrences;
            TimeMeasureBurstConstraint constraint = new TimeMeasureBurstConstraint(length, maxOccurrences);
            TraceSet trace = constraint.generateTrace(traceSize);
            //generate TesslaFile
            if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                System.out.println(TESSLAFILEPATH + " could not be created!");
            //measure time per event
            results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
            if (results[i] == null)
                return;
            i++;
        }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureReactionConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/ReactionConstraintTimeMeasure.tessla";
        final int traceCount = 102;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int minimum = 100; minimum <= 1000; minimum += 100)
            for (int stimulusDistance = 1; stimulusDistance <= 2*minimum; stimulusDistance*= 2){
                int maximum = minimum;
                System.out.println("ReactionConstraint Trace " + (i+1) + " of " + traceCount);
                params[i] = "stimulusDistance: " + stimulusDistance + " minimum: " + minimum + " maximum: " + maximum;
                TimeMeasureReactionConstraint constraint = new TimeMeasureReactionConstraint(minimum,
                    maximum, stimulusDistance, stimulusDistance);
                TraceSet trace = constraint.generateTrace(traceSize);
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                if (results[i] == null)
                    return;
                i++;
            } 
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureAgeConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/AgeConstraintTimeMeasure.tessla";
        final int traceCount = 102;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int minimum = 100; minimum <= 1000; minimum += 100)
            for (int stimulusDistance = 1; stimulusDistance <= 2*minimum; stimulusDistance*= 2){
                int maximum = minimum;
                    System.out.println("AgeConstraint Trace " + (i+1) + " of " + traceCount);
                    params[i] = "stimulusDistance: " + stimulusDistance+ " minimum: " + minimum +
                        " maximum: " + maximum;
                    System.out.println(params[i]);
                    TimeMeasureAgeConstraint constraint = new TimeMeasureAgeConstraint(minimum,
                        maximum, stimulusDistance, stimulusDistance);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    System.out.println(results[i]);
                    if (results[i] == null)
                        return;
                    i++;
                } 
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    
    private static void measureOutputSynchronizationConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/OutputSynchronizationConstraintTimeMeasure.tessla";
        final int traceCount = 112;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int streamCount = 2; streamCount <= 5; streamCount++)//4
            for (int tolerance = 10; tolerance <= 25; tolerance+= 3)//5
                for (int clusterDistance = 2; clusterDistance <= 2*tolerance;       //5
                        clusterDistance*=2){
                    System.out.println("OutputSynchronizationConstraint Trace " + (i+1) + " of "
                        + traceCount);
                    params[i] = "responseCount: " + streamCount + " tolerance: " + tolerance + 
                        " clusterDistance: " + clusterDistance;
                    TimeMeasureOutputSynchronizationConstraint constraint =
                        new TimeMeasureOutputSynchronizationConstraint(streamCount, clusterDistance,
                            tolerance);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureOutputSynchronizationConstraint2(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/OutputSynchronizationConstraintTimeMeasure2.tessla";
        final int traceCount = 66;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        int clusterDistance = 2;
        for (int streamCount = 2; streamCount <= 102; streamCount+=10)//4
            for (int tolerance = 10; tolerance <= 25; tolerance+= 3){
                    System.out.println("OutputSynchronizationConstraint Trace " + (i+1) + " of "
                        + traceCount);
                    params[i] = "responseCount: " + streamCount + " tolerance: " + tolerance + 
                        " clusterDistance: " + clusterDistance;
                    TimeMeasureOutputSynchronizationConstraint constraint =
                        new TimeMeasureOutputSynchronizationConstraint(streamCount, clusterDistance,
                            tolerance);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    System.out.println(results[i]);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    
    private static void measureInputSynchronizationConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/InputSynchronizationConstraintTimeMeasure.tessla";
        final int traceCount = 112;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int streamCount = 2; streamCount <= 5; streamCount++)//4
            for (int tolerance = 10; tolerance <= 25; tolerance+= 3)//5
                for (int clusterDistance = 2; clusterDistance <= 2*tolerance;       //5
                        clusterDistance*=2){
                    System.out.println("InputSynchronizationConstraint Trace " + (i+1) + " of "
                        + traceCount);
                    params[i] = "stimulusCount: " + streamCount + " tolerance: " + tolerance + 
                        " clusterDistance: " + clusterDistance;
                    TimeMeasureInputSynchronizationConstraint constraint =
                        new TimeMeasureInputSynchronizationConstraint(streamCount, clusterDistance,
                            tolerance);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
        private static void measureInputSynchronizationConstraint2(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/InputSynchronizationConstraintTimeMeasure2.tessla";
        final int traceCount = 66;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        int clusterDistance = 2;
        for (int streamCount = 2; streamCount <= 102; streamCount+=10)//4
            for (int tolerance = 10; tolerance <= 25; tolerance+= 3){
                    System.out.println("InputSynchronizationConstraint Trace " + (i+1) + " of "
                        + traceCount);
                    params[i] = "stimulusCount: " + streamCount + " tolerance: " + tolerance + 
                        " clusterDistance: " + clusterDistance;
                    TimeMeasureInputSynchronizationConstraint constraint =
                        new TimeMeasureInputSynchronizationConstraint(streamCount, clusterDistance,
                            tolerance);
                    TraceSet trace = constraint.generateTrace(traceSize);
                    //generate TesslaFile
                    if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                        System.out.println(TESSLAFILEPATH + " could not be created!");
                    //measure time per event
                    results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                    if (results[i] == null)
                        return;
                    i++;
                }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureCheckEventChain(String outputFileName, int traceSize){
        
        final String TESSLAFILEPATH = "tmp/CheckEventChainTimeMeasure.tessla";
        final int traceCount = 102;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int minimum = 100; minimum <= 1000; minimum += 100)
            for (int stimulusDistance = 1; stimulusDistance <= 2*minimum; stimulusDistance*= 2){
                int maximum = minimum;
                System.out.println("CheckEventChain Trace " + (i+1) + " of " + traceCount);
                params[i] = "stimulusDistance: " + stimulusDistance + " minimum: " + minimum + " maximum: " + maximum;
                TimeMeasureCheckEventChain constraint = new TimeMeasureCheckEventChain(minimum,
                    maximum, stimulusDistance, stimulusDistance);
                TraceSet trace = constraint.generateTrace(traceSize);
                //generate TesslaFile
                if (!constraint.generateTeSSLaFile(TESSLAFILEPATH))
                    System.out.println(TESSLAFILEPATH + " could not be created!");
                //measure time per event
                results[i] = constraint.measureConstraintSingle(trace, PATHTOTESSLA + " " + TESSLAFILEPATH);
                if (results[i] == null)
                    return;
                i++;
            } 
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static SingleMeasureResult overallAverage(SingleMeasureResult[] results){
        long min = 0;
        long max = 0;
        long complete = 0;
        long avg = 0;
        for (SingleMeasureResult current: results){
            min+= current.getMin();
            max+= current.getMax();
            complete+= current.getComplete();
            avg+= current.getAvg();
        }
        return new SingleMeasureResult(min/results.length, complete/results.length, max/results.length, avg/results.length);
    }
    
    private static SingleMeasureResult minimalResults(SingleMeasureResult[] results){
        long min = Integer.MAX_VALUE;
        long max = Integer.MAX_VALUE;
        long avg = Integer.MAX_VALUE;
        long complete = Integer.MAX_VALUE;
        for (SingleMeasureResult current: results){
            min= Math.min(current.getMin(), min);
            max= Math.min(current.getMax(), max);
            avg= Math.min(current.getAvg(), avg);
            complete= Math.min(current.getComplete(), complete);
        }
        return new SingleMeasureResult(min, max, complete, avg);
    }
    
    private static SingleMeasureResult maximalResults(SingleMeasureResult[] results){
        long min = 0;
        long max = 0;
        long avg = 0;
        long complete = 0;
        for (SingleMeasureResult current: results){
            min= Math.max(current.getMin(), min);
            max= Math.max(current.getMax(), max);
            avg= Math.max(current.getAvg(), avg);
            complete= Math.max(current.getComplete(), complete);
        }
        return new SingleMeasureResult(min, max, complete, avg);
    }

}