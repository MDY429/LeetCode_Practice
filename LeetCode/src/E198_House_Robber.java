/**
 * url: https://leetcode.com/problems/house-robber/
 * 
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * Example 1:
 * Input: [1,2,3,1] Output: 4 
 * Explanation: 
 * Rob house 1 (money = 1) and then rob house 3 (money = 3). 
 * Total amount you can rob = 1 + 3 = 4. 
 * 
 * Example 2:
 * Input: [2,7,9,3,1] Output: 12 
 * Explanation: 
 * Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 *  Total amount you can rob = 2 + 9 + 1 = 12.
 */
public class E198_House_Robber {

    /**
     * Find the max of first two elements then compare the sum of next position and
     * (next position -2), keep finding max of sum.
     * 
     * @param nums The input of array which is amount of money stashed
     * @return The max money can rob.
     */
    public int rob(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int result = Math.max(nums[0], nums[1]);
        int pre1 = nums[0];
        int pre2 = result;
        for (int i = 2; i < nums.length; i++) {
            result = Math.max(pre2, pre1 + nums[i]);
            pre1 = pre2;
            pre2 = result;
        }

        return result;
    }

    public static void main(String[] args) {
        E198_House_Robber e198 = new E198_House_Robber();
        int[] nums = new int[] {4,1,1,2,1,1 };
        // int[] nums = new int[] { 2, 2, 13, 5, 15, 20 };
        // int[] nums = new int[] { 2 };
        // int[] nums = new int[] { 1, 2, 2, 2, 2 };

        System.out.println(e198.rob(nums));
    }
}