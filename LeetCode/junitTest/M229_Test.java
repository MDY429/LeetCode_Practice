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
public class M229_Test {

    M229_Majority_Element_II m229 = new M229_Majority_Element_II();

    @Test
    public void M229_test1() {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 2 };
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> actual = m229.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void M229_test2() {
        int[] nums = new int[] { 3, 2, 1, 1, 3, 2, 3, 2 };
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 3));
        List<Integer> actual = m229.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void M229_test3() {
        int[] nums = new int[] { 1 };
        List<Integer> expected = new ArrayList<>(Arrays.asList(1));
        List<Integer> actual = m229.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void M229_test4() {
        int[] nums = new int[] {};
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = m229.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void M229_test5() {
        int[] nums = new int[] { 1, 2, 3, 3, 2, 1 };
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = m229.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void M229_test6() {
        int[] nums = new int[] { 1, 1, 1, 1, 2, 2 };
        List<Integer> expected = new ArrayList<>(Arrays.asList(1));
        List<Integer> actual = m229.majorityElement(nums);
        assertEquals(expected, actual);
    }
}