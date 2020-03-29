/**
 * url: https://leetcode.com/problems/search-insert-position/
 * 
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array. 
 * 
 * Example 1: Input: [1,3,5,6], 5 Output: 2
 * 
 * Example 2: Input: [1,3,5,6], 2 Output: 1
 * 
 * Example 3: Input: [1,3,5,6], 7 Output: 4
 * 
 * Example 4: Input: [1,3,5,6], 0 Output: 0
 */
public class E35_Search_Insert_Position {

    /**
     * Use binary search to find the position. In case for duplicated element, use
     * while loop to avoid same target. Even it is not in the request.
     * 
     * @param nums   The input of number array.
     * @param target The target value.
     * @return The location or the position of insertion in array.
     */
    public int searchInsert(int[] nums, int target) {

        int index = binarySearch(0, nums.length - 1, nums, target);

        // Index should be in (0, length -1)
        while (index > 0 && index < nums.length && nums[index] == target) {
            if (nums[--index] != target) {
                return index + 1;
            }
        }

        return index;
    }

    /**
     * Use recursion to implement Binary Search.
     * 
     * @param l      The left boundary.
     * @param r      The right boundary.
     * @param nums   The input of number array.
     * @param target The target value.
     * @return The location or the position of insertion in array.
     */
    private int binarySearch(int l, int r, int[] nums, int target) {

        // If right less than left.
        if (r < l) {
            return l;
        }

        // Find the middle index, left + middle of half total length.
        int mid = l + (r - l) / 2;
        if (target < nums[mid]) {
            return binarySearch(l, mid - 1, nums, target);
        } else if (target > nums[mid]) {
            return binarySearch(mid + 1, r, nums, target);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        E35_Search_Insert_Position e35 = new E35_Search_Insert_Position();

        int[] nums = new int[] {1,1,1,1,1,1,1,3,3,3,5,5,5,5,6,7,8,8,8,8,8};
        int target = 45;
        System.out.println(e35.searchInsert(nums, target));
        
    }
}