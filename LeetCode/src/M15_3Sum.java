import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the sum
 * of zero.
 * 
 * Note: The solution set must not contain duplicate triplets.
 * 
 * Example: Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 */
public class M15_3Sum {

    /**
     * Fix the first number in array, then use two sum to find the last two value.
     * 
     * @param nums The input of number array.
     * @return The list of list of integer.
     */
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> hashSet = new HashSet<>();
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Put all elements to hash map.
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        // Fix the first number and find the rest of values.
        for (int i = 0; i < nums.length - 2; i++) {
            // Start from i + 1 and stop at nums.length -1 (no need to go the last element.)
            for (int j = i + 1; j < nums.length - 1; j++) {

                // a + b + c = 0 -> c = -a - b
                int complement = -nums[i] - nums[j];
                if (hashMap.containsKey(complement)) {
                    if (!hashMap.get(complement).equals(i) && !hashMap.get(complement).equals(j)) {
                        List<Integer> combine = new ArrayList<>();
                        combine.add(nums[i]);
                        combine.add(nums[j]);
                        combine.add(complement);
                        // Sort it to prevent the same answer with different sequence.
                        Collections.sort(combine);
                        hashSet.add(combine);
                    }
                }
            }
        }

        return new ArrayList<>(hashSet);
    }

    public static void main(String[] args) {
        M15_3Sum a = new M15_3Sum();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(a.threeSum(nums));
    }
}