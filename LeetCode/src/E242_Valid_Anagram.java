/**
 * url: https://leetcode.com/problems/valid-anagram/
 * 
 * Given two strings s and t , write a function to determine if t is an anagram
 * of s.
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram" Output: true 
 * 
 * Example 2:
 * Input: s = "rat", t = "car" Output: false 
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * Follow up: What if the inputs contain unicode characters? How would you adapt
 * your solution to such case?
 */
public class E242_Valid_Anagram {

    /**
     * Use array to record the character show in string.
     * 
     * @param s The input of String,
     * @param t The input of String.
     * @return Boolean
     */
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        E242_Valid_Anagram e242 = new E242_Valid_Anagram();
        String s = "abcde";
        String t = "debac";
        System.out.println(e242.isAnagram(s, t));
    }
}