import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E217_Test {

    E217_Contains_Duplicate e217;
    int[] a, b, c, d, e, f;

    @BeforeEach
    public void init() {
        e217 = new E217_Contains_Duplicate();

        a = new int[] { 1, 2, 3, 1 };
        b = new int[] { 3, 2, 5, 6, 1 };
        c = new int[] { 1, 1, 1, 1, 1 };
        d = new int[] { -987987, 99, 0, 987987, 654654, 321321, 987987 };
        e = new int[] { Integer.MAX_VALUE };
        f = new int[] {};
    }

    @Test
    public void E217_test1() {
        assertTrue(e217.containsDuplicate(a));

        assertFalse(e217.containsDuplicate(b));

        assertTrue(e217.containsDuplicate(d));

        assertTrue(e217.containsDuplicate(d));

        assertFalse(e217.containsDuplicate(e));

        assertFalse(e217.containsDuplicate(f));
    }
}