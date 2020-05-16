/**
 * url: https://leetcode.com/problems/missing-number/
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * Example 1:
 * 
 * Input: [3,0,1] Output: 2
 * 
 * Example 2:
 * 
 * Input: [9,6,4,2,3,5,7,0,1] Output: 8
 * 
 * Note: Your algorithm should run in linear runtime complexity. Could you
 * implement it using only constant extra space complexity?
 */
public class E268_Missing_Number {

    /**
     * Use mathematical to find the missing number.
     * 
     * @param nums The input of number array.
     * @return The missing number.
     */
    public int missingNumber(int[] nums) {

        int size = nums.length;
        int total = (0 + size) * (size + 1) / 2;
        for (int i : nums) {
            total -= i;
        }

        return total;
    }

    /**
     * Use bit manipulate to find the missing number. XOR would let number showed in
     * twice become zero. Then zero XOR and number would be this number.
     * 
     * @param nums The input of number array.
     * @return The missing number.
     */
    public int missingNumber_bit(int[] nums) {

        // Start with nums length.
        int missing = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }

        return missing;
    }

    public static void main(String[] args) {
        E268_Missing_Number e268 = new E268_Missing_Number();
        int[] nums = new int[] { 0, 8, 7, 9, 5, 4, 3, 2, 1, 6 };
        System.out.println(e268.missingNumber(nums));
        System.out.println(e268.missingNumber_bit(nums));
    }
}