import java.util.ArrayList;
import java.util.List;

/**
 * url: https://leetcode.com/problems/combinations/
 * 
 * Given two integers n and k, return all possible combinations of k numbers out
 * of 1 ... n.
 * 
 * Example:
 * 
 * Input: n = 4, k = 2 Output: [ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4] ]
 * 
 * Reference: https://www.baeldung.com/java-combinatorial-algorithms
 */
public class M77_Combinations {

    /**
     * To get all possible combinations of k numbers out of 1 to n.
     * 
     * @param n The maximum integer.
     * @param k How many elements.
     * @return The list of all combinations.
     */
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();

        if (k > n) {
            return ans;
        }

        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequence.add(i + 1);
        }

        helper(ans, new ArrayList<>(), sequence, 0, k);

        return ans;
    }

    /**
     * Use recursion to find the possible combinations.
     * 
     * @param ans      The total list.
     * @param set      The possible set.
     * @param sequence The list of integer.
     * @param index    The index of sequence.
     * @param k        How many elements.
     */
    private void helper(List<List<Integer>> ans, List<Integer> set, List<Integer> sequence, int index, int k) {

        // how many more elements we need to add to the set to get a proper combination
        int restSetSize = k - set.size();

        // how many more elements we can add to the set.
        int couldBePut = sequence.size() - index;

        if (set.size() == k) {
            ans.add(new ArrayList<>(set));
        } else if (restSetSize <= couldBePut) {
            helper(ans, set, sequence, index + 1, k);
            set.add(sequence.get(index));
            helper(ans, set, sequence, index + 1, k);
            set.remove(set.size() - 1);
        }
    }

    public static void main(String[] args) {

        M77_Combinations m77 = new M77_Combinations();
        int n = 5;
        int k = 3;
        System.out.println(m77.combine(n, k));
    }

}