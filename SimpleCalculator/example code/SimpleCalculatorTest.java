import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ruslan
 */
public class SimpleCalculatorTest {
    
    public SimpleCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class SimpleCalculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 3;
        int b = 5;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 8;
        int result = instance.add(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of subtract method, of class SimpleCalculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 12;
        int b = 2;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 10;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of multiply method, of class SimpleCalculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 4;
        int b = 5;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 20;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of divide method, of class SimpleCalculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 10;
        int b = 5;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 2;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);

    }
    
}
