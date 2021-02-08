/**
 * Given a string s and a character c that occurs in s, return an array of
 * integers answer where answer.length == s.length and answer[i] is the shortest
 * distance from s[i] to the character c in s.
 * 
 * Example 1:
 * Input: s = "loveleetcode", c = "e" Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 * 
 * Example 2:
 * Input: s = "aaab", c = "b" Output: [3,2,1,0]
 * 
 * 
 * Constraints:
 * 1. 1 <= s.length <= 104 
 * 2. s[i] and c are lowercase English letters.
 * 3. c occurs at least once in s.
 */
public class E821_Shortest_Distance_to_a_Character {

    /**
     * Using loop to let distance array to be correct.
     * 
     * @param s The input of String.
     * @param c The check character.
     * @return The array of distance.
     */
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        // Set 0 if the character is the same, otherwise set as length.
        for (int i = 0; i < n; i++) {
            ans[i] = (s.charAt(i) == c) ? 0 : n;
        }

        // Check the array from left to right.
        for (int i = 1; i < n; i++) {
            ans[i] = Math.min(ans[i], ans[i - 1] + 1);
        }

        // Check the array from right to left.
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.min(ans[i], ans[i + 1] + 1);
        }

        return ans;
    }

    /**
     * Using 2 loops and variable(pos) to set the start position and make the
     * shortest distance from left to right and right to left.
     * 
     * @param s The input of String.
     * @param c The check character.
     * @return The array of distance.
     */
    public int[] shortestToChar2(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        int pos = -n;

        // left -> right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            ans[i] = i - pos;
        }

        // right -> left
        for (int i = pos - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            // answer will be the min distance from c.
            ans[i] = Math.min(ans[i], pos - i);
        }

        return ans;
    }

    /**
     * Combine above two methods.
     * 
     * @param s The input of String.
     * @param c The check character.
     * @return The array of distance.
     */
    public int[] shortestToChar3(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];
        
        // Set default value.
        int distance = n;
        int pos = 0;

        for(int i = 0 ; i < n; i++) {
            if(s.charAt(i) == c) {
                // Set left side distance.
                pos = i - 1;
                while(pos >= 0 && (i - pos) < ans[pos]) {
                    ans[pos] = i - pos;
                    pos--;
                }

                // Coz find the corresponding character, set distance to 0.
                distance = 0;
            }

            ans[i] = distance++;
        }

        return ans;
    }

    public static void main(String[] args) {
        
        E821_Shortest_Distance_to_a_Character e821 = new E821_Shortest_Distance_to_a_Character();
        String s = "loveleetcode";
        char c = 'e';
        for(int i : e821.shortestToChar(s, c)) {
            System.out.print(i + " ");
        }

    }
}
