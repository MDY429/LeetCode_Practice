/**
 * url: https://leetcode.com/problems/game-of-life/
 * 
 * According to the Wikipedia's article: "The Game of Life, also known simply as
 * Life, is a cellular automaton devised by the British mathematician John
 * Horton Conway in 1970."
 * 
 * Given a board with m by n cells, each cell has an initial state live (1) or
 * dead (0). Each cell interacts with its eight neighbors (horizontal, vertical,
 * diagonal) using the following four rules (taken from the above Wikipedia
 * article):
 * 
 * 1. Any live cell with fewer than two live neighbors dies, as if caused by
 *      under-population.
 * 2. Any live cell with two or three live neighbors lives on to the next generation.
 * 3. Any live cell with more than three live neighbors dies, as if by over-population.
 * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Write a function to compute the next state (after one update) of the board
 * given its current state. The next state is created by applying the above
 * rules simultaneously to every cell in the current state, where births and
 * deaths occur simultaneously.
 * 
 * Example:
 * 
 * Input: [ [0,1,0], [0,0,1], [1,1,1], [0,0,0] ]
 * 
 * Output: [ [0,0,0], [1,0,1], [0,1,1], [0,1,0] ]
 * 
 * Reference: https://leetcode.com/problems/game-of-life/discuss/73223/Easiest-JAVA-solution-with-explanation
 */
public class M289_Game_of_Life {

    /**
     * Use two bits to represent current state and next state.
     * 00 - keep(0) <- dead(0)
     * 01 - dead(0) <- live(1)
     * 10 - live(1) <- dead(0)
     * 11 - keep(1) <- live(1)
     * 
     * @param board The input of beginning status.
     */
    public void gameOfLife(int[][] board) {

        if (board == null || board.length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int lives = countLives(board, m, n, i, j);

                if (board[i][j] == 1 && lives >= 2 && lives <= 3) {
                    board[i][j] = 3;
                }

                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Shift right to get the next state.
                board[i][j] >>= 1;
            }
        }

    }

    /**
     * Count the surround elements' live.
     * 
     * @param board The input of current status.
     * @param m     The row length.
     * @param n     The column length.
     * @param i     The i th.
     * @param j     The j th.
     * @return Total lives.
     */
    private int countLives(int[][] board, int m, int n, int i, int j) {

        int lives = 0;

        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                
                if (x == i && y == j) {
                    continue;
                }

                // Add the elements surround the i,j.
                lives += board[x][y] & 1;
            }
        }

        return lives;
    }

    public static void main(String[] args) {

        M289_Game_of_Life m289 = new M289_Game_of_Life();
        int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };

        System.out.println("Before");
        for (int[] i : board) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        m289.gameOfLife(board);

        System.out.println("After");
        for (int[] i : board) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}