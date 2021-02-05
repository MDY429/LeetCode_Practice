import java.util.HashMap;
import java.util.Map;

/**
 * We define a harmonious array as an array where the difference between its
 * maximum value and its minimum value is exactly 1.
 * 
 * Given an integer array nums, return the length of its longest harmonious
 * subsequence among all its possible subsequences.
 * 
 * A subsequence of array is a sequence that can be derived from the array by
 * deleting some or no elements without changing the order of the remaining
 * elements.
 * 
 * Example 1: Input: nums = [1,3,2,2,5,2,3,7] Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * 
 * Example 2:Input: nums = [1,2,3,4] Output: 2
 * 
 * Example 3:Input: nums = [1,1,1,1] Output: 0
 * 
 * 
 * Constraints:
 * 1. 1 <= nums.length <= 2 * 104
 * 2. -109 <= nums[i] <= 109
 */
public class E594_Longest_Harmonious_Subsequence {

    /**
     * Using hash table to record the key and how many times the key shows up. Then,
     * using containKey to check whether fit the harmonious subsequence.
     * 
     * @param nums The input of array.
     * @return The number of harmonious subsequence.
     */
    public int findLHS(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int key : map.keySet()) {
            if(map.containsKey(key + 1)) {
                max = Math.max(max, map.get(key)+map.get(key+1));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        E594_Longest_Harmonious_Subsequence e594 = new E594_Longest_Harmonious_Subsequence();
        int[] nums = new int[] { 1, 3, 1, 3, 2, 2, 5, 2, 3, 7 };
        System.out.println(e594.findLHS(nums));
    }
}