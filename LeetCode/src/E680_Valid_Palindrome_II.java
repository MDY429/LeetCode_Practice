/**
 * url: https://leetcode.com/problems/valid-palindrome-ii/
 * 
 * Given a non-empty string s, you may delete at most one character. Judge
 * whether you can make it a palindrome.
 * 
 * Example 1: Input: "aba" Output: True
 * 
 * Example 2: Input: "abca" Output: True Explanation: You could delete the
 * character 'c'.
 * 
 * Note: The string will only contain lowercase characters a-z. The maximum
 * length of the string is 50000.
 */
public class E680_Valid_Palindrome_II {

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return checkPalindrome(l + 1, r, s) || checkPalindrome(l, r - 1, s);
            }
            l++;
            r--;
        }

        return true;
    }

    private boolean checkPalindrome(int l, int r, String s) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        E680_Valid_Palindrome_II e680 = new E680_Valid_Palindrome_II();
        String s = "aa";

        System.out.println(e680.validPalindrome(s));
    }
}