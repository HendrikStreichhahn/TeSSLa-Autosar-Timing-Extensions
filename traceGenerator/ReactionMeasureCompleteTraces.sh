#!/bin/sh
for lower in 500 600 700 800 900
do
    for upper in 100 200 300 400 500
    do
        for span in 1 100 250 500
        do
            echo "$lower $(( $lower + $upper )) $span"
            java TimeMeasureRepeatConstraint $lower $(( $lower + $upper )) $span tmp/RepeatConstraintTimeMeasure.tessla
            java testTraceGenerator RepeatConstraint tmp/repeat.trace 10000 $lower $(( $lower + $upper )) $span
            time ../tessla.sh tmp/RepeatConstraintTimeMeasure.tessla tmp/repeat.trace
        done
    done
done
