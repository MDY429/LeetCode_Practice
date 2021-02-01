import java.util.HashMap;
import java.util.Map;

/**
 * Alice and Bob take turns playing a game, with Alice starting first.
 * 
 * Initially, there are n stones in a pile. On each player's turn, that player
 * makes a move consisting of removing any non-zero square number of stones in
 * the pile.
 * 
 * Also, if a player cannot make a move, he/she loses the game.
 * 
 * Given a positive integer n. Return True if and only if Alice wins the game
 * otherwise return False, assuming both players play optimally.
 * 
 * Example 1: Input: n = 1 Output: true Explanation: Alice can remove 1 stone
 * winning the game because Bob doesn't have any moves.
 * 
 * Example 2: Input: n = 2 Output: false Explanation: Alice can only remove 1
 * stone, after that Bob removes the last one winning the game (2 -> 1 -> 0).
 * 
 * Example 3: Input: n = 4 Output: true Explanation: n is already a perfect
 * square, Alice can win with one move, removing 4 stones (4 -> 0).
 * 
 * Example 4: Input: n = 7 Output: false Explanation: Alice can't win the game
 * if Bob plays optimally. If Alice starts removing 4 stones, Bob will remove 1
 * stone then Alice should remove only 1 stone and finally Bob removes the last
 * one (7 -> 3 -> 2 -> 1 -> 0). If Alice starts removing 1 stone, Bob will
 * remove 4 stones then Alice only can remove 1 stone and finally Bob removes
 * the last one (7 -> 6 -> 2 -> 1 -> 0).
 * 
 * Example 5: Input: n = 17 Output: false Explanation: Alice can't win the game
 * if Bob plays optimally.
 * 
 * 
 * Constraints: 1 <= n <= 10^5
 */

public class H1510_Stone_Game_IV {

    /**
     * Using DP to find out the result.
     * 
     * @param n The stone.
     * @return boolean.
     */
    public boolean winnerSquareGame(int n) {

        boolean[] dp = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                // If the previous round is false, this round, player can win the game(True).
                if (!dp[i - j * j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    /**
     * Using map and recursion to find out the result.
     * 
     * @param n The stone.
     * @return boolean.
     */
    public boolean winnerSquareGame_recursion(int n) {
        Map<Integer, Boolean> map = new HashMap<>();
        return dfs(map, n);
    }

    /**
     * Using recursion to get the previous result,
     * 
     * @param map   The Hash table for store the Integer and Boolean.
     * @param stone The number of the stone.
     * @return boolean
     */
    public Boolean dfs(Map<Integer, Boolean> map, int stone) {

        if (map.containsKey(stone)) {
            return map.get(stone);
        }

        for (int i = 1; i * i <= stone; i++) {
            int remove = i * i;
            // If previous state is False, then this round would be True.
            if (!dfs(map, stone - remove)) {
                map.put(stone, true);
                return true;
            }
        }

        map.put(stone, false);
        return false;
    }

    public static void main(String[] args) {
        H1510_Stone_Game_IV h1510 = new H1510_Stone_Game_IV();
        int n = 21;

        System.out.println(h1510.winnerSquareGame(n));
    }
}
