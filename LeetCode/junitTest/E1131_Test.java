import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E1131_Test {

    E1131_Rank_Transform_of_an_Array e1131 = new E1131_Rank_Transform_of_an_Array();

    @Test
    public void E1131_test1() {
        int[] arr = new int[] { 100, 100 };
        int[] expected = new int[] { 1, 1 };
        int[] actual = e1131.arrayRankTransform(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E1131_test2() {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 100 };
        int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] actual = e1131.arrayRankTransform(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E1131_test3() {
        int[] arr = new int[] { 5, 4, 3, 2, 1 };
        int[] expected = new int[] { 5, 4, 3, 2, 1 };
        int[] actual = e1131.arrayRankTransform(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E1131_test4() {
        int[] arr = new int[] { 100, 5, 8, 3, 5, 6, 9, 10 };
        int[] expected = new int[] { 7, 2, 4, 1, 2, 3, 5, 6 };
        int[] actual = e1131.arrayRankTransform(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E1131_test5() {
        int[] arr = new int[] { -100, 100, -50, 10 };
        int[] expected = new int[] { 1, 4, 2, 3 };
        int[] actual = e1131.arrayRankTransform(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E1131_test6() {
        int[] arr = new int[] {};
        int[] expected = new int[] {};
        int[] actual = e1131.arrayRankTransform(arr);
        assertArrayEquals(expected, actual);
    }
}