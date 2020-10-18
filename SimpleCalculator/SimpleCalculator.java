/**
 *
 * @author ruslan
 */
 
 // Usage: 
 // javac SimpleCalculator.java
 // java SimpleCalculator <arg> 
 // Example: SimpleCalculator add

public class SimpleCalculator {



    public int add(int a, int b) {
        // replace this return statement in order to add a to b
        return 0;
    }

    // LEAVE THE REST OF THE CODE
    public int subtract(int a, int b) {

        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // This has errors on purpose. The idea is to see
    // If CodeGrade will detect this.
    
    public int divide(int a, int b) {

        return a - b;
    }
    
    
    
    ///////////////////////////////////////////////////////////////////
    // DO NOT MODIFY THIS AREA
    ///////////////////////////////////////////////////////////////////
    
    // Argument args[0] is the first parameter when this
    // Class is called from the terminal using "java SimpleCalculator <argument>"
    
    public static void main(String[] args) {
        
        SimpleCalculator SC = new SimpleCalculator();
 
        
        switch(args[0])
        {
            case "add":
               System.out.println(SC.add(3,5));         // Expected 8
               break;
            case "subtract":
               System.out.println(SC.subtract(20,5));  // Expected 15
               break;
            case "multiply":
               System.out.println(SC.multiply(4,5));   // Expected 20
            case "multiply":
               System.out.println(SC.multiply(4,5));   // Expected 20
                
            
        }

    }
    
    ///////////////////////////////////////////////////////////////////

}
