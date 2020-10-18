/**
 *
 * @author ruslan
 */
 
////////////////////////////////////////////////////////////////
// DO NOT MODIFY THIS CLASS
////////////////////////////////////////////////////////////////
// Usage: 
// javac SimpleCalculatorTest.java
// java SimpleCalculatorTest <arg> 
// Example: SimpleCalculatorTest multiply

public class SimpleCalculatorTest {


    // Argument args[0] is the first parameter when this
    // Class is called from the terminal using "java SimpleCalculatorTest <argument>"
    public static void main(String[] args) {

        SimpleCalculator SC = new SimpleCalculator();
        
        if(args.length<1)
        {
            System.out.println("Usage: java SimpleCalculatorTest <arg> ");
            System.out.println("Exiting Test Program");
            System.exit(0);
        }

        switch (args[0]) {
            case "add":
                System.out.println(SC.add(3, 5));         // Expected 8
                break;
            case "subtract":
                System.out.println(SC.subtract(20, 5));  // Expected 15
                break;
            case "multiply":
                System.out.println(SC.multiply(4, 5));   // Expected 20
                break;
            case "divide":
                System.out.println(SC.divide(10, 5));   // Expected 2
                break;
            default:
                System.out.println("Uknown argument");
                
            
        }

    }

    ///////////////////////////////////////////////////////////////////
}
