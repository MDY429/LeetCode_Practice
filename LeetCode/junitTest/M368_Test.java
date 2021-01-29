import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */

public class M368_Test {

    M368_Largest_Divisible_Subset m368;
    int[] a1, a2, a3, a4, a5;

    @BeforeEach
    public void init() {
        m368 = new M368_Largest_Divisible_Subset();

        a1 = new int[] { 21, 7, 2, 28, 14 };

        a2 = new int[] { 1, 3, 17, 97 };

        a3 = new int[] { 95 };

        a4 = new int[] { 5, 9, 18, 54, 108, 540, 90, 180, 360, 720 };
    }

    @Test
    public void m368_Test1() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 14, 28));
        List<Integer> actual = m368.largestDivisibleSubset(a1);

        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void m368_Test2() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3));
        List<Integer> actual = m368.largestDivisibleSubset(a2);

        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void m368_Test3() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(95));
        List<Integer> actual = m368.largestDivisibleSubset(a3);

        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void m368_Test4() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(9, 18, 90, 180, 360, 720));
        List<Integer> actual = m368.largestDivisibleSubset(a4);

        Collections.sort(actual);
        assertEquals(expected, actual);
    }
}
