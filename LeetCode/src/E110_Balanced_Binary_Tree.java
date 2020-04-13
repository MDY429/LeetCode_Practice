/**
 * url: https://leetcode.com/problems/balanced-binary-tree/
 * 
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as:
 * 
 * a binary tree in which the left and right subtrees of every node differ in
 * height by no more than 1.
 */
public class E110_Balanced_Binary_Tree {

    /**
     * Check each node's height whether is balanced.
     * 
     * @param root The input of Tree.
     * @return Boolean
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int balanceFactor = getHeight(root.left) - getHeight(root.right);

        if (Math.abs(balanceFactor) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    /**
     * The help method to get each node height.
     * 
     * @param node The input of tree node.
     * @return The value of height.
     */
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    public static void main(String[] args) {
        E110_Balanced_Binary_Tree e110 = new E110_Balanced_Binary_Tree();
        Integer[] arr = new Integer[] { 1, 2, 3, 4, null, null, 7, 8 };
        TreeNode root = TreeNode.build(arr);
        
        System.out.println(e110.isBalanced(root));
    }
}