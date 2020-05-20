/**
 * url: https://leetcode.com/problems/search-a-2d-matrix/
 * 
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right. The first integer of each
 * row is greater than the last integer of the previous row. Example 1:
 * 
 * Input: matrix = [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50] ] 
 * target = 3 Output: true
 * 
 * Example 2:
 * 
 * Input: matrix = [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50] ]
 * target = 13 Output: false
 */
public class M74_Search_a_2D_Matrix {

    /**
     * Use two binary search to find the correct row and column
     * 
     * @param matrix The input of 2D array.
     * @param target The target value.
     * @return Boolean
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        // Prevent empty array, sub array and overvalue.
        if (matrix == null || matrix.length < 1 || matrix[0] == null || matrix[0].length < 1) {
            return false;
        } else if (target > matrix[matrix.length - 1][matrix[0].length - 1] || target < matrix[0][0]) {
            return false;
        }

        int up = 0;
        int down = matrix.length - 1;
        int row = 0;

        // Binary search vertical 2D array.
        while (up <= down) {
            int mid = up + (down - up) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (target > matrix[mid][0]) {
                up = mid + 1;
            } else {
                down = mid - 1;
            }

            row = down;
        }

        // System.out.println(row);

        int left = 0;
        int right = matrix[0].length - 1;

        // Binary search horizontal 2D array.
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == matrix[row][mid]) {
                return true;
            } else if (target > matrix[row][mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        M74_Search_a_2D_Matrix m74 = new M74_Search_a_2D_Matrix();

        int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 }, { 55, 60, 70, 80 } };

        int target = 20;

        System.out.println(m74.searchMatrix(matrix, target));
    }
}