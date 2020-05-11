/**
 * url: https://leetcode.com/problems/count-primes/
 * 
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * Example:
 * 
 * Input: 10 Output: 4 
 * Explanation: There are 4 prime numbers less than 10, they  are 2, 3, 5, 7.
 * 
 * Reference: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
public class E204_Count_Primes {

    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        Boolean[] isPrime = new Boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        
        // for (int i = 2; i < n; i++) {
        //     if (!isPrime[i]) {
        //         continue;
        //     }
        //     for (int j = 2; i * j < n; j++) {
        //         isPrime[i * j] = false;
        //     }
        // }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        E204_Count_Primes e204 = new E204_Count_Primes();

        int n = 499979;
        System.out.println(e204.countPrimes(n));
    }
}