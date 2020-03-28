/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1: 
 * Input: ["flower","flow","flight"] 
 * Output: "fl"
 * 
 * Example 2: 
 * Input: ["dog","racecar","car"] 
 * Output: "" 
 * Explanation: There is no common prefix among the input strings. 
 * 
 * Note: 
 * All given inputs are in lowercase letters a-z.
 */
public class E14_Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length < 1){
            return "";
        }

        String firstWord = strs[0];
        String prefix = "";
        boolean runAll = false;

        for(int i=0; i<firstWord.length(); i++) {
            for(int j=0; j<strs.length; j++) {
                if(i<strs[j].length() && firstWord.charAt(i) == strs[j].charAt(i)) {
                    if(j == strs.length -1) {
                        prefix += firstWord.charAt(i);
                    }
                }
                else {
                    runAll = true;
                    break;
                }
            }
            if(runAll) {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        E14_Longest_Common_Prefix solution = new E14_Longest_Common_Prefix();
        
        // String[] strs = {"flower","flow","flight"};
        String[] strs = {};
        // String[] strs = {"dog","racecar","car"};
        // String[] strs = {"int", "intent", "index", "independent"};
        
        System.out.println(solution.longestCommonPrefix(strs));
        
    }

}