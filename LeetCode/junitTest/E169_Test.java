import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E169_Test {

    E169_Majority_Element e169 = new E169_Majority_Element();

    @Test
    public void E169_test1() {
        int[] nums = new int[] { 0 };
        int expected = 0;
        int actual = e169.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void E169_test2() {
        int[] nums = new int[] { 3, 2, 1, 0, 0, 0, 0 };
        int expected = 0;
        int actual = e169.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void E169_test3() {
        int[] nums = new int[] { 5, 1, 3, 5, 5, 9, 5, 1, 5 };
        int expected = 5;
        int actual = e169.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void E169_test4() {
        int[] nums = new int[] { 2, 2, 1, 1 };

        assertThrows(IllegalArgumentException.class, () -> {
            e169.majorityElement(nums);
        });
    }
}