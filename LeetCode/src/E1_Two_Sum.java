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

    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(target - nums[i] == nums[j]){
                    return new int[]{i ,j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum.");
    }

    public static void main(String[] args) {
        E1_Two_Sum solution = new E1_Two_Sum();
        int[] nums = new int[] {2,7,11,15};
        int target = 17;
        
        try {
            int[] ans = solution.twoSum(nums, target);
            System.out.println("[" + ans[0] + ", " + ans[1] + "]");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}