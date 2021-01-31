import java.util.Stack;

/**
 * Find the sum of all left leaves in a given binary tree.
 * 
 * Example:
 * 
 *   3 
 *  / \ 
 * 9 20 
 *   / \ 
 *  15 7
 * 
 * There are two left leaves in the binary tree, with values 9 and 15
 * respectively. Return 24.
 */

public class E404_Sum_of_Left_Leaves {

    /**
     * Using recursion to find out the sum of left leaves.
     * 
     * @param root The input of the binary tree.
     * @return The sum of left leaves.
     */
    public int sumOfLeftLeaves(TreeNode root) {
        // side, left = 0, right = 1, root = 2
        return helper(root, 2);
    }

    /**
     * Using recursion to decide the left or right tree and get the sum of left
     * leaves.
     * 
     * @param root The input of the Binary Tree.
     * @param side Left : 0, Right : 1, Root : 2
     * @return The sum of the left leaves.
     */
    public int helper(TreeNode root, int side) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null && side == 0) {
            return root.val;
        }

        return helper(root.left, 0) + helper(root.right, 1);
    }

    /**
     * Using iterator to find out the sum of left leaves.
     * 
     * @param root The input of the binary tree.
     * @return The sum of left leaves.
     */
    public int sumOfLeftLeaves_iterator(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int ans = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()) {
            TreeNode node = stack.pop();
            
            if(node.left != null ) {
                // Only left end child can add into ans
                if(node.left.left == null && node.left.right == null) {
                    ans += node.left.val;
                } else {
                    stack.push(node.left);
                }
            }

            if(node.right != null) {
                if(node.right.left != null || node.right.right != null) {
                    stack.push(node.right);
                }
            }
        }

        return ans;
    }

    /**
     * Another recursion solution from LeetCode discussion:
     * https://leetcode.com/problems/sum-of-left-leaves/discuss/88950/Java-iterative-and-recursive-solutions
     */
    public int sumOfLeftLeaves_recursion(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int ans = 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                ans += root.left.val;
            } else {
                ans += sumOfLeftLeaves_recursion(root.left);
            }
        }

        ans += sumOfLeftLeaves_recursion(root.right);

        return ans;
    }

    public static void main(String[] args) {

        E404_Sum_of_Left_Leaves e404 = new E404_Sum_of_Left_Leaves();
        // Integer[] arr = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, null, null, 8 };
        // Integer[] arr = new Integer[] { 1,2,3,4,5 };
        TreeNode root = TreeNode.build(arr);
        System.out.println(e404.sumOfLeftLeaves(root));
    }
}
