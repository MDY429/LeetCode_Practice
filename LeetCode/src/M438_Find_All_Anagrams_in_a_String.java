import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * url: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * 
 * Given a string s and a non-empty string p, find all the start indices of p's
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * Example 1: Input: s: "cbaebabacd" p: "abc" Output: [0, 6] Explanation: The
 * substring with start index = 0 is "cba", which is an anagram of "abc". The
 * substring with start index = 6 is "bac", which is an anagram of "abc".
 * 
 * Example 2: Input: s: "abab" p: "ab" Output: [0, 1, 2] Explanation: The
 * substring with start index = 0 is "ab", which is an anagram of "ab". The
 * substring with start index = 1 is "ba", which is an anagram of "ab". The
 * substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class M438_Find_All_Anagrams_in_a_String {

    /**
     * Use array to make hash table to store the corresponding character.
     * 
     * @param s The input of String
     * @param p The input of String
     * @return The index list of anagrams
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int p_len = p.length();
        int s_len = s.length();

        int[] arr = new int[26];

        for (char c : p.toCharArray()) {
            arr[c - 'a']++;
        }

        for (int i = 0; i + p_len <= s_len; i++) {

            String temp = s.substring(i, i + p_len);
            int[] arr2 = new int[26];

            for (char c : temp.toCharArray()) {
                arr2[c - 'a']++;
            }

            if (Arrays.equals(arr, arr2)) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        M438_Find_All_Anagrams_in_a_String m438 = new M438_Find_All_Anagrams_in_a_String();
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(m438.findAnagrams(s, p));
    }
}