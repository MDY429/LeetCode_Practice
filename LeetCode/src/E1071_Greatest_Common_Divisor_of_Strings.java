/**
 * url: https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * 
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T (T
 * concatenated with itself 1 or more times)
 * 
 * Return the largest string X such that X divides str1 and X divides str2.
 * 
 * Example 1: Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC"
 * 
 * Example 2: Input: str1 = "ABABAB", str2 = "ABAB" Output: "AB"
 * 
 * Example 3: Input: str1 = "LEET", str2 = "CODE" Output: ""
 * 
 * 
 * Note:
 * 1. 1 <= str1.length <= 1000
 * 2. 1 <= str2.length <= 1000
 * 3. str1[i] and str2[i] are English uppercase letters.
 */
public class E1071_Greatest_Common_Divisor_of_Strings {

    /**
     * Find the gcd between these two str. Then check whether the sub string is
     * verified.
     * 
     * @param str1 The first string.
     * @param str2 The second string
     * @return Gcd of string.
     */
    public String gcdOfStrings(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        int gcd = gcd(len1, len2);

        String tmp = str2.substring(0, gcd);

        for (int i = 0; i < len1; i += gcd) {
            if (!str1.substring(i).startsWith(tmp)) {
                return "";
            }
        }

        return tmp;
    }

    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        E1071_Greatest_Common_Divisor_of_Strings e1071 = new E1071_Greatest_Common_Divisor_of_Strings();
        String str1 = "ABAB";
        String str2 = "ABAB";
        System.out.println(e1071.gcdOfStrings(str1, str2));
    }
}