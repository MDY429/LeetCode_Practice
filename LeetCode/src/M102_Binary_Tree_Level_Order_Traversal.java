import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url: 
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * 
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * 
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class M102_Binary_Tree_Level_Order_Traversal {
    
    /**
     * Use dfs recursion to find every level's value.
     * 
     * @param root The input of Tree Node.
     * @return Every level elements.
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, ans, 0);

        return ans;
    }

    /**
     * Use recursion and dfs to traverse every node and put value into corresponding
     * list.
     * 
     * @param root  The input of Tree Node.
     * @param ans   The answer list.
     * @param index The level.
     */
    private void dfs(TreeNode root, List<List<Integer>> ans, int index) {

        if (root == null) {
            return;
        }

        // If there is no this level's elements list.
        if (ans.size() < index + 1) {
            ans.add(new ArrayList<>());
        }

        ans.get(index).add(root.val);

        dfs(root.left, ans, index + 1);
        dfs(root.right, ans, index + 1);

    }

    /**
     * Use iterator and bfs to find the each level's elements.
     * 
     * @param root he input of Tree Node.
     * @return Every level elements.
     */
    public List<List<Integer>> levelOrder_bfs_iterator(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        q.add(root);
        q.add(null);    // Set a null break to know the level is end.
        List<Integer> tmp = new ArrayList<>();

        while (q.size() > 1) {

            TreeNode node = q.poll();

            if (node == null) {
                ans.add(tmp);
                tmp = new ArrayList<>();
                q.add(null);    // Set a null break to know the level is end.
            } else {
                tmp.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        ans.add(tmp);

        return ans;

    }

    public static void main(String[] args) {
        M102_Binary_Tree_Level_Order_Traversal m102 = new M102_Binary_Tree_Level_Order_Traversal();

        Integer[] arr = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = TreeNode.build(arr);

        System.out.println(m102.levelOrder(root));
    }
}