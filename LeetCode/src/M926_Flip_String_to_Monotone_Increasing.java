/**
 * url: https://leetcode.com/problems/flip-string-to-monotone-increasing/
 * 
 * A string of '0's and '1's is monotone increasing if it consists of some
 * number of '0's (possibly 0), followed by some number of '1's (also possibly
 * 0.)
 * 
 * We are given a string S of '0's and '1's, and we may flip any '0' to a '1' or
 * a '1' to a '0'.
 * 
 * Return the minimum number of flips to make S monotone increasing.
 * 
 * Example 1:
 * Input: "00110" Output: 1 Explanation: We flip the last digit to get 00111.
 * 
 * Example 2:
 * Input: "010110" Output: 2 Explanation: We flip to get 011111, or
 * alternatively 000111.
 * 
 * Example 3:
 * Input: "00011000" Output: 2 Explanation: We flip to get 00000000.
 * 
 * 
 * Note:
 * 1. 1 <= S.length <= 20000
 * 2. S only consists of '0' and '1' characters.
 * 
 * Reference:
 * https://medium.com/@desolution/%E5%BE%9Eleetcode%E5%AD%B8%E6%BC%94%E7%AE%97%E6%B3%95-65-array-13-cf15503c77e2
 */
public class M926_Flip_String_to_Monotone_Increasing {

    /**
     * For i th of String is '0', if all of String is zero, it doesn't change. If
     * before i th is zero, or after is 1, i th should flip.
     * 
     * For i th of String is '1', if all of String is zero, it should flip. If
     * before i th is zero, or after is 1, the situation would be the same for i-1
     * th is if all of String is zero or If before i-1 th is zero, or after is 1.
     * 
     * @param S The input of string.
     * @return How many digits should flip.
     */
    public int minFlipsMonoIncr(String S) {
        
        int f0 = 0;
        int f1 = 0;

        for(char c : S.toCharArray()) {
            if(c == '0') {
                f1++;
            }
            else {
                f1 = Math.min(f0, f1);
                f0++;
            }
        }

        return Math.min(f0, f1);
    }

    public static void main(String[] args) {
        
        M926_Flip_String_to_Monotone_Increasing m926 = new M926_Flip_String_to_Monotone_Increasing();
        String S = "110";
        System.out.println(m926.minFlipsMonoIncr(S));
    }
}