/**
 * url: https://leetcode.com/problems/unique-paths-ii/
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * Now consider if some obstacles are added to the grids. How many unique paths
 * would there be?
 * 
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * Note: m and n will be at most 100.
 * 
 * Example 1: Input: [ [0,0,0], [0,1,0], [0,0,0] ] Output: 2
 */
public class M63_Unique_Paths_II {

    /**
     * Check obstacle on every arr[m][0] and arr[0][n] and set them to 0. Add upper
     * and left item to find the total path.
     * 
     * @param obstacleGrid The input of array.
     * @return The number of paths.
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                arr[i][0] = 0;
                while (i < m) {
                    arr[i][0] = 0;
                    i++;
                }
            } else {
                arr[i][0] = 1;
            }
        }
        
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                arr[0][j] = 0;
                while (j < n) {
                    arr[0][j] = 0;
                    j++;
                }
            } else {
                arr[0][j] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }

        return arr[m-1][n-1];
    }

    public static void main(String[] args) {
        M63_Unique_Paths_II m63 = new M63_Unique_Paths_II();
        int[][] obstacleGrid = new int[][] {    { 0, 0, 1, 0 },
                                                { 0, 0, 0, 0 }, 
                                                { 1, 0, 0, 0 } }; // [3 x 4]
        // int[][] obstacleGrid = new int[][]{{0,0,0}}; // [1 x 3]

        System.out.println(m63.uniquePathsWithObstacles(obstacleGrid));
    }
}