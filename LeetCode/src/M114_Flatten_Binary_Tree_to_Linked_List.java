/**
 * url: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * 
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example, given the following tree:
 * 
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * The flattened tree should look like:
 * 
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 */
public class M114_Flatten_Binary_Tree_to_Linked_List {
    
    /**
     * Use recursion to move the left child be preOrdered tree, then point to right
     * child.
     * 
     * @param root The input of tree.
     */
    public void flatten(TreeNode root) {

        if (root == null) {
            return;
        }

        flatten(root.left);
        moveRight(root);
        flatten(root.right);
    }

    /**
     * Let left children be right children then connect the original right children.
     * 
     * @param rootThe input of tree.
     */
    public void moveRight(TreeNode root) {

        if (root == null) {
            return;
        }

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode a = root;

        while (a.right != null) {
            a = a.right;
        }
        a.right = tmp;
    }

    public static void main(String[] args) {
        M114_Flatten_Binary_Tree_to_Linked_List m114 = new M114_Flatten_Binary_Tree_to_Linked_List();
        Integer[] arr = new Integer[] { 1, 2, 5, 3, 4 };
        TreeNode root = TreeNode.build(arr);
        m114.flatten(root);

        Integer[] exp = new Integer[] { 1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5 };
        TreeNode expected = TreeNode.build(exp);

        System.out.println(root.equals(expected));

    }
}