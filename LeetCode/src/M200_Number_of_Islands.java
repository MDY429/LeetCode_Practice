/**
 * url: https://leetcode.com/problems/number-of-islands/
 * 
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of
 * islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of
 * the grid are all surrounded by water.
 * 
 * Example 1:
 * Input: 
 * 11110
 * 11010
 * 11000
 * 00000
 * Output: 1 
 * 
 * Example 2:
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 * Output: 3
 */
public class M200_Number_of_Islands {

    public int numIslands(char[][] grid) {

        int totalIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // Start with any land.
                if (grid[i][j] == '1') {
                    totalIslands += dfs(grid, i, j);
                }
            }
        }

        return totalIslands;
    }

    private int dfs(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }

        // Set visited land to be '0'.
        grid[i][j] = '0';

        dfs(grid, i + 1, j);    // Check above
        dfs(grid, i - 1, j);    // Check below
        dfs(grid, i, j - 1);    // Check left
        dfs(grid, i, j + 1);    // Check right

        return 1;
    }

    public static void main(String[] args) {
        M200_Number_of_Islands m200 = new M200_Number_of_Islands();

        char[][]grid = new char[][] { { '1', '1', '0', '0', '0' },
                                      { '1', '1', '0', '0', '0' },
                                      { '0', '0', '1', '0', '0' },
                                      { '0', '0', '0', '1', '1' } };

        System.out.println(m200.numIslands(grid));
    }
}