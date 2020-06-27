import java.util.LinkedList;
import java.util.Queue;

/**
 * url:
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 * 
 * You are given a perfect binary tree where all leaves are on the same level,
 * and every parent has two children. The binary tree has the following
 * definition:
 * 
 * struct Node { 
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 
 * Populate each next pointer to point to its next right node. If there is no
 * next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Follow up:
 * 
 * 1. You may only use constant extra space.
 * 2. Recursive approach is fine, you may assume implicit stack space does not count
 *      as extra space for this problem.
 */
public class M116_Populating_Next_Right_Pointers_in_Each_Node {

    /**
     * Use bfs and iterator to set next to corresponding state.
     * 
     * @param root The input of Tree.
     * @return The new tree.
     */
    public Node connect(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int len = q.size();
            Node previous = null;

            for (int i = 0; i < len; i++) {

                Node current = q.poll();

                if (current != null) {
                    current.next = previous;
                    q.offer(current.right);
                    q.offer(current.left);

                    previous = current;
                }
            }
        }

        return root;
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};