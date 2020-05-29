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
public class M78_Test {
    
    M78_Subsets m78;
    int[] n1,n2,n3;

    @BeforeEach
    public void init() {
        m78 = new M78_Subsets();

        n1 = new int[] {1,2};
        n2 = new int[] {1,2,3};
        n3 = new int[]{};
    }

    @Test
    public void M78_test1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(new ArrayList<>());
        List<List<Integer>> actual = m78.subsets(n1);

        assertEquals(expected, actual);
    }

    @Test
    public void M78_test2() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1,2,3));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(1,3));
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2,3));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(new ArrayList<>());
        List<List<Integer>> actual = m78.subsets(n2);

        assertEquals(expected, actual);
    }

    @Test
    public void M78_test3() {
        List<Integer> exp = new ArrayList<>();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(exp);
        List<List<Integer>> actual = m78.subsets(n3);

        assertEquals(expected, actual);
    }
}