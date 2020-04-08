/**
 * url: https://leetcode.com/problems/validate-binary-search-tree/
 * 
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows:  
 * 1. The left subtree of a node contains only nodes with keys less than the
 * node's key.  
 * 2. The right subtree of a node contains only nodes with keys greater than the
 * node's key.  
 * 3. Both the left and right subtrees must also be binary search trees.
 */
public class M98_Validate_Binary_Search_Tree {

    /**
     * Use recursion to check whether is BST.
     * 
     * @param root The input of binary tree.
     * @return Boolean
     */
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

    /**
     * Use recursion to find the maximum and minium in binary tree and check whether
     * is BST.
     * 
     * @param root The input of binary tree.
     * @param max  The maximum in binary tree.
     * @param min  The minium in binary tree.
     * @return Boolean
     */
    public boolean isBST(TreeNode root, Integer max, Integer min) {

        if (root == null) {
            return true;
        }

        if (min != null && root.val <= min) {
            return false;
        } else if (max != null && root.val >= max) {
            return false;
        } else {
            return isBST(root.left, root.val, min) && isBST(root.right, max, root.val);
        }
    }

    public static void main(String[] args) {
        M98_Validate_Binary_Search_Tree m98 = new M98_Validate_Binary_Search_Tree();
        Integer[] arr = new Integer[] { 50, 25, 75, 5, 60 };
        TreeNode root = TreeNode.build(arr);
        System.out.println(m98.isValidBST(root));
    }
}
