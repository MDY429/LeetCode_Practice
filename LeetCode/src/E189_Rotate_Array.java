/**
 * url: https://leetcode.com/problems/rotate-array/
 * 
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * Example 1:
 * 
 * Input: [1,2,3,4,5,6,7] and k = 3 , Output: [5,6,7,1,2,3,4]
 * 
 * Explanation: 
 * rotate 1 steps to the right: [7,1,2,3,4,5,6] 
 * rotate 2 steps to the right: [6,7,1,2,3,4,5] 
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different
 * ways to solve this problem. Could you do it in-place with O(1) extra space?
 */
public class E189_Rotate_Array {

    /**
     * Method1, record the last element, move forward a position and set first
     * element be last one until k times.
     * 
     * @param nums The input of array.
     * @param k    The number of steps doing rotation.
     */
    public void rotate(int[] nums, int k) {

        for (int i = 0; i < k % nums.length; i++) {
            int tmp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }

    /**
     * Method2, moving as a circle until every element are traversed.
     * 
     * @param nums The input of array.
     * @param k    The number of steps doing rotation.
     */
    public void rotate2(int[] nums, int k) {

        k = k % nums.length;
        for (int start = 0, count = 0; count < nums.length; start++) {
            int current = start;
            int previous = nums[start];

            do {
                int next = (current + k) % nums.length;
                int tmp = nums[next];
                nums[next] = previous;
                previous = tmp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    /**
     * Method3, using reverse to do the rotation. Reverse all element, reverse first
     * k elements, then reverse last elements.
     * 
     * @param nums The input of array.
     * @param k    The number of steps doing rotation.
     */
    public void rotate3(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    /**
     * Swap the symmetric position to make array reverse.
     * @param nums The input of array.
     * @param start The first position.
     * @param end The last position.
     */
    private void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        E189_Rotate_Array e189 = new E189_Rotate_Array();
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        e189.rotate(nums, 5);
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] nums2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        e189.rotate2(nums2, 5);
        for (int num : nums2) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] nums3 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        e189.rotate3(nums3, 5);
        for (int num : nums3) {
            System.out.print(num + " ");
        }

    }
}