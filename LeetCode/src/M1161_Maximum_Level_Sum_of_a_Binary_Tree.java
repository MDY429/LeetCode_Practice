import java.util.LinkedList;
import java.util.Queue;

/**
 * url: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
 * 
 * Given the root of a binary tree, the level of its root is 1, the level of its
 * children is 2, and so on.
 * 
 * Return the smallest level X such that the sum of all the values of nodes at
 * level X is maximal.
 * 
 * Input: [1,7,0,7,-8,null,null] Output: 2
 * Explanation: Level 1 sum = 1. Level 2 sum = 7 + 0 = 7. Level 3 sum = 7 + -8 = -1.
 * So we return the level with the maximum sum which is level 2.
 * 
 * Note:
 * 1. The number of nodes in the given tree is between 1 and 10^4.
 * 2. -10^5 <= node.val <= 10^5
 */
public class M1161_Maximum_Level_Sum_of_a_Binary_Tree {

    /**
     * Use BFS to add corresponding level value.
     * 
     * @param root The input of TreeNode.
     * @return The maximum sum level.
     */
    public int maxLevelSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int h = getHeight(root);
        int[] levelValues = new int[h];

        for (int i = 0; i < h; i++) {
            bfs(root, levelValues, i, i);
        }

        int maxLevel = 0;
        for (int i = 1; i < h; i++) {
            if (levelValues[maxLevel] < levelValues[i]) {
                maxLevel = i;
            }
        }

        return maxLevel + 1;
    }

    /**
     * Get Tree's height.
     * 
     * @param root The input of TreeNode.
     * @return The Tree's height.
     */
    private int getHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int l = getHeight(root.left);
        int r = getHeight(root.right);

        return Math.max(l, r) + 1;
    }

    /**
     * Use BFS to add the each level's sum.
     * 
     * @param root        The input of TreeNode.
     * @param levelValues The sum of corresponding level array.
     * @param level       The Tree's level.
     * @param n           The Tree's level.
     */
    private void bfs(TreeNode root, int[] levelValues, int level, int n) {

        if (root == null) {
            return;
        }
        if (n == 0) {
            levelValues[level] += root.val;
        } else if (n > 0) {
            bfs(root.left, levelValues, level, n - 1);
            bfs(root.right, levelValues, level, n - 1);
        }

    }

    /**
     * Use DFS to add corresponding level value.
     * 
     * @param root The input of TreeNode.
     * @return The maximum sum level.
     */
    public int maxLevelSum_DFS(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int h = getHeight(root);
        int[] levelValues = new int[h];
        dfs(root, levelValues, 0);

        int maxLevel = 0;
        for (int i = 1; i < h; i++) {
            if (levelValues[maxLevel] < levelValues[i]) {
                maxLevel = i;
            }
        }

        return maxLevel + 1;
    }

    /**
     * Use DFS to add the each level's sum.
     * 
     * @param root        The input of TreeNode.
     * @param levelValues The sum of corresponding level array.
     * @param level       The Tree's level.
     */
    private void dfs(TreeNode root, int[] levelValues, int level) {
        if (root == null) {
            return;
        }
        levelValues[level] += root.val;
        dfs(root.left, levelValues, level + 1);
        dfs(root.right, levelValues, level + 1);
    }

    /**
     * Use BFS and Iterator to add corresponding level value.
     * 
     * @param root The input of TreeNode.
     * @return The maximum sum level.
     */
    public int maxLevelSum_BFS_Iterator(TreeNode root) {
        
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        int levelCounter = 1;
        int maxLevelSum = root.val;
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int levelSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode dq = queue.poll();
                levelSum += dq.val;
                if (dq.left != null) {
                    queue.add(dq.left);
                }
                if (dq.right != null) {
                    queue.add(dq.right);
                }
            }

            if (levelSum > maxLevelSum) {
                maxLevelSum = levelSum;
                level = levelCounter;
            }
            levelCounter++;
        }
        return level;
    }

    public static void main(String[] args) {
        M1161_Maximum_Level_Sum_of_a_Binary_Tree m1161 = new M1161_Maximum_Level_Sum_of_a_Binary_Tree();
        Integer[] arr = new Integer[] { 1, 7, 0, 7, -8 };
        TreeNode root = TreeNode.build(arr);
        System.out.println(m1161.maxLevelSum(root));
        System.out.println(m1161.maxLevelSum_DFS(root));
        System.out.println(m1161.maxLevelSum_BFS_Iterator(root));
    }
}