import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E202_Test {
    
    E202_Happy_Number e202 = new E202_Happy_Number();

    @Test
    public void E202_test1() {
        int n = 19;
        assertTrue(e202.isHappy(n));
    }

    @Test
    public void E202_test2() {
        int n = 201;
        assertFalse(e202.isHappy(n));
    }

    @Test
    public void E202_test3() {
        int n = 34;
        assertFalse(e202.isHappy(n));
    }

    @Test
    public void E202_test4() {
        int n = 90;
        assertFalse(e202.isHappy(n));
    }

    @Test
    public void E202_test5() {
        int n = 1000000;
        assertTrue(e202.isHappy(n));
    }
}