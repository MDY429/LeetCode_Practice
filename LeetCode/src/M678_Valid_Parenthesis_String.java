/**
 * url: https://leetcode.com/problems/valid-parenthesis-string/
 * 
 * Given a string containing only three types of characters: '(', ')' and '*',
 * write a function to check whether this string is valid. We define the
 * validity of a string by these rules:
 * 
 * 1. Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * 2. Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * 3. Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * 4. '*' could be treated as a single right parenthesis ')' or a single left
 *      parenthesis '(' or an empty string.
 * 5. An empty string is also valid.
 * 
 * Example 1: Input: "()" Output: True
 * Example 2: Input: "(*)" Output: True
 * Example 3: Input: "(*))" Output: True
 * 
 * Note: The string size will be in the range [1, 100].
 */
public class M678_Valid_Parenthesis_String {

    public boolean checkValidString(String s) {

        int balanceP = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balanceP++;
                max++;
            } else if (c == ')') {
                if (balanceP > 0) {
                    balanceP--;
                }
                max--;
            } else {
                if (balanceP > 0) {
                    balanceP--;
                }
                max++;
            }

            if (max < 0) {
                return false;
            }
        }

        return balanceP == 0;
    }

    public static void main(String[] args) {
        M678_Valid_Parenthesis_String m678 = new M678_Valid_Parenthesis_String();
        String s = "(*))";
        System.out.println(m678.checkValidString(s));
    }
}