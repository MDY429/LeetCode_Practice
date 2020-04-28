import java.util.Arrays;

/**
 * url: https://leetcode.com/problems/squares-of-a-sorted-array/
 * 
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 * 
 * Example 1:
 * Input: [-4,-1,0,3,10] Output: [0,1,9,16,100] 
 * 
 * Example 2:
 * Input: [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 * Note:
 * 1. 1 <= A.length <= 10000 
 * 2. -10000 <= A[i] <= 10000 
 * 3. A is sorted in non-decreasing order.
 */
public class E977_Squares_of_a_Sorted_Array {

    /**
     * Use arrays sort.
     * 
     * @param A The input of array.
     * @return The sorted squares array.
     */
    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }

        Arrays.sort(A);

        return A;
    }

    /**
     * Use two pointer.
     * 
     * @param A The input of array.
     * @return The sorted squares array.
     */
    public int[] sortedSquares_TwoPointer(int[] A) {

        int n = A.length;
        int j = 0;

        // Count the negative elements.
        while (j < n && A[j] < 0) {
            j++;
        }

        // i is position of last negative element.
        int i = j - 1;
        int[] arr = new int[n];

        int k = 0;
        while (k < n && i >= 0 && j < n) {
            int a = A[j] * A[j];
            int b = A[i] * A[i];

            if (a <= b) {
                arr[k] = a;
                j++;
            } else {
                arr[k] = b;
                i--;
            }
            k++;
        }

        // The rest of negative elements.
        while (i >= 0) {
            arr[k] = A[i] * A[i];
            i--;
            k++;
        }

        // The rest of positive elements.
        while (j < n) {
            arr[k] = A[j] * A[j];
            j++;
            k++;
        }

        return arr;
    }

    public static void main(String[] args) {
        E977_Squares_of_a_Sorted_Array e977 = new E977_Squares_of_a_Sorted_Array();
        int[] A = new int[] { -11, -8, -5, 0, 1, 2, 5, 6, 8, -11 };
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
            C[i] = A[i];
        }

        for (int i : e977.sortedSquares(B)) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : e977.sortedSquares(C)) {
            System.out.print(i + " ");
        }

    }
}