/**
 * url: https://leetcode.com/problems/climbing-stairs/
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * Note: Given n will be a positive integer. 
 * 
 * Example 1: 
 * Input: 2 Output: 2 
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * Example 2:
 * Input: 3 Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class E70_Climbing_Stairs {

    /**
     * We can use Fibonacci to solve this question. Time complicity is O(n).
     * @param n The input of many steps.
     * @return The total steps.
     */
    public int climbStairs(int n) {
        if (n < 2)
            return 1;

        if (n == 2)
            return 2;

        int first = 1;
        int second = 2;
        int out = 0;
        for (int i = 2; i < n; i++) {
            out = first + second;
            first = second;
            second = out;
        }

        return out;
    }

    public static void main(String[] args) {
        E70_Climbing_Stairs e70 = new E70_Climbing_Stairs();

        for (int n = 1; n < 30; n++) {
            System.out.println(e70.climbStairs(n));
        }
    }
}

/*
At here, we can figure out the sequence is Fibonacci.

Input: 1
-> 1

Input: 2
-> 1 + 1
-> 2

Input: 3
-> (1 + 1) + 1  ╴╴╴┐ Input2 answer plus 1
-> (2) + 1 ________|
-> (1) + 2 --------- Input1 answer plus 2

Input: 4
-> (1 + 1 + 1) + 1 ╴┐ Input3 answer puls 1
-> (2 + 1) + 1      |
-> (1 + 2) + 1 _____|
-> (1 + 1) + 2 ╴╴╴╴╴┐ Input2 answer plus 2
-> (2) + 2 _________|

*/