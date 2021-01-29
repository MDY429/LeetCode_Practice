/**
 * Return the root node of a binary search tree that matches the given preorder
 * traversal.
 * 
 * (Recall that a binary search tree is a binary tree where for every node, any
 * descendant of node.left has a value < node.val, and any descendant of
 * node.right has a value > node.val. Also recall that a preorder traversal
 * displays the value of the node first, then traverses node.left, then
 * traverses node.right.)
 * 
 * It's guaranteed that for the given test cases there is always possible to
 * find a binary search tree with the given requirements.
 * 
 * Example 1:
 * 
 * Input: [8,5,1,7,10,12] Output: [8,5,10,1,7,null,12]
 */

public class M1008_Construct_Binary_Search_Tree_from_Preorder_Traversal {

    /**
     * Using loop and recursion to create node and build BST.
     * 
     * @param preorder Preorder elements
     * @return Binary Search Tree
     */
    public TreeNode bstFromPreorder(int[] preorder) {

        return buildTree(preorder, 0, preorder.length - 1);
    }

    /**
     * Using loop to find the left and right tree, then using recursion to build the
     * sub tree.
     * 
     * @param preorder Preorder elements
     * @param start    The start value.
     * @param end      The end value.
     * @return The BST.
     */
    public TreeNode buildTree(int[] preorder, int start, int end) {

        if (start > end) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[start]);

        // Coz of preOrder traversal, use loop to record left side.
        int i = start;
        while (i <= end) {
            if (node.val < preorder[i]) {
                break;
            }
            i++;
        }

        node.left = buildTree(preorder, start + 1, i - 1);
        node.right = buildTree(preorder, i, end);

        return node;
    }

    /**
     * Using iterator to find the correct node and insert new node.
     * 
     * @param preorder Preorder elements
     * @return Binary Search Tree
     */
    public TreeNode bstFromPreorder_loop(int[] preorder) {

        if (preorder.length < 1) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {
            helper_loop(root, preorder[i]);
        }

        return root;
    }

    /**
     * Using iterator to find the correct node and insert new node.
     * 
     * @param root The input of Tree.
     * @param val  The node value.
     */
    public void helper_loop(TreeNode root, int val) {

        while (root != null) {
            if (val < root.val) {
                if (root.left != null) {
                    root = root.left;
                } else {
                    root.left = new TreeNode(val);
                    return;
                }
            } else {
                if (root.right != null) {
                    root = root.right;
                } else {
                    root.right = new TreeNode(val);
                    return;
                }
            }
        }
    }

    /**
     * Using recursion to find the correct node and insert new node.
     * 
     * @param preorder Preorder elements
     * @return Binary Search Tree
     */
    public TreeNode bstFromPreorder_recursion(int[] preorder) {

        if (preorder.length < 1) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {
            helper(root, preorder[i]);
        }

        return root;
    }

    /**
     * Using recursion to find the correct node and insert new node.
     * 
     * @param root The input of Tree.
     * @param val  The node value.
     */
    public void helper(TreeNode root, int val) {

        if (root == null) {
            return;
        }

        if (val < root.val) {
            if (root.left != null) {
                helper(root.left, val);
            } else {
                root.left = new TreeNode(val);
            }
        } else {
            if (root.right != null) {
                helper(root.right, val);
            } else {
                root.right = new TreeNode(val);
            }
        }
    }

    public static void main(String[] args) {

        int[] preorder = new int[] { 8, 5, 1, 7, 10, 12 };
        M1008_Construct_Binary_Search_Tree_from_Preorder_Traversal m1008 = new M1008_Construct_Binary_Search_Tree_from_Preorder_Traversal();

        TreeNode tree = m1008.bstFromPreorder(preorder);
        TreeNode ans = TreeNode.build(new Integer[] { 8, 5, 10, 1, 7, null, 12 });

        System.out.println(tree.equals(ans));
    }
}
