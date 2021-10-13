To run the runtime measurement, you need to compile all *.java and *.scala files in this directory, and then run the main method of the class timeMeasureRunner.
The commands scalac and scala must be accessible for the java command Runtime.getRuntime().exec(), which could lead to problems when using Windows.

Start the runtime measurement  with the commands:

javac *.java
scalac *.scala
scala timeMeasureRunner
