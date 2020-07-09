/**
 * url: https://leetcode.com/problems/longest-univalue-path/
 * 
 * Given a binary tree, find the length of the longest path where each node in
 * the path has the same value. This path may or may not pass through the root.
 * 
 * The length of path between two nodes is represented by the number of edges
 * between them.
 * 
 * Example 1:
 * 
 * Input:
 * 
 *          5
 *         / \
 *        4   5
 *       / \   \
 *      1   1   5
 * Output: 2
 * 
 * Example 2:
 * 
 * Input:
 * 
 *       1
 *      / \
 *     4   5
 *    / \   \
 *   4   4   5
 * Output: 2
 * 
 * 
 * Note: The given binary tree has not more than 10000 nodes. The height of the
 * tree is not more than 1000.
 */
public class E687_Longest_Univalue_Path {

    /**
     * Find the longest path.
     * 
     * @param root The input of tree node.
     * @return The longest path number.
     */
    public int longestUnivaluePath(TreeNode root) {

        int[] a = new int[1];
        helper(root, a);

        return a[0];
    }

    /**
     * Use recursion to find the longest path.
     * 
     * @param root The input of tree node.
     * @param a    The answer array.
     * @return The longest path.
     */
    private int helper(TreeNode root, int[] a) {
        if (root == null) {
            return 0;
        }

        int l = helper(root.left, a);
        int r = helper(root.right, a);

        int ll = 0;
        int rr = 0;

        if (root.left != null && root.left.val == root.val) {
            ll += l + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            rr += r + 1;
        }

        // Record the max value.
        a[0] = Math.max(a[0], ll + rr);

        // Return the max side.
        return Math.max(ll, rr);
    }

    public static void main(String[] args) {
        E687_Longest_Univalue_Path e687 = new E687_Longest_Univalue_Path();
        Integer[] arr = new Integer[] { 5, 4, 5, 1, 1, 5, null, null, null, null, null, 5 };
        TreeNode root = TreeNode.build(arr);
        System.out.println(e687.longestUnivaluePath(root));
    }
}