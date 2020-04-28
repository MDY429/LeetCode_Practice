import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E977_Test {

    E977_Squares_of_a_Sorted_Array e977;
    int[] n1, n2, n3, n4, n5;

    @BeforeEach
    public void init() {
        e977 = new E977_Squares_of_a_Sorted_Array();

        n1 = new int[] { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };
        n2 = new int[] { 0, 1, 2, 3, 4, 5 };
        n3 = new int[] { -5, -4, -3, -2, -1 };
        n4 = new int[] {};
        n5 = new int[] { -10, -9, -8, 1, 2, 3 };
    }

    @Test
    public void E977_test1() {
        int[] expected = new int[] { 0, 1, 1, 4, 4, 9, 9, 16, 16, 25, 25 };
        int[] actual = e977.sortedSquares(n1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test2() {
        int[] expected = new int[] { 0, 1, 4, 9, 16, 25 };
        int[] actual = e977.sortedSquares(n2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test3() {
        int[] expected = new int[] { 1, 4, 9, 16, 25 };
        int[] actual = e977.sortedSquares(n3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test4() {
        int[] expected = new int[] {};
        int[] actual = e977.sortedSquares(n4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test5() {
        int[] expected = new int[] { 1, 4, 9, 64, 81, 100 };
        int[] actual = e977.sortedSquares(n5);
        assertArrayEquals(expected, actual);
    }

    // Two pointer
    @Test
    public void E977_test1_two_pointer() {
        int[] expected = new int[] { 0, 1, 1, 4, 4, 9, 9, 16, 16, 25, 25 };
        int[] actual = e977.sortedSquares_TwoPointer(n1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test2_two_pointer() {
        int[] expected = new int[] { 0, 1, 4, 9, 16, 25 };
        int[] actual = e977.sortedSquares_TwoPointer(n2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test3_two_pointer() {
        int[] expected = new int[] { 1, 4, 9, 16, 25 };
        int[] actual = e977.sortedSquares_TwoPointer(n3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test4_two_pointer() {
        int[] expected = new int[] {};
        int[] actual = e977.sortedSquares_TwoPointer(n4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E977_test5_two_pointer() {
        int[] expected = new int[] { 1, 4, 9, 64, 81, 100 };
        int[] actual = e977.sortedSquares_TwoPointer(n5);
        assertArrayEquals(expected, actual);
    }
}