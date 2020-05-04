/**
 * url: https://leetcode.com/problems/product-of-array-except-self/
 * 
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Example:
 * 
 * Input: [1,2,3,4] Output: [24,12,8,6] 
 * Constraint: It's guaranteed that the product of the elements of any prefix 
 * or suffix of the array (including the whole array) fits in a 32 bit integer.
 * 
 * Note: 
 * Please solve it without division and in O(n).
 * 
 * Follow up: 
 * Could you solve it with constant space complexity? (The output array does 
 * not count as extra space for the purpose of space complexity analysis.)
 */
public class M238_Product_of_Array_Except_Self {

    /**
     * Use two loop to times left and right elements except itself.
     * 
     * @param nums The input of array.
     * @return The array of production and except itself
     */
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] output = new int[len];

        output[0] = 1;
        // Times left elements from the leftmost.
        for (int i = 1; i < len; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        int p = 1;
        // Times right elements from the rightmost.
        for (int i = len - 1; i >= 0; i--) {
            output[i] = output[i] * p;
            p *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        M238_Product_of_Array_Except_Self m238 = new M238_Product_of_Array_Except_Self();
        int[] nums = new int[] { 6, 5, 3, 2, 1 };
        int[] output = m238.productExceptSelf(nums);

        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}