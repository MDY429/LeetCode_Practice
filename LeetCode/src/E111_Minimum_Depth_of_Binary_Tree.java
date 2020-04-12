/**
 * url: https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * 
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 
 *    3
 *   / \ 
 *  9  20
 *    / \ 
 *   15  7
 * return its minimum depth = 2.
 */
public class E111_Minimum_Depth_of_Binary_Tree {

    /**
     * Use recursion to find the minimum depth. There are 4 conditions.
     * 
     * @param root The input of the tree.
     * @return The minimum depth.
     */
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left != null && root.right == null) {
            return 1 + minDepth(root.left);
        } else if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        } else if (root.left != null && root.right != null) {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        E111_Minimum_Depth_of_Binary_Tree e111 = new E111_Minimum_Depth_of_Binary_Tree();
        Integer[] arr = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        // Integer[] arr = new Integer[] { 1, 2, 3, 4, null, null, 7 };
        // Integer[] arr = new Integer[] { 3, 9, 20, 15, 7, null, null };
        // Integer[] arr = new Integer[] { 3, 5 };
        TreeNode root = TreeNode.build(arr);

        System.out.println(e111.minDepth(root));
    }
}