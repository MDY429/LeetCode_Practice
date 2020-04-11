/**
 * url: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * 
 * Given a non-empty binary tree, find the maximum path sum.
 * 
 * For this problem, a path is defined as any sequence of nodes from some
 * starting node to any node in the tree along the parent-child connections. The
 * path must contain at least one node and does not need to go through the root.
 */
public class H124_Binary_Tree_Maximum_Path_Sum {

    /**
     * Use DFS to go to the bottom node, and find the max possible sum.
     * 
     * @param root The input of Tree.
     * @return The max sum.
     */
    public int maxPathSum(TreeNode root) {
        int[] result = new int[] { Integer.MIN_VALUE };

        if (root != null) {
            DFS(root, result);
        }
        return result[0];
    }

    /**
     * Go through the bottom node, find the max possible sum. Is it the node value,
     * (left + mid), (right + mid), (left + mid + right)?
     * 
     * @param root The input of Tree.
     * @param res  The result array put the max value.
     * @return The max value of the child path.
     */
    private int DFS(TreeNode root, int[] res) {

        int leftMax = (root.left != null) ? DFS(root.left, res) : 0;
        int rightMax = (root.right != null) ? DFS(root.right, res) : 0;
        int midMax = root.val;

        // Find out max right, left path or node value.
        if (leftMax > rightMax) {
            midMax = Math.max(midMax, midMax + leftMax);
        } else {
            midMax = Math.max(midMax, midMax + rightMax);
        }

        // Find out max path.
        if (midMax > leftMax + root.val + rightMax) {
            res[0] = Math.max(res[0], midMax);
        } else {
            res[0] = Math.max(res[0], leftMax + root.val + rightMax);
        }

        // Return the max right, left path or node value.
        return midMax;
    }

    public static void main(String[] args) {
        H124_Binary_Tree_Maximum_Path_Sum h124 = new H124_Binary_Tree_Maximum_Path_Sum();
        // Integer[] arr = new Integer[] {-10,9,20,null,null,15,7};
        Integer[] arr = new Integer[] { 100, -10, -20, null, null, 35, 7 };
        // Integer[] arr = new Integer[] {-10,-6,-3,null,null,-1,-1};
        // Integer[] arr = new Integer[] {};
        TreeNode root = TreeNode.build(arr);

        System.out.println(h124.maxPathSum(root));
    }
}