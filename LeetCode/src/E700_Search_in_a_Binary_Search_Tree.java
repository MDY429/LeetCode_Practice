/**
 * url: https://leetcode.com/problems/search-in-a-binary-search-tree/
 * 
 * Given the root node of a binary search tree (BST) and a value. You need to
 * find the node in the BST that the node's value equals the given value. Return
 * the subtree rooted with that node. If such node doesn't exist, you should
 * return NULL
 */
public class E700_Search_in_a_Binary_Search_Tree {

    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null) {
            return root;
        }
        else if(root.val == val) {
            return root;
        }
        else if(val < root.val) {
            return searchBST(root.left, val);
        }
        else {
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        E700_Search_in_a_Binary_Search_Tree e700 = new E700_Search_in_a_Binary_Search_Tree();

        Integer[] arr = new Integer[] {4,2,7,1,3,6,9};
        TreeNode root = TreeNode.build(arr);

        Integer[] arr2 = new Integer[] {2,1,3};
        TreeNode ans = TreeNode.build(arr2);

        System.out.println(e700.searchBST(root, 2).equals(ans));
    }
}