import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct positive integers nums, return the largest subset
 * answer such that every pair (answer[i], answer[j]) of elements in this subset
 * satisfies:
 * 
 * answer[i] % answer[j] == 0, or answer[j] % answer[i] == 0
 * 
 * If there are multiple solutions, return any of them.
 * 
 * Example 1:
 * Input: nums = [1,2,3] Output: [1,2] Explanation: [1,3] is also accepted.
 * 
 * 
 * Example 2:
 * Input: nums = [1,2,4,8] Output: [1,2,4,8]
 * 
 * Constraints:
 * 1. 1 <= nums.length <= 1000
 * 2. 1 <= nums[i] <= 2 * 109
 * 3. All the integers in nums are unique.
 */

public class M368_Largest_Divisible_Subset {

    /**
     * Using loop to let 'count' to record the length of subset and 'pre' to save
     * the position of nums array if they match the condition.
     * 
     * @param nums The input of integers.
     * @return The list.
     */
    public List<Integer> largestDivisibleSubset(int[] nums) {

        int n = nums.length;
        int[] count = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);

        int max = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            count[i] = 1;
            pre[i] = -1;

            // From back to front to find the subset.
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0) {
                    if (1 + count[j] > count[i]) {
                        // Record the max subset in this round.
                        count[i] = count[j] + 1;

                        // Record the seconde to last number's position.
                        pre[i] = j;
                    }
                }
            }

            // Record the longest subset.
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }

        List<Integer> ans = new ArrayList<>();

        // Using the "pre" to find out the all of elements.
        while (index != -1) {
            ans.add(nums[index]);
            index = pre[index];
        }

        return ans;
    }

    public static void main(String[] args) {
        M368_Largest_Divisible_Subset m368 = new M368_Largest_Divisible_Subset();
        // int[] nums = new int[] { 21, 7, 2, 28, 14 };
        int[] nums = new int[] { 5, 9, 18, 54, 108, 540, 90, 180, 360, 720 };
        System.out.println(m368.largestDivisibleSubset(nums));
        // 2,7,14,21,28
        // [2,14,28],[7,14,28]
    }
}
