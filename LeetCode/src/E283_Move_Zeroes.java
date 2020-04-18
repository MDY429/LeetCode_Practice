/**
 * url: https://leetcode.com/problems/move-zeroes/
 * 
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * Example:
 * 
 * Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * Note:
 * 1. You must do this in-place without making a copy of the array.
 * 2. Minimize the total number of operations.
 */
public class E283_Move_Zeroes {

    /**
     * Exchange the 0 element to the last of array.
     * 
     * @param nums The input of array.
     */
    public void moveZeroes(int[] nums) {

        int index = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index > -1 && nums[i] == 0) {
                count++;
                continue;
            } else if (nums[i] == 0) {
                index = i;
            } else if (index > -1 && nums[i] != 0) {
                nums[index] = nums[i];
                nums[i] = 0;
                index = i - count;
            }
        }
    }

    public static void main(String[] args) {
        E283_Move_Zeroes e283 = new E283_Move_Zeroes();
        int[] nums = new int[] { 0, 1, 2, 0, 0, 3, 4, 0, 5, 0 };

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        e283.moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}