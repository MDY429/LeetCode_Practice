/**
 * url: https://leetcode.com/problems/longest-common-subsequence/
 * 
 * Given two strings text1 and text2, return the length of their longest common
 * subsequence.
 * 
 * A subsequence of a string is a new string generated from the original string
 * with some characters(can be none) deleted without changing the relative order
 * of the remaining characters. (eg, "ace" is a subsequence of "abcde" while
 * "aec" is not). A common subsequence of two strings is a subsequence that is
 * common to both strings.
 * 
 * If there is no common subsequence, return 0.
 * 
 * Example 1: Input: text1 = "abcde", text2 = "ace" Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * 
 * Example 2: Input: text1 = "abc", text2 = "abc" Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * 
 * Example 3: Input: text1 = "abc", text2 = "def" Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 * 
 * Constraints:
 * 1. 1 <= text1.length <= 1000
 * 2. 1 <= text2.length <= 1000
 * 3. The input strings consist of lowercase English characters only.
 */
public class M1143_Longest_Common_Subsequence {

    /**
     * Using dp to save the longest value of common subsequence.
     * @param text1 The input String1.
     * @param text2 The input String2.
     * @return The value of the common subsequence.
     */
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        M1143_Longest_Common_Subsequence m1143 = new M1143_Longest_Common_Subsequence();
        String text1 = "abcdefghijk";
        String text2 = "acdhm";
        System.out.println(m1143.longestCommonSubsequence(text1, text2));
    }
}