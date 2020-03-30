/**
 * url: https://leetcode.com/problems/maximum-subarray/
 * 
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 
 * Explanation: [4,-1,2,1] has the largest sum = 6. 
 * 
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * Reference Video: https://www.youtube.com/watch?v=yBCzO0FpsVc
 */
public class E53_Maximum_Subarray {

    /**
     * Method 1: use loop to find the max subArray.
     * 
     * @param nums The input of numbers.
     * @return The maximum sum of subArray.
     */
    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums should contain at least on number.");
        }

        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (sum < 0 && nums[i] > sum) {
                sum = nums[i];
                maxSum = Math.max(maxSum, sum);
                continue;
            }
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    /**
     * Method 2: use Divide and Conquer to find the max subArray.
     * 
     * @param nums The input of numbers.
     * @return The maximum sum of subArray.
     */
    public int divideAndConquer(int[] nums) {

        return maxSum(nums, 0, nums.length - 1);
    }

    /**
     * Give the boundary to find the max sum of subArray.
     * 
     * @param nums The input of numbers.
     * @param l    The left boundary.
     * @param r    The right boundary.
     * @return The maximum sum of subArray.
     */
    private int maxSum(int[] nums, int l, int r) {

        // Base case.
        if (r <= l) {
            return nums[l];
        }

        int mid = l + (r - l) / 2;

        // The left.
        int leftMax = maxSum(nums, l, mid);
        // The right.
        int rightMax = maxSum(nums, mid + 1, r);
        // The crossing.
        int crossingMax = maxCrossing(nums, l, mid, r);

        return Math.max(Math.max(leftMax, rightMax), crossingMax);
    }

    /**
     * To find the max of crossing subArray when using divide and conquer.
     * 
     * @param nums The input of numbers.
     * @param l    The left boundary.
     * @param mid  The index of middle sub array.
     * @param r    The right boundary.
     * @return The max sum of sub array.
     */
    private int maxCrossing(int[] nums, int l, int mid, int r) {
        int maxSubLeft = nums[mid];
        int maxSubRight = nums[mid + 1];
        int leftSum = nums[mid];
        int rightSum = nums[mid + 1];
        for (int i = mid - 1; i >= l; i--) {
            leftSum += nums[i];
            maxSubLeft = Math.max(maxSubLeft, leftSum);
        }

        for (int i = mid + 2; i <= r; i++) {
            rightSum += nums[i];
            maxSubRight = Math.max(maxSubRight, rightSum);
        }

        return maxSubLeft + maxSubRight;
    }

    public static void main(String[] args) {
        E53_Maximum_Subarray e53 = new E53_Maximum_Subarray();

        // int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, -10, -1, 0, -2, 5, 6 };
        // int[] nums = new int[] { 5, 4, 3, 2, 1, -10, -5, 2, 2, 2, 2, 2, 2, 2, 2, 2 };

        System.out.println(e53.maxSubArray(nums));
        System.out.println(e53.divideAndConquer(nums));
    }
}