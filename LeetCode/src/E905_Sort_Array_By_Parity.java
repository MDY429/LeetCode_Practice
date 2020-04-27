/**
 * url: https://leetcode.com/problems/sort-array-by-parity/
 * 
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * Example 1:
 * 
 * Input: [3,1,2,4] Output: [2,4,3,1] 
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * Note:
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class E905_Sort_Array_By_Parity {

    /**
     * Use two loop to find the even and odd number then store to arr.
     * 
     * @param A The input of array.
     * @return The array stores even number first.
     */
    public int[] sortArrayByParity(int[] A) {

        int[] arr = new int[A.length];
        int k = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[k] = A[i];
                k++;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                arr[k] = A[i];
                k++;
            }
        }

        return arr;
    }

    /**
     * Use divide and conquer. (not necessary.)
     * 
     * @param A The input of array.
     * @return The array stores even number first.
     */
    public int[] sortArrayByParity1(int[] A) {
        helper(A, 0, A.length);
        return A;
    }

    private void helper(int[] A, int l, int r) {

        if (r - l <= 1) {
            return;
        }
        int mid = l + (r - l) / 2;
        helper(A, l, mid);
        helper(A, mid, r);
        merge(A, l, mid, r);
    }

    private void merge(int[] A, int l, int mid, int r) {
        int[] tmp = new int[r - l];
        int i = 0;
        int j = 0;
        while (l + i < mid && mid + j < r) {
            if (A[l + i] % 2 == 0) {
                tmp[i + j] = A[l + i];
                i++;
            } else {
                tmp[i + j] = A[mid + j];
                j++;
            }
        }

        while (l + i < mid) {
            tmp[i + j] = A[l + i];
            i++;
        }

        while (mid + j < r) {
            tmp[i + j] = A[mid + j];
            j++;
        }

        for (i = 0; i < r - l; i++) {
            A[l + i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        E905_Sort_Array_By_Parity e905 = new E905_Sort_Array_By_Parity();
        int[] A = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] ans = e905.sortArrayByParity(A);
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }
}