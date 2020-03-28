import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E26_Test {

    E26_Remove_Duplicates_from_Sorted_Array e26;
    int[] num1, num2, num3, num4;

    @BeforeEach
    public void init() {
        e26 = new E26_Remove_Duplicates_from_Sorted_Array();
        num1 = new int[] { 0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5 };
        num2 = new int[] { 0, 1, 2, 3, 4, 5, 6 };
        num3 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        num4 = new int[] {};
    }

    @Test
    public void E26_test1() {
        int expected = 6;
        int actual = e26.removeDuplicates(num1);
        assertEquals(expected, actual);

        int[] expectedArr = new int[] { 0, 1, 2, 3, 4, 5 };
        for (int i = 0; i < actual; i++) {
            assertEquals(expectedArr[i], num1[i]);
        }
    }

    @Test
    public void E26_test2() {
        int expected = 7;
        int actual = e26.removeDuplicates(num2);
        assertEquals(expected, actual);

        int[] expectedArr = new int[] { 0, 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < actual; i++) {
            assertEquals(expectedArr[i], num2[i]);
        }
    }

    @Test
    public void E26_test3() {
        int expected = 1;
        int actual = e26.removeDuplicates(num3);
        assertEquals(expected, actual);

        int[] expectedArr = new int[] { 0};
        for (int i = 0; i < actual; i++) {
            assertEquals(expectedArr[i], num3[i]);
        }
    }

    @Test
    public void E26_test4() {
        int expected = 0;
        int actual = e26.removeDuplicates(num4);
        assertEquals(expected, actual);
    }

}