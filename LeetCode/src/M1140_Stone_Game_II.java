/**
 * url: https://leetcode.com/problems/stone-game-ii/
 * 
 * Alex and Lee continue their games with piles of stones. There are a number of
 * piles arranged in a row, and each pile has a positive integer number of
 * stones piles[i]. The objective of the game is to end with the most stones.
 * 
 * Alex and Lee take turns, with Alex starting first. Initially, M = 1.
 * 
 * On each player's turn, that player can take all the stones in the first X
 * remaining piles, where 1 <= X <= 2M. Then, we set M = max(M, X).
 * 
 * The game continues until all the stones have been taken.
 * 
 * Assuming Alex and Lee play optimally, return the maximum number of stones
 * Alex can get.
 * 
 * Example 1:
 * 
 * Input: piles = [2,7,9,4,4] Output: 10 Explanation: If Alex takes one pile at
 * the beginning, Lee takes two piles, then Alex takes 2 piles again. Alex can
 * get 2 + 4 + 4 = 10 piles in total. If Alex takes two piles at the beginning,
 * then Lee can take all three piles left. In this case, Alex get 2 + 7 = 9
 * piles in total. So we return 10 since it's larger.
 * 
 * 
 * Constraints:
 * 1 <= piles.length <= 100
 * 1 <= piles[i] <= 10 ^ 4
 * 
 * Reference:
 * https://medium.com/@desolution/%E5%BE%9Eleetcode%E5%AD%B8%E6%BC%94%E7%AE%97%E6%B3%95-61-dynamic-programming-9-784b21b36c47
 */
public class M1140_Stone_Game_II {

    /**
     * An algorithm to find the best solution for first person.
     * 
     * @param piles The input of piles.
     * @return The best number for first person.
     */
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        // Accumulate stones from the back. Let piles be the total of rest of stones at
        // i rounds.
        for (int i = n - 2; i >= 0; i--) {
            piles[i] += piles[i + 1];
        }

        // If less or equal than two piles, first person can take all.
        if (n <= 2) {
            return piles[0];
        }

        // 2D array to store the best result. size is the piles length and maximum M.
        int[][] dp = new int[n][(n + 1) / 2 + 1];

        return helper(dp, piles, 0, 1);
    }

    /**
     * A helper method to find out the best result.
     * 
     * @param dp    The best result.
     * @param piles The input piles.
     * @param i     The i th of piles.
     * @param M     The base.
     * @return The highest piles you take.
     */
    private int helper(int[][] dp, int[] piles, int i, int M) {

        if (i > piles.length) {
            return 0;
        }

        // Player could take rest of all piles.
        if ((i + 2 * M) >= piles.length) {
            return piles[i];
        }

        // If already get the result.
        if (dp[i][M] != 0) {
            return dp[i][M];
        }

        int min = Integer.MAX_VALUE;

        for (int x = 1; x <= 2 * M; x++) {

            // The game rule, find the new M for next player.
            int newM = Math.max(x, M);

            // In order to let fist player get best result, so we need to minimize the
            // second player's result.
            min = Math.min(min, helper(dp, piles, i + x, newM));
        }

        // Fist player get the highest stones.
        dp[i][M] = piles[i] - min;

        return dp[i][M];
    }

    public static void main(String[] args) {
        M1140_Stone_Game_II m1140 = new M1140_Stone_Game_II();
        int[] piles = new int[] { 2, 7, 9, 4, 4, 4 };

        System.out.println(m1140.stoneGameII(piles));
    }
}