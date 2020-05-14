/**
 * url: https://leetcode.com/problems/invert-binary-tree/
 * 
 * Invert a binary tree.
 * 
 * Example:
 * 
 * Input:
 * 
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 
 * Output:
 * 
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 
 */
public class E226_Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {

        invert(root);

        return root;
    }

    public void invert(TreeNode root) {

        if (root == null) {
            return;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invert(root.left);
        invert(root.right);
    }

    public static void main(String[] args) {
        E226_Invert_Binary_Tree e226 = new E226_Invert_Binary_Tree();
        Integer[] arr = new Integer[] { 4, 2, 7, 1, 3, 6, 9 };
        TreeNode root = TreeNode.build(arr);

        Integer[] arr2 = new Integer[] { 4, 7, 2, 9, 6, 3, 1 };
        TreeNode invert = TreeNode.build(arr2);

        System.out.println(e226.invertTree(root).equals(invert));

    }
}