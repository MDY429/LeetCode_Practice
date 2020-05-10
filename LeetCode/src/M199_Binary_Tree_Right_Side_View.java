import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url: https://leetcode.com/problems/binary-tree-right-side-view/
 * 
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * 
 * Example:
 * 
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 * 
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 * 
 */
public class M199_Binary_Tree_Right_Side_View {

    /**
     * Use BFS and Queue to find the rightmost element.
     * 
     * @param root The input of the Tree.
     * @return The List of rightmost elements of the Tree.
     */
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        ans.add(root.val);
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            boolean isRecord = false;

            for (int i = 0; i < size; i++) {
                TreeNode dq = queue.poll();
                if (dq.right != null) {
                    queue.offer(dq.right);
                    if (!isRecord) {
                        ans.add(dq.right.val);
                        isRecord = true;
                    }
                }
                if (dq.left != null) {
                    queue.offer(dq.left);
                    if (!isRecord) {
                        ans.add(dq.left.val);
                        isRecord = true;
                    }
                }
            }
        }

        return ans;
    }

    /**
     * Use DFS and recursion to find the rightmost element.
     * 
     * @param root The input of the Tree.
     * @return The List of rightmost elements of the Tree.
     */
    public List<Integer> rightSideView_DFS(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans, 0);
        return ans;
    }

    /**
     * Use recursion to find out the rightmost element. List size would same as
     * height of Tree.
     * 
     * @param root  The input of the Tree.
     * @param list  The List of rightmost elements of the Tree.
     * @param level The Tree node level
     */
    public void dfs(TreeNode root, List<Integer> list, int level) {
        if (root == null) {
            return;
        } else if (level == list.size()) {
            // Use height of node and list size relation.
            list.add(root.val);
        }
        dfs(root.right, list, level + 1);
        dfs(root.left, list, level + 1);
    }

    public static void main(String[] args) {
        M199_Binary_Tree_Right_Side_View m199 = new M199_Binary_Tree_Right_Side_View();
        Integer[] arr = new Integer[] { 1, 2, 3, null, 5, null, 4 };
        TreeNode root = TreeNode.build(arr);

        System.out.println(m199.rightSideView(root).toString());
        System.out.println(m199.rightSideView_DFS(root).toString());
    }
}