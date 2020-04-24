import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * url: https://leetcode.com/problems/binary-tree-preorder-traversal/
 * 
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * Example:
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 
 * Output: [1,2,3]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class M144_Binary_Tree_Preorder_Traversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> preOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tree = root;

        while(tree!=null || !stack.isEmpty()) {
            while(tree != null) {
                preOrder.add(tree.val);
                stack.push(tree);
                tree = tree.left;
            }
            tree = stack.pop();
            tree = tree.right;

        }

        return preOrder;
    }

    public static void main(String[] args) {
        M144_Binary_Tree_Preorder_Traversal m144 = new M144_Binary_Tree_Preorder_Traversal();
            Integer[] arr = new Integer[] {1,null,2,null,null,3};
            TreeNode root = TreeNode.build(arr);
    
            System.out.println(m144.preorderTraversal(root).toString());
    }
}