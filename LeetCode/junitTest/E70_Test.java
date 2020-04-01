import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E70_Test {

    E70_Climbing_Stairs e70 = new E70_Climbing_Stairs();

    @Test
    public void E70_test() {
        int[] n = new int[] { 1, 2, 3, 5, 10, 15 };
        int[] expected = new int[] { 1, 2, 3, 8, 89, 987 };

        for (int i = 0; i < n.length; i++) {
            assertEquals(expected[i], e70.climbStairs(n[i]));
        }
    }
}