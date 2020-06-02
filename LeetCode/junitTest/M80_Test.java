import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M80_Test {

    M80_Remove_Duplicates_from_Sorted_Array_II m80;
    int[] n1, n2, n3, n4, n5;

    @BeforeEach
    public void init() {
        m80 = new M80_Remove_Duplicates_from_Sorted_Array_II();

        n1 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };
        n2 = new int[] { 0, 0, 0, 1, 1, 2, 2, 2, 3, 4, 4, 4 };
        n3 = new int[] { 1, 2, 2, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5 };
        n4 = new int[] { -5, 0 };
        n5 = new int[] {};
    }

    @Test
    public void M80_test1() {
        int[] expected = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };
        m80.removeDuplicates(n1);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], n1[i]);
        }
    }

    @Test
    public void M80_test2() {
        int[] expected = new int[] { 0, 0, 1, 1, 2, 2, 3, 4, 4 };
        m80.removeDuplicates(n2);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], n2[i]);
        }
    }

    @Test
    public void M80_test3() {
        int[] expected = new int[] { 1, 2, 2, 3, 3, 4, 4, 5 };
        m80.removeDuplicates(n3);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], n3[i]);
        }
    }

    @Test
    public void M80_test4() {
        int[] expected = new int[] { -5, 0 };
        m80.removeDuplicates(n4);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], n4[i]);
        }
    }

    @Test
    public void M80_test5() {
        int[] expected = new int[] {};
        m80.removeDuplicates(n5);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], n5[i]);
        }
    }

}