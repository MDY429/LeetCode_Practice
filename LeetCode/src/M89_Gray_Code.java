import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * url: https://leetcode.com/problems/gray-code/ 
 * reference: https://en.wikipedia.org/wiki/Gray_code
 * 
 * The gray code is a binary numeral system where two successive values differ
 * in only one bit.
 * 
 * Given a non-negative integer n representing the total number of bits in the
 * code, print the sequence of gray code. A gray code sequence must begin with
 * 0.
 * 
 * Example 1: Input: 2 Output: [0,1,3,2] 
 * Explanation:
 *  00 - 0
 *  01 - 1
 *  11 - 3
 *  10 - 2
 */
public class M89_Gray_Code {

    /**
     * Gray code is made by the previous list. Then, make a mirror copy and at the
     * leftmost add 0 and 1 respectively.
     * 
     * @param n The input of bits number.
     * @return The list of gray code (decimal)
     */
    public List<Integer> grayCode(int n) {

        if(n <= 0) {
            return new ArrayList<>(Arrays.asList(0));
        }

        if(n==1) {
            return new ArrayList<>(Arrays.asList(0,1));
        }

        List<Integer> out = new ArrayList<>();
        out.add(0);
        out.add(1);

        for (int i = 1; i < n; i++) {
            for (int j = out.size() - 1; j >= 0; j--) {
                out.add((1 << i) + out.get(j));
            }
        }

        return out;
    }

    /**
     * Use Recursion.
     * 
     * @param n The input of bits number.
     * @return The list of gray code (decimal)
     */
    public List<Integer> grayCode_Recursion(int n) {

        if (n <= 0) {
            return new ArrayList<>(Arrays.asList(0));
        }
        if (n == 1) {
            return new ArrayList<>(Arrays.asList(0, 1));
        }

        List<Integer> out = new ArrayList<>(grayCode_Recursion(n - 1));
        int size = out.size();

        // Use Logarithm to find out how many bits should move.
        int adder = (1 << (int) (Math.log(size) / Math.log(2)));
        for (int i = size - 1; i >= 0; i--) {
            out.add(adder + out.get(i));
        }

        return out;
    }

    public static void main(String[] args) {
        M89_Gray_Code m89 = new M89_Gray_Code();

        int n = 5;
        System.out.println(m89.grayCode(n).toString());
    }
}

/*
2 bit gray code
00 - 0
01 - 1
11 - 3
10 - 2

3 bit gray code 
1. Make a mirror copy 
00
01
11
10
------
10
11
01
00

2. At the leftmost add 0 and  1 respectively.
000 - 0
001 - 1
011 - 3
010 - 2
------
110 - 6
111 - 7
101 - 5
100 - 4

*/