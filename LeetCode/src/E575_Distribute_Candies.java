import java.util.HashSet;
import java.util.Set;

/**
 * url: https://leetcode.com/problems/distribute-candies/
 * 
 * Given an integer array with even length, where different numbers in this
 * array represent different kinds of candies. Each number means one candy of
 * the corresponding kind. You need to distribute these candies equally in
 * number to brother and sister. Return the maximum number of kinds of candies
 * the sister could gain.
 * 
 * Example 1: Input: candies = [1,1,2,2,3,3] Output: 3
 * Explanation: There are three different kinds of candies (1, 2 and 3), and two
 * candies for each kind. Optimal distribution: The sister has candies [1,2,3]
 * and the brother has candies [1,2,3], too. The sister has three different
 * kinds of candies.
 * 
 * Example 2: Input: candies = [1,1,2,3] Output: 2
 * Explanation: For example, the sister has candies [2,3] and the brother has
 * candies [1,1]. The sister has two different kinds of candies, the brother has
 * only one kind of candies.
 * 
 * Note:
 * 1. The length of the given array is in range [2, 10,000], and will be even.
 * 2. The number in given array is in range [-100,000, 100,000].
 */
public class E575_Distribute_Candies {

    /**
     * Set would not add duplicated number, we use this to store the maximum of
     * different kinds of candies.
     * 
     * @param candies The different kinds of candies.
     * @return The maximum of different kinds of candies.
     */
    public int distributeCandies(int[] candies) {
        int kinds = 0;
        int len = candies.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < len && kinds < len / 2; i++) {
            if (set.add(candies[i])) {
                kinds++;
            }
        }

        return kinds;
    }

    public static void main(String[] args) {
        
        E575_Distribute_Candies e575 = new E575_Distribute_Candies();
        int[] candies = new int[] {1,1,3,3,2,1};
        System.out.println(e575.distributeCandies(candies));

    }
}