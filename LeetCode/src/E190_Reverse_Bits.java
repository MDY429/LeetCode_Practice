/**
 * url: https://leetcode.com/problems/reverse-bits/
 * 
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * Example 1:
 * 
 * Input: 00000010100101000001111010011100 Output:
 * 00111001011110000010100101000000 Explanation: The input binary string
 * 00000010100101000001111010011100 represents the unsigned integer 43261596, so
 * return 964176192 which its binary representation is
 * 00111001011110000010100101000000. Example 2:
 * 
 * Input: 11111111111111111111111111111101 Output:
 * 10111111111111111111111111111111 Explanation: The input binary string
 * 11111111111111111111111111111101 represents the unsigned integer 4294967293,
 * so return 3221225471 which its binary representation is
 * 10111111111111111111111111111111.
 * 
 * 
 * Note:
 * 
 * Note that in some languages such as Java, there is no unsigned integer type.
 * In this case, both input and output will be given as signed integer type and
 * should not affect your implementation, as the internal binary representation
 * of the integer is the same whether it is signed or unsigned.
 * 
 * In Java, the compiler represents the signed integers using 2's complement
 * notation. Therefore, in Example 2 above the input represents the signed
 * integer -3 and the output represents the signed integer -1073741825.
 */
public class E190_Reverse_Bits {

    /**
     * Let last bit to left shift to corresponding bits. Then decreasing the move
     * bit and right shift n.
     * 
     * @param n The input of binary number.
     * @return The reverse value.
     */
    public int reverseBits(int n) {

        int reverse = 0;
        int move = 31;

        while (move >= 0) {
            int lastBit = n & 1;
            if (lastBit == 1) {
                reverse |= lastBit << move;
            }
            move--;
            n >>= 1;
        }

        return reverse;
    }

    public static void main(String[] args) {
        E190_Reverse_Bits e190 = new E190_Reverse_Bits();

        String s = "11111111111111111111111111111101";
        int n = 0;
        
        for (int i = 0; i < 32; i++) {
            if (s.charAt(i) == '0') {
                continue;
            }
            n |= (s.charAt(i) - '0') << (31 - i);
        }
        
        System.out.println(e190.reverseBits(n));
    }
}