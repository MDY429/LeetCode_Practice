import java.util.HashSet;
import java.util.Set;

/**
 * url: https://leetcode.com/problems/happy-number/
 * 
 * Write an algorithm to determine if a number n is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 * 
 * Return True if n is a happy number, and False if not.
 */
public class E202_Happy_Number {

    /**
     * Use hash set to store the combination of n.
     * 
     * @param n The input of value.
     * @return Boolean
     */
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }

            set.add(n);
            n = helper(n);
        }

        return true;
    }

    /**
     * Help method to find out the combination of n.
     * 
     * @param n The input of value.
     * @return The combination of n.
     */
    private int helper(int n) {

        int total = 0;
        while (n != 0) {
            total += Math.pow((n % 10), 2);
            n /= 10;
        }

        return total;
    }

    public static void main(String[] args) {

        E202_Happy_Number e202 = new E202_Happy_Number();
        int n = 102;
        System.out.println(e202.isHappy(n));
    }
}