import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */

public class E1_Two_Sum {

    /**
     * Use hash map to find out the two sum.
     * 
     * @param nums   The input of integer array.
     * @param target The target value of two sum.
     * @return The integer array for the position.
     */
    public int[] twoSum_map(int[] nums, int target) {

        // Create a hash map to store array value and position.
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashMap.containsKey(complement)) {
                // return the previous position in hashmap and i for now.
                return new int[] { hashMap.get(complement), i };
            }
            hashMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum.");
    }

    /**
     * Use for loop to find the two sum.
     * 
     * @param nums   The input of integer array.
     * @param target The target value of two sum.
     * @return The integer array for the position.
     */
    public int[] twoSum(int[] nums, int target) {

        /*
         * If there still cannot find the solution at nums.length - 1, no need to keep
         * find the next value.
         */
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("No two sum.");
    }

    public static void main(String[] args) {
        E1_Two_Sum solution = new E1_Two_Sum();
        int[] nums = new int[] {2,7,11,15};
        int target = 26;
        
        try {
            int[] ans = solution.twoSum(nums, target);
            System.out.println("[" + ans[0] + ", " + ans[1] + "]");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            int[] ans = solution.twoSum_map(nums, target);
            System.out.println("[" + ans[0] + ", " + ans[1] + "]");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}