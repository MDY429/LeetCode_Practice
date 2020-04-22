/**
 * url: https://leetcode.com/problems/house-robber-ii/
 * 
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed. All houses at this place are
 * arranged in a circle. That means the first house is the neighbor of the last
 * one. Meanwhile, adjacent houses have security system connected and it will
 * automatically contact the police if two adjacent houses were broken into on
 * the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * Example 1:
 * Input: [2,3,2] Output: 3
 * Explanation: 
 * You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because
 * they are adjacent houses.
 */
public class M213_House_Robber_II {

    /**
     * Similar with E198. To prevent the adjacent houses(0 and n-1), here divide two
     * part to avoid alert. Compare [0,n-2] and [1,n-1].
     * 
     * @param nums The input of array which is amount of money stashed
     * @return The max money can rob.
     */
    public int rob(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int maxRob1 = Math.max(nums[0], nums[1]);
        int pre11 = nums[0];
        int pre12 = maxRob1;

        int maxRob2 = Math.max(nums[1], nums[2]);
        int pre21 = nums[1];
        int pre22 = maxRob2;

        for (int i = 2, j = 3; i < nums.length - 1 && j < nums.length; i++, j++) {
            maxRob1 = Math.max(pre11 + nums[i], pre12);
            pre11 = pre12;
            pre12 = maxRob1;

            maxRob2 = Math.max(pre21 + nums[j], pre22);
            pre21 = pre22;
            pre22 = maxRob2;
        }

        return Math.max(maxRob1, maxRob2);
    }

    public static void main(String[] args) {
        M213_House_Robber_II m213 = new M213_House_Robber_II();
        // int[] nums = new int[] {2,3,2};
        // int[] nums = new int[] {2,2,2,2,2,2};
        // int[] nums = new int[] {2,3,4,5,6};
        int[] nums = new int[] { 5, 0, 0, 0, 6 };

        System.out.println(m213.rob(nums));
    }
}