import java.util.HashMap;
import java.util.Map;

/**
 * url: https://leetcode.com/problems/majority-element/
 * 
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1: Input: [3,2,3] Output: 3
 * 
 * Example 2: Input: [2,2,1,1,1,2,2] Output: 2
 */
public class E169_Majority_Element {

    /**
     * Use hash map to find the majority element.
     * 
     * @param nums The input of array.
     * @return The majority number.
     */
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        throw new IllegalArgumentException("There is no majority element");
    }

    /**
     * Use Boyer–Moore majority vote algorithm to implement this question.
     * 
     * @param nums The input of array.
     * @return The majority number.
     */
    public int Boyer_Moore_Vote(int[] nums) {

        int candidate = 0;
        int counter = 0;

        // To find the majority number.
        for (int num : nums) {
            if (counter == 0) {
                candidate = num;
                counter++;
            } else if (candidate == num) {
                counter++;
            } else {
                counter--;
            }
        }

        // Set counter to 0 to recount.
        counter = 0;

        // Check that how many the same values are.
        for (int num : nums) {
            if (num == candidate) {
                counter++;
            }
        }

        if (counter > nums.length / 2) {
            return candidate;
        }

        throw new IllegalArgumentException("There is no majority element");
    }

    public static void main(String[] args) {
        E169_Majority_Element e169 = new E169_Majority_Element();
        int[] nums = new int[] { 1 };

        System.out.println(e169.majorityElement(nums));
        System.out.println(e169.Boyer_Moore_Vote(nums));
    }
}