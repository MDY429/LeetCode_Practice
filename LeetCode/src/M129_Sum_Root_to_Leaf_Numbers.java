/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 * Output: 25
 * Explanation:
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Therefore, sum = 12 + 13 = 25.
 * Example 2:
 * 
 * Input: [4,9,0,5,1]
 *     4
 *    / \
 *   9   0
 *  / \
 * 5   1
 * Output: 1026
 * Explanation:
 * The root-to-leaf path 4->9->5 represents the number 495.
 * The root-to-leaf path 4->9->1 represents the number 491.
 * The root-to-leaf path 4->0 represents the number 40.
 * Therefore, sum = 495 + 491 + 40 = 1026.
 */

public class M129_Sum_Root_to_Leaf_Numbers {
    
    /**
     * Using recursion to find out the sum.
     * 
     * @param root The input of the Binary Tree.
     * @return The sum.
     */
    public int sumNumbers(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return helper(root, 0);
    }

    /**
     * Using recursion to pass the sum to next level. If the node does not contain
     * the child, then return the sum. The total is the sum of left and right tree.
     * 
     * @param root The Binary Tree.
     * @param s    The sum from this level.
     * @return The sum.
     */
    public int helper(TreeNode root, int s) {

        if (root == null) {
            return 0;
        }

        int left = helper(root.left, s * 10 + root.val);
        int right = helper(root.right, s * 10 + root.val);

        if (root.left == null && root.right == null) {
            return s * 10 + root.val;
        }

        return left + right;
    }

    public static void main(String[] args) {
        M129_Sum_Root_to_Leaf_Numbers m129 = new M129_Sum_Root_to_Leaf_Numbers();

        // Integer[] arr = new Integer[] { 1, 2, 3 };
        Integer[] arr = new Integer[] { 4, 9, 0, 5, 1 };

        TreeNode root = TreeNode.build(arr);
        System.out.println(m129.sumNumbers(root));
    }
}
