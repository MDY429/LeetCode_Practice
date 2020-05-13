import java.util.HashMap;
import java.util.Map;

/**
 * url: https://leetcode.com/problems/contains-duplicate/
 * 
 * Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 * 
 * Example 1:
 * 
 * Input: [1,2,3,1] Output: true
 * 
 * Example 2:
 * 
 * Input: [1,2,3,4] Output: false
 * 
 * Example 3:
 * 
 * Input: [1,1,1,3,3,4,3,2,4,2] Output: true
 */
public class E217_Contains_Duplicate {

    /**
     * Use hash map to find duplicated element when inserting.
     * 
     * @param nums The input of integer array.
     * @return Boolean
     */
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }

        return false;
    }

    public static void main(String[] args) {
        E217_Contains_Duplicate e217 = new E217_Contains_Duplicate();
        int[] nums = new int[] { 1, 3, 9, 5, 7, 9 };
        System.out.println(e217.containsDuplicate(nums));
    }
}