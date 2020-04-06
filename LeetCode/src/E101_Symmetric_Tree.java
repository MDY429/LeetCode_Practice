import java.util.LinkedList;
import java.util.Queue;

/**
 * url: https://leetcode.com/problems/symmetric-tree/
 * 
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 
 * But the following [1,2,2,null,3,null,3] is not:
 *   1
 *  / \
 * 2   2
 *  \   \
 *  3    3
 * Note: Bonus points if you could solve it both recursively and iteratively.
 */
public class E101_Symmetric_Tree {

    /**
     * Use recursion to check whether is symmetric.
     * 
     * @param root The input of Tree.
     * @return Boolean
     */
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    /**
     * Use recursion to check whether these two sub tree are mirror.
     * 
     * @param p The first sub tree.
     * @param q The second sub tree.
     * @return Boolean
     */
    private boolean isMirror(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    /**
     * Use iterator to check whether is symmetric.
     * 
     * @param root The input of Tree.
     * @return Boolean
     */
    public boolean isSymmetric_loop(TreeNode root) {

        if (root == null)
            return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();

            if (p == null && q == null)
                return true;
            if (p == null || q == null)
                return false;
            if (p.val != q.val)
                return false;

            queue.offer(p.left);
            queue.offer(q.right);
            queue.offer(p.right);
            queue.offer(q.left);
        }

        return true;
    }

    public static void main(String[] args) {
        E101_Symmetric_Tree e101 = new E101_Symmetric_Tree();
        // Integer[] arr = new Integer[] { 1, 2, 2, 3, 4, 4, 3 };
        Integer[] arr = new Integer[] {1,2,2,null,3,null,3};
        TreeNode root = TreeNode.build(arr);

        System.out.println(e101.isSymmetric(root));
        System.out.println(e101.isSymmetric_loop(root));
    }
}