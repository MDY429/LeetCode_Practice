/**
 * url: https://leetcode.com/problems/sort-colors/
 * 
 * Given an array with n objects colored red, white or blue, sort them in-place
 * so that objects of the same color are adjacent, with the colors in the order
 * red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
 * and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this
 * problem.
 * 
 * Example:
 * 
 * Input: [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
 * 
 * Follow up:
 * 
 * A rather straight forward solution is a two-pass algorithm using counting
 * sort. First, iterate the array counting number of 0's, 1's, and 2's, then
 * overwrite array with total number of 0's, then 1's and followed by 2's. Could
 * you come up with a one-pass algorithm using only constant space?
 */
public class M75_Sort_Colors {

    /**
     * Only three colors, we can set 3 stats. SWAP left or right element when
     * meeting red and blue. otherwise i keep counting.
     * 
     * @param nums The input of number array.
     */
    public void sortColors(int[] nums) {
        // RED:0, WHITE:1, BLUE:2

        int left = 0;
        int right = nums.length - 1;
        int i = 0;

        // i > right means the BLUE are done.
        while (i <= right) {

            if (nums[i] == 0 && i != left) {
                // Find the red.
                nums[i] = nums[left];
                nums[left] = 0;
                left++;
            } else if (nums[i] == 2 && i != right) {
                // Find the blue.
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            } else {
                // Find the white
                i++;
            }
        }
    }

    public static void main(String[] args) {

        M75_Sort_Colors m75 = new M75_Sort_Colors();
        int[] nums = new int[] { 1, 2, 0, 1, 2, 0, 0, 2, 1 };

        m75.sortColors(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}