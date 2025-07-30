package test;

public class Search2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {

            int row =0;
            int col = matrix[0].length -1;
            // loop from top right to bottom left
            while ( row < matrix.length && col >= 0 ){
                int val = matrix[row][col];
                if( val == target )
                    return true;
                else if( val > target )
                    col --;
                else
                    row++;
            }

            return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,  4,  7, 11},
                {2,  5,  8, 12},
                {3,  6,  9, 16},
                {10, 13, 14, 17}

        };

        int target = 3;

        System.out.println(searchMatrix(matrix, target));  // Output: true

    }
}
