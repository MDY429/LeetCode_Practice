import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * url: https://leetcode.com/problems/word-pattern/
 * 
 * Given a pattern and a string str, find if str follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a
 * letter in pattern and a non-empty word in str.
 * 
 * Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
 * 
 * Example 2: Input: pattern = "abba", str = "dog cat cat fish" Output: false
 * 
 * Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
 * 
 * Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false
 * 
 * Notes: You may assume pattern contains only lowercase letters, and str
 * contains lowercase letters that may be separated by a single space.
 */
public class E290_Word_Pattern {

    /**
     * Use map and set to check wether follow the pattern.
     * 
     * @param pattern The input of string.
     * @param str     The input of String.
     * @return Boolean
     */
    public boolean wordPattern(String pattern, String str) {

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] arr = str.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[i])) {
                    return false;
                }
            } else {
                map.put(c, arr[i]);
                if (!set.add(arr[i])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        E290_Word_Pattern e290 = new E290_Word_Pattern();
        String pattern = "abba";
        String str = "dog fog fog dog";
        System.out.println(e290.wordPattern(pattern, str));
    }
}