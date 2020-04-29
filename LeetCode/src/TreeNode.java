/**
 * Definition for a binary tree node.
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    // For LeetCode 108. >>
    TreeNode() {}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    // <<

    /**
     * Just for easy create new tree.
     * 
     * @param arr Use array to present a tree.
     * @return The Tree Node.
     */
    public static TreeNode build(Integer[] arr) {
        TreeNode root = null;
        return constructTree(root, arr, 0);
    }

    /**
     * Use recursion to build a tree. 
     * [1,2,3,4] 
     *      1
     *     / \
     *    2   3
     *   /
     *  4
     * 
     * @param root The root node.
     * @param arr  The tree array.
     * @param pos  The corresponding position in array and tree.
     * @return The TreeNode.
     */
    public static TreeNode constructTree(TreeNode root, Integer[] arr, int pos) {

        if (pos >= arr.length) {
            return root;
        }

        // If the array data is null.
        if (arr[pos] == (Integer) null) {
            return null;
        }

        root = new TreeNode(arr[pos]);

        root.left = constructTree(root.left, arr, pos * 2 + 1);

        root.right = constructTree(root.right, arr, pos * 2 + 2);

        return root;

    }

    /**
     * This is for JUnit to test assert equal.
     */
    @Override
    public boolean equals(Object o) {
        TreeNode t = (TreeNode) o;

        if(t == null || this == null) {
            return false;
        }
        else if(this.val != t.val){
            return false;
        }
        else if(this.left == null && this.right == null) {
            return true;
        }
        else if(this.left == null && this.right != null) {
            return this.right.equals(t.right);
        }
        else if(this.left != null && this.right == null) {
            return this.left.equals(t.left);
        }

        return this.left.equals(t.left) && this.right.equals(t.right);
    }
}