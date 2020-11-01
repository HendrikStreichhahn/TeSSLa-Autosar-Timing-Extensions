import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TimeMeasureAll{
    
    private static boolean writeResults(String outputFileName, SingleMeasureResult[] results, String[] params){
        try {
            FileWriter fileWriter = new FileWriter(outputFileName);
            fileWriter.write("absolute min/max: " + overallResults(results) + "\n");
            fileWriter.write("overall averages: " + overallAverage(results) + "\n");
            fileWriter.write("minimal of averages: " + minAvg(results) + " maximal of averages: "
                + maxAvg(results) + "\n");
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
        measureDelayConstraint("results/DelayResult.txt", 1000);
        measureStrongDelayConstraint("results/StrongDelayResult.txt", 1000);
        measureRepeatConstraint("results/RepeatResult.txt", 1000);
        measureRepetitionConstraint("results/RepetitionResult.txt", 1000);
        measureSynchronizationConstraint("results/SynchronizationResult.txt", 1000);
        measureStrongSynchronizationConstraint("results/StrongSynchronizationResult.txt", 1000);
        measureExecutionTimeConstraint("results/ExecutionTimeResult.txt", 1000);
        measureOrderConstraint("results/OrderResult.txt", 1000);
        measureSporadicConstraint("results/SporadicResult.txt", 1000);
        measurePeriodicConstraint("results/PeriodicResult.txt", 1000);
        measurePatternConstraint1("results/Pattern1Result.txt", 1000);
        measurePatternConstraint2("results/Pattern2Result.txt", 1000);
        measurePatternConstraint3("results/Pattern3Result.txt", 1000);
        measureArbitraryConstraint1("results/Arbitrary1Result.txt", 1000);
        measureArbitraryConstraint2("results/Arbitrary2Result.txt", 1000);
        measureArbitraryConstraint3("results/Arbitrary3Result.txt", 1000);
        measureBurstConstraint("results/BurstResult.txt", 1000);
        measureReactionConstraint("results/ReactionResult.txt", 1000);
        measureAgeConstraint("results/AgeResult.txt", 1000);
        measureOutputSynchronizationConstraint("results/OutputSynchronizationResult.txt", 250);
        measureInputSynchronizationConstraint("results/InputSynchronizationResult.txt", 1000);
        
        
    }
    
    static final String PATHTOTESSLA = "../tessla.sh";
    
    private static void measureDelayConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/DelayConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        for (int lower = 100; lower <= 1000; lower += 100)
            for (int upper = lower + 100; upper <= lower + 1000; upper += 100){
                System.out.println("DelayConstraint Trace " + (i+1) + " of " + 100);
                params[i] = ("lower = " + lower + " upper = " + upper);
                TimeMeasureDelayConstraint constraint = new TimeMeasureDelayConstraint(lower, upper);
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
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        for (int lower = 100; lower <= 1000; lower += 100)
            for (int upper = lower + 100; upper <= lower + 1000; upper += 100){
                params[i] = ("lower = " + lower + " upper = " + upper);
                System.out.println("StrongDelayConstraint Trace " + (i+1) + " of " + 100);
                TimeMeasureStrongDelayConstraint constraint = new TimeMeasureStrongDelayConstraint(lower,
                    upper);
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
    
    private static void measureRepeatConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/RepeatConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        for (int lower = 500; lower <= 900; lower += 100)//5
            for (int upper = lower + 100; upper <= lower + 500; upper += 100)//5
                for (int span = 1; span <= 4; span ++){//4
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
        for (int lower = 500; lower <= 900; lower += 100)
            for (int upper = lower + 100; upper <= lower + 500; upper += 100)
                for (int span = 1; span <= 4; span ++){
                    System.out.println("RepetitionConstraint Trace " + (i+1) + " of " + 100);
                    int jitter = lower / 10;
                    params[i] = ("lower = " + lower + " upper = " + upper + " span = " + span +
                        " jitter = " + jitter);
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
        SingleMeasureResult[] results = new SingleMeasureResult[108];
        String[] params = new String[108];
        int i = 0;
        for (int numStreams = 2; numStreams <= 5; numStreams++)//4
            for (int tolerance = 3; tolerance <= 9; tolerance+=3)//3
                for (int maxEventsPerCluster = 2; maxEventsPerCluster <= 6; maxEventsPerCluster+=2)//3
                    for (int clusterDistance = tolerance; clusterDistance <= 3*tolerance;       //3
                            clusterDistance+= tolerance){
                        System.out.println("Synchronization Trace " + (i+1) + " of " + 108);
                        params[i] = "|event| = " + numStreams + " tolerance = " + tolerance +
                            " maxEventsPerCluster = " + maxEventsPerCluster + " clusterDistance = "
                            + clusterDistance; 
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
                        i++;
                    }
        //save results to file
        writeResults(outputFileName, results, params);
    }
    
    private static void measureStrongSynchronizationConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/StrongSynchronizationConstraintTimeMeasure.tessla";
        SingleMeasureResult[] results = new SingleMeasureResult[100];
        String[] params = new String[100];
        int i = 0;
        int maxEventsPerCluster = 1;
        for (int numStreams = 2; numStreams <= 5; numStreams++)//4
            for (int tolerance = 3; tolerance <= 15; tolerance+=3)//5
                for (int clusterDistance = tolerance; clusterDistance <= 5*tolerance;       //5
                        clusterDistance+= tolerance){
                    System.out.println("StrongSynchronizationConstraint Trace " + (i+1) + " of " + 100);
                    params[i] = "|event| = " + numStreams + " tolerance = " + tolerance +
                        " maxEventsPerCluster = " + maxEventsPerCluster + " clusterDistance = "
                        + clusterDistance; 
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
                for (int numPreemptions = 0; numPreemptions < 4; numPreemptions++){//4
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
            for (int maxDistSourceTarget = 1; maxDistSourceTarget <= 91; maxDistSourceTarget+= 10){//10
                System.out.println("OrderTimeConstraint Trace " + (i+1) + " of " + 100);
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
                for (int span = 1; span <= 4; span ++){
                    System.out.println("SporadicConstraint Trace " + (i+1) + " of " + 100);
                    int jitter = lower / 10;
                    params[i] = ("lower = " + lower + " upper = " + upper + " span = " + span +
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
        
        int numTraces = 5*5*5*5;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        
        int[] offset = new int[2];
        int i = 0;
        for (int period = 10; period <= 100; period+= 20) //5
            for (int jitter = 0; jitter < 10; jitter+= 2) //5
                for (offset[0] = 0; offset[0] < 5; offset[0]++) //5
                    for (offset[1] = offset[0]+1; offset[1] <= offset[0]+5; offset[1]++){ //5
                        System.out.println("PatternConstraint2 Trace " + (i+1) + " of " + numTraces);
                        if (offset[1] >= period)
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
    
    private static void measurePatternConstraint3(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/PatternConstraintTimeMeasure3.tessla";
        
        int numTraces = 5*5*3*3*3;
        SingleMeasureResult[] results = new SingleMeasureResult[numTraces];
        String[] params = new String[numTraces];
        
        int[] offset = new int[3];
        int i = 0;
        for (int period = 10; period <= 100; period+= 20) //5
            for (int jitter = 0; jitter < 10; jitter+= 2) //5
                for (offset[0] = 1; offset[0] <= 21; offset[0]++) //3
                    for (offset[1] = offset[0]+1; offset[1] <= offset[0]+3; offset[1]++)
                        for (offset[2] = offset[1]+1; offset[2] <= offset[1]+3; offset[2]++){ //3
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
        int i = 0;
        for (int maxOccurrences = 1; maxOccurrences <= 100; maxOccurrences++){
            int length = 4 * maxOccurrences;
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
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int minStimulusDistace = 5; minStimulusDistace <= 35; minStimulusDistace+= 10)//4
            for (int minimum = 1; minimum <= 41; minimum+= 10) //5
                for (int maximum = minimum + 1; maximum <= minimum + 41; maximum+= 10){//5
                    System.out.println("ReactionConstraint Trace " + (i+1) + " of " + traceCount);
                    int maxStimulusDistace = 2 * minStimulusDistace;
                    params[i] = "minStimulusDistace: " + minStimulusDistace + " maxStimulusDistace: "
                        + maxStimulusDistace + " minimum: " + minimum + " maximum: " + maximum;
                    TimeMeasureReactionConstraint constraint = new TimeMeasureReactionConstraint(minimum,
                        maximum, minStimulusDistace, maxStimulusDistace);
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
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int minStimulusDistace = 5; minStimulusDistace <= 35; minStimulusDistace+= 10)//4
            for (int minimum = 1; minimum <= 41; minimum+= 10) //5
                for (int maximum = minimum + 1; maximum <= minimum + 41; maximum+= 10){//5
                    System.out.println("AgeConstraint Trace " + (i+1) + " of " + traceCount);
                    int maxStimulusDistace = 2 * minStimulusDistace;
                    params[i] = "minStimulusDistace: " + minStimulusDistace + " maxStimulusDistace: "
                        + maxStimulusDistace + " minimum: " + minimum + " maximum: " + maximum;
                    TimeMeasureAgeConstraint constraint = new TimeMeasureAgeConstraint(minimum,
                        maximum, minStimulusDistace, maxStimulusDistace);
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
    
    
    private static void measureOutputSynchronizationConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/OutputSynchronizationConstraintTimeMeasure.tessla";
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int streamCount = 2; streamCount <= 5; streamCount++)//4
            for (int tolerance = 2; tolerance <= 10; tolerance+= 2)//5
                for (int clusterDistance = 2; clusterDistance <= 10; clusterDistance+= 2){
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
    
    
    private static void measureInputSynchronizationConstraint(String outputFileName, int traceSize){
        final String TESSLAFILEPATH = "tmp/InputSynchronizationConstraintTimeMeasure.tessla";
        final int traceCount = 100;
        SingleMeasureResult[] results = new SingleMeasureResult[traceCount];
        String[] params = new String[traceCount];
        int i = 0;
        for (int streamCount = 2; streamCount <= 5; streamCount++)//4
            for (int tolerance = 2; tolerance <= 10; tolerance+= 2)//5
                for (int clusterDistance = 2; clusterDistance <= 10; clusterDistance+= 2){
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
    

    private static long minAvg(SingleMeasureResult[] results){
        long minAvg = Long.MAX_VALUE;
        for (SingleMeasureResult current: results){
            minAvg= Math.min(current.getAvg(), minAvg);
        }
        return minAvg;
    }
    
    private static long maxAvg(SingleMeasureResult[] results){
        long maxAvg = 0;
        for (SingleMeasureResult current: results){
            maxAvg= Math.max(current.getAvg(), maxAvg);
        }
        return maxAvg;
    }
    
    private static SingleMeasureResult overallAverage(SingleMeasureResult[] results){
        long min = 0;
        long max = 0;
        long avg = 0;
        for (SingleMeasureResult current: results){
            min+= current.getMin();
            max+= current.getMax();
            avg+= current.getAvg();
        }
        return new SingleMeasureResult(min/results.length, max/results.length, avg/results.length);
    }
    
    private static SingleMeasureResult overallResults(SingleMeasureResult[] results){
        long min = Integer.MAX_VALUE;
        long max = 0;
        long avg = 0;
        for (SingleMeasureResult current: results){
            min= Math.min(current.getMin(), min);
            max= Math.max(current.getMax(), max);
            avg+= current.getAvg();
        }
        return new SingleMeasureResult(min, max, avg/results.length);
    }
}