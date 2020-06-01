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
public class M77_Test {

    M77_Combinations m77 = new M77_Combinations();

    @Test
    public void M77_test1() {
        int n = 4;
        int k = 1;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(4));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1));

        List<List<Integer>> actual = m77.combine(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void M77_test2() {
        int n = 4;
        int k = 4;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3, 4));

        List<List<Integer>> actual = m77.combine(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void M77_test3() {
        int n = 4;
        int k = 5;
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> actual = m77.combine(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void M77_test4() {
        int n = 4;
        int k = 0;
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> exp = new ArrayList<>();
        expected.add(exp);

        List<List<Integer>> actual = m77.combine(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void M77_test5() {
        int n = 5;
        int k = 3;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3,4,5));
        expected.add(Arrays.asList(2,4,5));
        expected.add(Arrays.asList(2,3,5));
        expected.add(Arrays.asList(2,3,4));
        expected.add(Arrays.asList(1,4,5));
        expected.add(Arrays.asList(1,3,5));
        expected.add(Arrays.asList(1,3,4));
        expected.add(Arrays.asList(1,2,5));
        expected.add(Arrays.asList(1,2,4));
        expected.add(Arrays.asList(1,2,3));
        
        List<List<Integer>> actual = m77.combine(n, k);
        assertEquals(expected, actual);
    }
}