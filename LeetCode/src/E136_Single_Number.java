import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * url: https://leetcode.com/problems/single-number/
 * 
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * Example 1: Input: [2,2,1] Output: 1
 * 
 * Example 2: Input: [4,1,2,1,2] Output: 4
 */
public class E136_Single_Number {

    /**
     * Use map to record duplicate number and entrySet to find the single value.
     * 
     * @param nums The input of number array.
     * @return The single number.
     */
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer a = 1;
            if (map.containsKey(nums[i])) {
                a = map.get(nums[i]);
                a++;
            }
            map.put(nums[i], a);
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new IllegalArgumentException("No single number.");
    }

    /**
     * Use getOrDefault to record duplicate number.
     * 
     * @param nums The input of number array.
     * @return The single number.
     */
    public int singleNumber_map2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            // getOrDefault -> if find the key, return value. Otherwise set value to
            // default(0).
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }

        throw new IllegalArgumentException("No single number.");
    }

    public static void main(String[] args) {
        E136_Single_Number e136 = new E136_Single_Number();
        int[] nums = new int[] { 2, 3, 1, 2, 1, 0, 4, 3, 0 };

        System.out.println(e136.singleNumber(nums));
        System.out.println(e136.singleNumber_map2(nums));
    }
}