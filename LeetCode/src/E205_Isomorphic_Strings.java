import java.util.HashMap;
import java.util.Map;

/**
 * url: https://leetcode.com/problems/isomorphic-strings/
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example 1: Input: s = "egg", t = "add" Output: true
 * 
 * Example 2: Input: s = "foo", t = "bar" Output: false
 * 
 * Example 3: Input: s = "paper", t = "title" Output: true
 * 
 * Note: You may assume both s and t have the same length.
 */
public class E205_Isomorphic_Strings {

    /**
     * Use two map to record the every character, and compare them whether different.
     * 
     * @param s The first word.
     * @param t The second word.
     * @return Boolean
     */
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ss = s.charAt(i);
            char tt = t.charAt(i);

            if (mapS.containsKey(ss)) {
                if (mapS.get(ss) != tt) {
                    return false;
                }
            } else {
                mapS.put(ss, tt);
            }

            if (mapT.containsKey(tt)) {
                if (mapT.get(tt) != ss) {
                    return false;
                }
            } else {
                mapT.put(tt, ss);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        E205_Isomorphic_Strings e205 = new E205_Isomorphic_Strings();
        String s = "add";
        String t = "daa";
        System.out.println(e205.isIsomorphic(s, t));

    }
}