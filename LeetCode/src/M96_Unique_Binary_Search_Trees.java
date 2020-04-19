/**
 * url: https://leetcode.com/problems/unique-binary-search-trees/
 * 
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 * 
 * Example:
 * 
 * Input: 3
 * Output: 5
 * Explanation:
 * Given n = 3, there are a total of 5 unique BST's:
 * 
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *   2     1         2                 3
 */
public class M96_Unique_Binary_Search_Trees {
    
    /**
     * Find the relation for the combination. For example: If n = 2, [2] = [1][0] +
     * [0][1]. If n = 3, [3] = [0][2] + [1][1] + [2][0]
     * 
     * @param n The input of number.
     * @return The total unique combinations.
     */
    public int numTrees(int n) {

        if(n < 2) {
            return 1;
        }

        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0, k = i - 1; j < i / 2; j++, k--) {
                arr[i] += arr[k] * arr[j] * 2;
            }
            if (i % 2 == 1) {
                arr[i] += arr[i / 2] * arr[i / 2];
            }
        }

        return arr[n];
    }

    public static void main(String[] args) {
        M96_Unique_Binary_Search_Trees m96 = new M96_Unique_Binary_Search_Trees();
        int n = 7;

        System.out.println(m96.numTrees(n));
    }
}