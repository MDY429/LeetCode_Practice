/**
 * url: https://leetcode.com/problems/add-binary/
 * 
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * Input: a = "11", b = "1" Output: "100"
 * 
 * Example 2: 
 * Input: a = "1010", b = "1011" Output: "10101"
 */
public class E67_Add_Binary {

    /**
     * Here we only can use string to manipulate this question.
     * 
     * @param a The input of binary string.
     * @param b The input of binary string.
     * @return The added binary string.
     */
    public String addBinary(String a, String b) {

        // Remove unnecessary zero.
        a = removeZero(a);
        b = removeZero(b);

        int len_a = a.length() - 1;
        int len_b = b.length() - 1;
        
        String adding = new String();
        
        // Default carry is 0.
        char carry = '0';

        while (Math.max(len_a, len_b) >= 0) {
            char aa = (len_a >= 0) ? a.charAt(len_a--) : '0';
            char bb = (len_b >= 0) ? b.charAt(len_b--) : '0';

            // Situation 0 + 0 and 1 + 1
            if (aa == bb) {
                // If there is no carry, it should add 0.
                adding += (carry == '0') ? "0" : "1";
                carry = aa;
            } else {
                // If there is no carry, it should add 1.
                adding += (carry == '0') ? "1" : "0";
            }
        }

        // If there has carry in the end, it should be appended.
        if (carry == '1') {
            adding += "1";
        }

        // Reverse the String.
        String output = new String();
        for (int i = adding.length() - 1; i >= 0; i--) {
            output += adding.charAt(i);
        }

        return output;
    }

    /**
     * Remove unnecessary zero.
     * @param a The input string.
     * @return Removed string.
     */
    private static String removeZero(String a) {

        while(a.charAt(0) == '0' && a.length() > 1) {
            a = a.substring(1, a.length());
        }

        return a;
    }

    public static void main(String[] args) {
        E67_Add_Binary e67 = new E67_Add_Binary();

        String a = "1";
        String b = "1101";
        System.out.println(e67.addBinary(a, b));
    }
}