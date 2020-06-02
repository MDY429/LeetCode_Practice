/**
 * url: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 
 * Given a sorted array nums, remove the duplicates in-place such that
 * duplicates appeared at most twice and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * Example 1:
 * 
 * Given nums = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, with the first five elements of nums
 * being 1, 1, 2, 2 and 3 respectively.
 * 
 * It doesn't matter what you leave beyond the returned length.
 * 
 * Example 2:
 * 
 * Given nums = [0,0,1,1,1,1,2,3,3],
 * 
 * Your function should return length = 7, with the first seven elements of nums
 * being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.
 * 
 * It doesn't matter what values are set beyond the returned length.
 */
public class M80_Remove_Duplicates_from_Sorted_Array_II {

    /**
     * Set two point to find the duplicate from beginning.
     * 
     * @param nums The input of numbers array.
     * @return Removed array size.
     */
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0 || nums == null) {
            return 0;
        }

        int newSize = 1;
        int slow = 0;
        int fast = 1;

        while (fast < n) {

            int count = 1;
            while (fast < n && nums[slow] == nums[fast]) {
                if (count < 2) {
                    count++;
                    newSize++;
                    slow++;
                    nums[slow] = nums[fast];
                }
                fast++;
            }

            if (fast < n && nums[slow] != nums[fast]) {
                slow++;
                newSize++;
                nums[slow] = nums[fast];
            }

            fast++;
        }

        return newSize;
    }

    public static void main(String[] args) {
        M80_Remove_Duplicates_from_Sorted_Array_II m80 = new M80_Remove_Duplicates_from_Sorted_Array_II();

        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3 };

        int n = m80.removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}