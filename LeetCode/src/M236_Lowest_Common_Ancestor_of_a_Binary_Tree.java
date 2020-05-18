import java.util.Stack;

/**
 * url: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * 
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes
 * in the tree.
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor
 * is defined between two nodes p and q as the lowest node in T that has both p
 * and q as descendants (where we allow a node to be a descendant of itself).”
 * 
 * Given the following binary tree: root = [3,5,1,6,2,0,8,null,null,7,4]
 * 
 * Example 1:
 * 
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 Output: 3
 * Explanation: The LCA of nodes 5 and 1 is 3.
 * 
 * Example 2:
 * 
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4 Output: 5
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant
 * of itself according to the LCA definition.
 * 
 * Note:
 * 
 * 1. All of the nodes' values will be unique.
 * 2. p and q are different and both values will exist in the binary tree.
 */
public class M236_Lowest_Common_Ancestor_of_a_Binary_Tree {

    /**
     * Use two stack to find its own path and find the common.
     * 
     * @param root The input of Binary Tree.
     * @param p The part of Binary Tree.
     * @param q The part of Binary Tree.
     * @return The common TreeNode.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        TreeNode tree = root;
        TreeNode pLastViewed = null;
        TreeNode qLastViewed = null;

        boolean pFound = false;
        boolean qFound = false;

        while (tree != null || !pStack.isEmpty() || !qStack.isEmpty()) {

            if (tree != null) {

                if (!pFound) {
                    pStack.push(tree);
                }

                if (!qFound) {
                    qStack.push(tree);
                }

                if (tree.val == p.val) {
                    pFound = true;
                }

                if (tree.val == q.val) {
                    qFound = true;
                }

                tree = tree.left;

            } else {
                TreeNode peekNode = (!pFound) ? pStack.peek() : qStack.peek();

                // If there has right children and not visited.
                if (peekNode.right != null && (pLastViewed != peekNode.right && qLastViewed != peekNode.right)) {
                    tree = peekNode.right;
                } else {

                    // Not what we want and already visited.
                    if (!pFound) {
                        pLastViewed = pStack.pop();
                    }
                    
                    if (!qFound) {
                        qLastViewed = qStack.pop();
                    }
                }
            }

            // Find both.
            if (pFound && qFound) {
                break;
            }
        }

        while (pStack.size() > qStack.size()) {
            pStack.pop();
        }

        while (pStack.size() < qStack.size()) {
            qStack.pop();
        }

        while (!pStack.isEmpty() && !qStack.isEmpty()) {
            if (pStack.peek().val == qStack.peek().val) {
                return pStack.pop();
            }
            pStack.pop();
            qStack.pop();
        }

        return null;
    }

    public static void main(String[] args) {
        M236_Lowest_Common_Ancestor_of_a_Binary_Tree m236 = new M236_Lowest_Common_Ancestor_of_a_Binary_Tree();
        Integer[] arr = new Integer[] { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        TreeNode root = TreeNode.build(arr);

        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);

        System.out.println(m236.lowestCommonAncestor(root, p, q).equals(root));

    }
}