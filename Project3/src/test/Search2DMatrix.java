package test;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = matrix.length, cols = matrix[0].length;
        int top = 0, bottom = rows - 1;

        // Step 1: Binary search to find the correct row
        while (top <= bottom) {
            int row = top + (bottom - top) / 2;

            if (target < matrix[row][0]) {
                bottom = row - 1;
            } else if (target > matrix[row][cols - 1]) {
                top = row + 1;
            } else {
                // Step 2: Binary search within the row
                int left = 0, right = cols - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (matrix[row][mid] == target) {
                        return true;
                    } else if (matrix[row][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                return false; // Target not found in the row
            }
        }

        return false; // Target not found in any row
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        System.out.println(searchMatrix(matrix, target));  // Output: true

    }
}
