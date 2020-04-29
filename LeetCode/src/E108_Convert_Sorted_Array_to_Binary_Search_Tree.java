/**
 * url:
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 * 
 * Example:
 * 
 * Given the sorted array: [-10,-3,0,5,9],
 * 
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following
 * height balanced BST:
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 * 
 */
public class E108_Convert_Sorted_Array_to_Binary_Search_Tree {

    /**
     * Use recursion to put the array element to TreeNode.
     * 
     * @param nums The input of sorted array.
     * @return The AVL tree.
     */
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length < 1) {
            return null;
        }

        TreeNode ans = sortedArrayToBST(nums, 0, nums.length - 1);
        return ans;
    }

    /**
     * The help method, use recursion to put the sub array to TreeNode.
     * 
     * @param nums  The input of sorted array.
     * @param left  The left of sub array.
     * @param right The right of sub array.
     * @return The Tree Node.
     */
    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {

        TreeNode ans = new TreeNode();
        int mid = (right + left) / 2;
        ans.val = nums[mid];

        ans.left = (mid > left) ? sortedArrayToBST(nums, left, mid - 1) : null;
        ans.right = (mid < right) ? sortedArrayToBST(nums, mid + 1, right) : null;

        return ans;
    }

    public static void main(String[] args) {
        E108_Convert_Sorted_Array_to_Binary_Search_Tree e108 = new E108_Convert_Sorted_Array_to_Binary_Search_Tree();
        int[] nums = new int[] { -10, -3, 0, 5, 9 };
        TreeNode ans = e108.sortedArrayToBST(nums);

        Integer[] arr = new Integer[] { 0, -10, 5, null, -3, null, 9 };
        TreeNode test = TreeNode.build(arr);

        System.out.println(test.equals(ans));
    }
}