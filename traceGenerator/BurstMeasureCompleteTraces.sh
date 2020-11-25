#!/bin/sh
for maxOccurrences in `seq 1 100`;
do
    echo "maxOccurrences: $maxOccurrences, length: $(( $maxOccurrences *4 )) "
    java TimeMeasureBurstConstraint $(( $maxOccurrences *4 )) $maxOccurrences tmp/BurstConstraintTimeMeasure.tessla
    java testTraceGenerator BurstConstraint tmp/burst.trace 10000 $(( $maxOccurrences *4 )) $maxOccurrences
    time ../tessla.sh tmp/BurstConstraintTimeMeasure.tessla tmp/burst.trace
done
