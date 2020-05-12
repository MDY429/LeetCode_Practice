import java.util.HashMap;
import java.util.Map;

/**
 * url: https://leetcode.com/problems/most-common-word/
 * 
 * Given a paragraph and a list of banned words, return the most frequent word
 * that is not in the list of banned words. It is guaranteed there is at least
 * one word that isn't banned, and that the answer is unique.
 * 
 * Words in the list of banned words are given in lowercase, and free of
 * punctuation. Words in the paragraph are not case sensitive. The answer is in
 * lowercase.
 * 
 * Example:
 * 
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"] 
 * Output: "ball" 
 * Explanation: "hit" occurs 3 times, but it is a banned word. "ball" occurs 
 * twice (and no other word does), so it is the most frequent non-banned word in 
 * the paragraph. Note that words in the paragraph are not case sensitive, that 
 * punctuation is ignored (even if adjacent to words, such as "ball,"), and 
 * that "hit" isn't the answer even though it occurs more because it is banned.
 * 
 * Note:
 * 1. 1 <= paragraph.length <= 1000.
 * 2. 0 <= banned.length <= 100.
 * 3. 1 <= banned[i].length <= 10.
 * 4. The answer is unique, and written in lowercase (even if its occurrences in 
 *    paragraph may have uppercase symbols, and even if it is a proper noun.)
 * 5. paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * 6. There are no hyphens or hyphenated words.
 * 7. Words only consist of letters, never apostrophes or other punctuation symbols.
 * 
 */
public class E819_Most_Common_Word {

    /**
     * Use "split" to let the paragraph into string array. And use map to store and
     * remove the words and counting.
     * 
     * @param paragraph The input of paragraph String.
     * @param banned    The array of banned String.
     * @return The most common word.
     */
    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[\\p{Punct}\\s]+");

        for (String word : words) {
            int i = 1;
            if (map.containsKey(word)) {
                i = map.get(word);
                i++;
            }
            map.put(word, i);
        }

        for (String word : banned) {
            if (map.containsKey(word)) {
                map.remove(word);
            }
        }

        String ans = null;
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        E819_Most_Common_Word e819 = new E819_Most_Common_Word();

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[] { "hit" };
        System.out.println(e819.mostCommonWord(paragraph, banned));
    }
}