# Tests for the TIMMO-2-USE Timing Constraint monitors

## Running the tests

java -jar _tessla_ interpreter <tessla-file> <trace-file>

The TeSSLa Specifications in this folder are meant to be run with the matching traces in the /traces/ folder. For example, the sepcification testAgeConstraint2.tessla should be run with /traces/AgeConstraint2.trace, /traces/AgeConstraint2a.trace, /traces/AgeConstraint2b.trace and /traces/AgeConstraint2c.trace. The expected behaviour is written as comments in the trace file.