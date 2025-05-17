package com.sanskar;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(search(arr, 6)));

    }

    // search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid -1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols -1, target);
        }

        int rowStart = 0; // row start
        int rowEnd = rows - 1;  // row end
        int colMid = cols / 2;  // middleCol = (total no. of column / 2);

        // run the loop till 2 rows are remaining.
        while (rowStart < (rowEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};
            }
            if (matrix[mid][colMid] < target) {
                rowStart = mid;  //  ignoring these rows now  rowStart is come below.
            } else {
                rowEnd = mid;   // ignoring bottom once rowEnd will become above.
            }

        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }

        if (matrix[rowStart + 1][colMid] == target) {
            return new int[]{rowStart + 1, colMid};
        }

        // search in first half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid-1, target);
        }
        // search in second half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols -1]) {
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);

        }
        // search in third half
        if (target <= matrix[rowStart +1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0,colMid - 1, target);

        }
        // search in fourth half
        else {
            return binarySearch(matrix,rowStart + 1, colMid + 1, cols - 1, target);
        }
    }
}

// Important Questions.
