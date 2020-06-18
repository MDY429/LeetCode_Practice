/**
 * url: https://leetcode.com/problems/ransom-note/
 * 
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 * 
 * Each letter in the magazine string can only be used once in your ransom note.
 * 
 * Example 1: Input: ransomNote = "a", magazine = "b" Output: false
 * 
 * Example 2: Input: ransomNote = "aa", magazine = "ab" Output: false
 * 
 * Example 3: Input: ransomNote = "aa", magazine = "aab" Output: true
 * 
 * Constraints:You may assume that both strings contain only lowercase letters.
 */
public class E383_Ransom_Note {

    /**
     * Use an array to count magazine characters and minus ransomNote characters.
     * 
     * @param ransomNote The input of String
     * @param magazine   The input of String
     * @return Boolean
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        E383_Ransom_Note e383 = new E383_Ransom_Note();
        String ransomNote = "c";
        String magazine = "aab";

        System.out.println(e383.canConstruct(ransomNote, magazine));
    }
}