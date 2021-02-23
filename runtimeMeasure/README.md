# Runtime Measurement Tool

Requires a compatible TeSSLa .jar file in *\.\./\.\./tessla-assembly-1.2.2.jar.*
This program is generating traces fulfilling specific timing constraints and monitoring them via the programmed TeSSLa specifications. While monitoring, the time between the input and output of individual timestamps is measured. The results are stored in _/results/_.

### Running the Time Measurement

The measurement for the runtimes can be started by compiling and running _TimeMeasureAll.java_.

### Generating Traces (without Time Measurement)

Traces can be generated by compiling and running _testTraceGenerator.java_.
Usage:  _java testTraceGenerator <Constraint> <Output file> <Number of Events> <Constraint parameters>_
