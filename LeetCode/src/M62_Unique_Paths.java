/**
 * url: https://leetcode.com/problems/unique-paths/
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * Example 1:
 * Input: m = 3, n = 2 Output: 3
 * 
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach
 * the bottom-right corner:
 * 
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * 
 * Example 2:
 * Input: m = 7, n = 3 Output: 28
 */
public class M62_Unique_Paths {

    /**
     * Find the relation between m and n. If the matrix is m*1 or 1*n, the path is
     * only 1. If m and n are more than 2, the specific number is add by up and left
     * value . For Example: (1, 1) is the addition of (0, 1) and (1, 0).
     * 
     * @param m The input of edge.
     * @param n The input of edge.
     * @return The number of unique path.
     */
    public int uniquePaths(int m, int n) {

        if (m <= 0 || n <= 0) {
            return 0;
        }

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }

        return arr[m - 1][n - 1];
    }

    public static void main(String[] args) {
        M62_Unique_Paths m62 = new M62_Unique_Paths();
        int m = 5;
        int n = 4;

        System.out.println(m62.uniquePaths(m, n));
    }
}