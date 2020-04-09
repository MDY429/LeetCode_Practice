import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * url: https://leetcode.com/problems/binary-tree-inorder-traversal/
 * 
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * Example:
 * Input: [1,null,2,3]
 *  1
 *   \
 *    2
 *   /
 *  3
 * Output: [1,3,2] 
 * 
 * Follow up: Recursive solution is trivial, could you do it
 * iteratively?
 */
public class M94_Binary_Tree_Inorder_Traversal {

    /**
     * Use iteration way to implement traversal.
     * 
     * @param root The input of tree.
     * @return Traversed value List.
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inOrderList = new ArrayList<>();

        if (root == null) {
            return inOrderList;
        }

        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            inOrderList.add(root.val);
            root = root.right;
        }

        return inOrderList;
    }

    /**
     * Use recursion way to implement traversal.
     * 
     * @param root The input of tree.
     * @return Traversed value List.
     */
    public List<Integer> inorderTraversal_recursion(TreeNode root) {

        List<Integer> inorder = new ArrayList<>();

        printInOrder(inorder, root);

        return inorder;
    }

    /**
     * The help method to store the value to list.
     * 
     * @param list The store list.
     * @param root The input of Tree.
     */
    private void printInOrder(List<Integer> list, TreeNode root) {

        if (root == null) {
            return;
        }

        printInOrder(list, root.left);
        list.add(root.val);
        printInOrder(list, root.right);
    }

    public static void main(String[] args) {

        M94_Binary_Tree_Inorder_Traversal m94 = new M94_Binary_Tree_Inorder_Traversal();

        Integer[] arr = new Integer[] {1,null,2,null,null,3};
        TreeNode root = TreeNode.build(arr);

        System.out.println(m94.inorderTraversal(root).toString());
        System.out.println(m94.inorderTraversal_recursion(root).toString());
    }

}