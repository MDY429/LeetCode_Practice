import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M89_Test {

    M89_Gray_Code m89 = new M89_Gray_Code();

    @Test
    public void M89_loop_test1() {
        int n = 0;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0));
        List<Integer> actual = m89.grayCode(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_loop_test2() {
        int n = 1;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1));
        List<Integer> actual = m89.grayCode(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_loop_test3() {
        int n = 2;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 2));
        List<Integer> actual = m89.grayCode(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_loop_test4() {
        int n = 3;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4));
        List<Integer> actual = m89.grayCode(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_loop_test5() {
        int n = 4;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8));
        List<Integer> actual = m89.grayCode(n);

        assertEquals(expected, actual);
    }

    // Recursion test.
    @Test
    public void M89_recursion_test1() {
        int n = 0;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0));
        List<Integer> actual = m89.grayCode_Recursion(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_recursion_test2() {
        int n = 1;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1));
        List<Integer> actual = m89.grayCode_Recursion(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_recursion_test3() {
        int n = 2;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 2));
        List<Integer> actual = m89.grayCode_Recursion(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_recursion_test4() {
        int n = 3;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4));
        List<Integer> actual = m89.grayCode_Recursion(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M89_recursion_test5() {
        int n = 4;
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8));
        List<Integer> actual = m89.grayCode_Recursion(n);

        assertEquals(expected, actual);
    }

}