import java.util.ArrayList;
import java.util.List;

/**
 * url: https://leetcode.com/problems/subsets/
 * 
 * Given a set of distinct integers, nums, return all possible subsets (the
 * power set).
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * Example:
 * 
 * Input: nums = [1,2,3] Output: [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2],
 * [] ]
 */
public class M78_Subsets {

    /**
     * Use recursion to find the all sub set.
     * 
     * @param nums The input of distinct sequence.
     * @return The all possible set.
     */
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> sequence = new ArrayList<>();
        for (int i : nums) {
            sequence.add(i);
        }

        findSubSet(ans, new ArrayList<>(), sequence, 0);

        return ans;
    }

    /**
     * Use recursion to find the possible set.
     * 
     * @param powerSet The list to store the possible sub set.
     * @param set      The list to store the possible combination.
     * @param sequence The distinct sequence.
     * @param index    The index of sequence.
     */
    private void findSubSet(List<List<Integer>> powerSet, List<Integer> set, List<Integer> sequence, int index) {

        if (index == sequence.size()) {
            powerSet.add(new ArrayList<>(set));
        } else {
            set.add(sequence.get(index));
            findSubSet(powerSet, set, sequence, index + 1);
            set.remove(set.size() - 1);
            findSubSet(powerSet, set, sequence, index + 1);
        }
    }

    public static void main(String[] args) {
        M78_Subsets m78 = new M78_Subsets();

        int[] nums = new int[] { 1, 2, 3 };

        System.out.println(m78.subsets(nums));
    }
}