import java.util.HashMap;
import java.util.Map;

/**
 * url:
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 * 
 * You are given an array of strings words and a string chars.
 * 
 * A string is good if it can be formed by characters from chars (each character
 * can only be used once).
 * 
 * Return the sum of lengths of all good strings in words.
 * 
 * Example 1:
 * 
 * Input: words = ["cat","bt","hat","tree"], chars = "atach" 
 * Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer
 * is 3 + 3 = 6. 
 * 
 * Example 2:
 * 
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr" 
 * Output: 10 
 * Explanation: The strings that can be formed are "hello" and "world" so the
 * answer is 5 + 5 = 10.
 * 
 * Note:
 * 1. 1 <= words.length <= 1000
 * 2. 1 <= words[i].length, chars.length <= 100
 * 3. All strings contain lowercase English letters only.
 */
public class E1160_Find_Words_That_Can_Be_Formed_by_Characters {

    /**
     * Use hash map to store the character and how many time showed in words and
     * chars. To compare them to get which word could be formed.
     * 
     * @param words The array of words.
     * @param chars The input of string.
     * @return The total length.
     */
    public int countCharacters_HashTable(String[] words, String chars) {
        int totalForm = 0;
        Map<Character, Integer> map = new HashMap<>();

        // char[] charArray = chars.toCharArray();
        // for (char c : charArray) {
        for (int i = 0; i < chars.length(); i++) {
            int k = 1;
            char c = chars.charAt(i);
            if (map.containsKey(c)) {
                k = map.get(c);
                k++;
            }
            map.put(c, k);
        }

        for (String word : words) {
            Map<Character, Integer> tmp = new HashMap<>();
            // charArray = word.toCharArray();
            // for (char c : charArray) {
            for (int i = 0; i < word.length(); i++) {
                int k = 1;
                char c = word.charAt(i);
                if (tmp.containsKey(c)) {
                    k = tmp.get(c);
                    k++;
                }
                tmp.put(c, k);
            }

            Boolean isValid = true;
            // for (char c : charArray) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!map.containsKey(c)) {
                    isValid = false;
                    break;
                } else {
                    if (map.get(c) < tmp.get(c)) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                // System.out.println(word);
                totalForm += word.length();
            }
        }

        return totalForm;
    }

    /**
     * Use the integer array to count how many times alphabet showed in words and
     * chars. And subtract two array's element to check words whether could be
     * formed.
     * 
     * @param words The array of words.
     * @param chars The input of string.
     * @return The total length.
     */
    public int countCharacters(String[] words, String chars) {
        int totalForm = 0;

        int[] countChars = countShowed(chars);

        for (String word : words) {
            int[] countStr = countShowed(word);

            if (isPossibleForm(countStr, countChars)) {
                totalForm += word.length();
            }
        }

        return totalForm;
    }

    /**
     * To count total showed alphabet in string and set the number showed in array.
     * 
     * @param string The input of String
     * @return The counted array.
     */
    private int[] countShowed(String string) {
        int[] count = new int[26];
        for (int i = 0; i < string.length(); i++) {
            count[string.charAt(i) - 'a']++;
        }

        return count;
    }

    /**
     * Check whether countChars array could be formed by countStr.
     * 
     * @param countStr   The input of countStr counted array.
     * @param countChars The input of countChars counted array.
     * @return Boolean.
     */
    private Boolean isPossibleForm(int[] countStr, int[] countChars) {

        for (int i = 0; i < 26; i++) {
            if (countChars[i] - countStr[i] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        E1160_Find_Words_That_Can_Be_Formed_by_Characters e1160 = new E1160_Find_Words_That_Can_Be_Formed_by_Characters();
        String[] words = new String[] {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        // String[] words = new String[] {"cat","bt","hat","tree"};
        // String chars = "atach";
        System.out.println(e1160.countCharacters_HashTable(words, chars));
        System.out.println(e1160.countCharacters(words, chars));
    }
}