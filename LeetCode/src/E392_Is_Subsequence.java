/**
 * url: https://leetcode.com/problems/is-subsequence/
 * 
 * Given a string s and a string t, check if s is subsequence of t.
 * 
 * A subsequence of a string is a new string which is formed from the original
 * string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (ie, "ace" is a
 * subsequence of "abcde" while "aec" is not).
 * 
 * Follow up: If there are lots of incoming S, say S1, S2, ... , Sk where k >=
 * 1B, and you want to check one by one to see if T has its subsequence. In this
 * scenario, how would you change your code?
 * 
 * Example 1: Input: s = "abc", t = "ahbgdc" Output: true
 * 
 * Example 2: Input: s = "axc", t = "ahbgdc" Output: false
 * 
 * Constraints:
 * 1. 0 <= s.length <= 100
 * 2. 0 <= t.length <= 10^4
 * 3. Both strings consists only of lowercase characters.
 */
public class E392_Is_Subsequence {

    /**
     * Compare two string and check whether s is subsequence of t.
     * 
     * @param s The subsequence string.
     * @param t The input of string.
     * @return Boolean
     */
    public boolean isSubsequence(String s, String t) {

        int len_s = s.length();
        int len_t = t.length();

        if (len_s == 0) {
            return true;
        }

        int count = 0;
        for (int i = 0; i < len_t; i++) {
            if (s.charAt(count) == t.charAt(i)) {
                count++;
                if (count == len_s) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        E392_Is_Subsequence e392 = new E392_Is_Subsequence();
        String s = "AQYK";
        String t = "ASFDQWERTYIUGHK";
        System.out.println(e392.isSubsequence(s, t));
    }
}