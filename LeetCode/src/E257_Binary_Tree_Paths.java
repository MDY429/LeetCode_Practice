import java.util.ArrayList;
import java.util.List;

/**
 * url: https://leetcode.com/problems/binary-tree-paths/
 * 
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Input:
 * 
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *  
 * Output: ["1->2->5", "1->3"]
 * 
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class E257_Binary_Tree_Paths {
    
    /**
     * Use recursion to find routes.
     * 
     * @param root The input of TreeNode.
     * @return The all possible path.
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String path = "";
        helper(ans, root, path);

        return ans;
    }

    /**
     * A helper method to find the possible path by recursion.
     * 
     * @param ans  The List to store the possible path.
     * @param root The input of TreeNode.
     * @param path The path String.
     */
    private void helper(List<String> ans, TreeNode root, String path) {

        if (root == null) {
            return;
        }

        path += root.val;
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        helper(ans, root.left, path + "->");
        helper(ans, root.right, path + "->");
    }

    public static void main(String[] args) {
        E257_Binary_Tree_Paths e257 = new E257_Binary_Tree_Paths();
        Integer[] arr = new Integer[] { 1, 2, 3, null, 5, 6, 7, null, null, 8 };
        TreeNode root = TreeNode.build(arr);
        System.out.println(e257.binaryTreePaths(root).toString());
    }
}