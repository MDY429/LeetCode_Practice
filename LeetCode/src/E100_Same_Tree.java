/**
 * url: https://leetcode.com/problems/same-tree/
 * 
 * Given two binary trees, write a function to check if they are the same or
 * not.
 * 
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 */
public class E100_Same_Tree {

    /**
     * Use recursion to check whether the input tree are same.
     * 
     * @param p The first input Tree Node.
     * @param q The second input Tree Node.
     * @return Boolean
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both Tree are at the end.
        if (p == null && q == null) {
            return true;
        }

        // One of Tree is empty but another.
        if (p == null || q == null) {
            return false;
        }

        // The node value is different.
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        E100_Same_Tree e100 = new E100_Same_Tree();

        Integer[] arr = new Integer[] { 1, null, 2, null, null, 2 };
        TreeNode p = TreeNode.build(arr);

        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(2);
        q.right.left = new TreeNode(2);

        System.out.println(e100.isSameTree(p, q));

    }
}