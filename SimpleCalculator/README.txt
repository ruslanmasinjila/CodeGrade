Suppose SimpleCalculatorTest.java is your junit file in $FIXUTES and SimpleCalculator.java is the students' java submission.
========================================================================================================
Global setup script to run:   cg-junit5 install
Per-student setup script to run:  cp $FIXTURES/*.java . && cg-junit5 compile *.java
Program to test in Unit test:  cg-junit5 run -- -c SimpleCalculatorTest