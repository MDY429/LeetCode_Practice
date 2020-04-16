import java.util.ArrayList;
import java.util.List;

/**
 * url: https://leetcode.com/problems/majority-element-ii/
 * 
 * reference:
 * https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
 * 
 * reference2: https://www.geeksforgeeks.org/n3-repeated-number-array-o1-space/
 * 
 * Given an integer array of size n, find all elements that appear more than ⌊
 * n/3 ⌋ times.
 * 
 * Note: The algorithm should run in linear time and in O(1) space.
 * 
 * Example 1: Input: [3,2,3] Output: [3]
 * 
 * Example 2: Input: [1,1,1,3,3,2,2,2] Output: [1,2]
 */
public class M229_Majority_Element_II {

    /**
     * Use Boyer–Moore majority vote algorithm to implement this question.
     * 
     * @param nums The input of array.
     * @return The majority number list.
     */
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> result = new ArrayList<>();
        int counter1 = 0;
        int counter2 = 0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // To find two majority number.
        for (int num : nums) {
            if (counter1 == 0) {
                counter1++;
                first = num;
            } else if (counter2 == 0) {
                counter2++;
                second = num;
            } else if (first == num) {
                counter1++;
            } else if (second == num) {
                counter2++;
            } else {
                counter1--;
                counter2--;
            }
        }

        // Set counter to 0 to recount.
        counter1 = 0;
        counter2 = 0;

        // Check that how many the same values are.
        for (int num : nums) {
            if (first == num) {
                counter1++;
            } else if (second == num) {
                counter2++;
            }
        }

        if (counter1 > nums.length / 3) {
            result.add(first);
        }
        if (counter2 > nums.length / 3) {
            result.add(second);
        }

        return result;
    }

    public static void main(String[] args) {
        M229_Majority_Element_II m229 = new M229_Majority_Element_II();
        int[] nums = new int[] { 3, 2, 1, 1, 3, 2, 3, 2 };

        System.out.println(m229.majorityElement(nums).toString());
    }
}