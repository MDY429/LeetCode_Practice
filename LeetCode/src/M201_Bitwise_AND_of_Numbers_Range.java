/**
 * url: https://leetcode.com/problems/bitwise-and-of-numbers-range/
 * 
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND
 * of all numbers in this range, inclusive.
 * 
 * Example 1: Input: [5,7] Output: 4
 * 
 * Example 2: Input: [0,1] Output: 0
 */
public class M201_Bitwise_AND_of_Numbers_Range {

    /**
     * Bitwise-AND of any two numbers will always produce a number less than or
     * equal to the smaller number.
     * 
     * @param m The first input number.
     * @param n The second input number.
     * @return The number of bitwise AND of all numbers in this range
     */
    public int rangeBitwiseAnd(int m, int n) {

        while (n > m) {
            n = n & (n - 1);
        }

        return m & n;
    }

    public static void main(String[] args) {
        M201_Bitwise_AND_of_Numbers_Range m201 = new M201_Bitwise_AND_of_Numbers_Range();
        int m = 5;
        int n = 7;
        System.out.println(m201.rangeBitwiseAnd(m, n));
    }
}