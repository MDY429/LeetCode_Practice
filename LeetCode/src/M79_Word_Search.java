/**
 * url: https://leetcode.com/problems/word-search/
 * 
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where
 * "adjacent" cells are those horizontally or vertically neighboring. The same
 * letter cell may not be used more than once.
 * 
 * Example:
 * 
 * board =
 * [    ['A','B','C','E'],
 *      ['S','F','C','S'],
 *      ['A','D','E','E'] 
 * ]
 * 
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 * 
 * 
 * Constraints:
 * 
 * board and word consists only of lowercase and uppercase English letters.
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 * 1 <= word.length <= 10^3
 */
public class M79_Word_Search {

    /**
     * To check the word whether exist in board.
     * 
     * @@param board The 2D character array
     * @param word The word string
     * @return Boolean
     */
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    int a = dfs(board, word, 0, i, j, new boolean[board.length][board[i].length]);
                    System.out.println(a);
                    if (a == word.length()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * Use recursion to check the word whether exist.
     * 
     * @param board The 2D character array
     * @param word  The word string
     * @param round The character in word
     * @param i     The board colum
     * @param j     The board row
     * @param route The recording array.
     * @return The total path length.
     */
    private int dfs(char[][] board, String word, int round, int i, int j, boolean[][] route) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(round) != board[i][j]
                || route[i][j] == true) {
            return 0;
        }

        if (round == word.length() - 1 && word.charAt(round) == board[i][j]) {
            return 1;
        }

        route[i][j] = true;

        int up = dfs(board, word, round + 1, i - 1, j, route);
        int down = dfs(board, word, round + 1, i + 1, j, route);
        int left = dfs(board, word, round + 1, i, j - 1, route);
        int right = dfs(board, word, round + 1, i, j + 1, route);

        if ((up + down + left + right) == 0) {
            route[i][j] = false;
            return 0;
        }

        return Math.max(Math.max(up, down), Math.max(left, right)) + 1;
    }

    public static void main(String[] args) {
        M79_Word_Search m79 = new M79_Word_Search();

        char[][] board = new char[][] { { 'A', 'B', 'C', 'E' },
                                        { 'S', 'F', 'E', 'S' },
                                        { 'A', 'D', 'E', 'E' } };
        String word = "SEE";

        System.out.println(m79.exist(board, word));
    }
}