/**
 * url: https://leetcode.com/problems/out-of-boundary-paths/
 * 
 * There is an m by n grid with a ball. Given the start coordinate (i,j) of the
 * ball, you can move the ball to adjacent cell or cross the grid boundary in
 * four directions (up, down, left, right). However, you can at most move N
 * times. Find out the number of paths to move the ball out of grid boundary.
 * The answer may be very large, return it after mod 109 + 7.
 * 
 * Example 1: Input: m = 2, n = 2, N = 2, i = 0, j = 0 Output: 6
 * 
 * Example 2: Input: m = 1, n = 3, N = 3, i = 0, j = 1 Output: 12
 * 
 * Note:
 * 1. Once you move the ball out of boundary, you cannot move it back.
 * 2. The length and height of the grid is in range [1,50].
 * 3. N is in range [0,50].
 * 
 * reference:
 * https://leetcode.com/problems/out-of-boundary-paths/discuss/102967/Java-Solution-DP-with-space-compression
 */
public class M576_Out_of_Boundary_Paths {

    /**
     * Use DP to find out the total steps.
     * 
     * @param m The row of grid.
     * @param n The column of grid.
     * @param N The maximum step
     * @param i The start x
     * @param j The start y
     * @return The total number.
     */
    public int findPaths(int m, int n, int N, int i, int j) {
        if (N <= 0)
            return 0;

        final int MOD = 1000000007;
        int[][] counter = new int[m][n];
        counter[i][j] = 1;
        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        int result = 0;

        for (int step = 0; step < N; step++) {
            int[][] temp = new int[m][n];

            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    for (int[] d : dirs) {
                        int dx = x + d[0];
                        int dy = y + d[1];
                        if (dx < 0 || dx >= m || dy < 0 || dy >= n) {
                            result = (result + counter[x][y]) % MOD;
                        } else {
                            temp[dx][dy] = (temp[dx][dy] + counter[x][y]) % MOD;
                        }
                    }
                }
            }
            counter = temp;
        }

        return result;
    }

    public static void main(String[] args) {

        M576_Out_of_Boundary_Paths m576 = new M576_Out_of_Boundary_Paths();

        System.out.println(m576.findPaths(1,3,2,0,1));
    }
}