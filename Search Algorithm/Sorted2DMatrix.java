
import java.util.Arrays;

public class Sorted2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = { // Test Cases - 1
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 3;


        int[][] matrix2 = { // Test Cases - 2
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17},
            {19, 21, 23},
            {25, 27, 29}
        };
        int target2 = 21;


        int[][] matrix3 = { // Test Cases - 3
            {1, 3, 5, 7, 9},
            {11, 13, 15, 17, 19},
            {21, 23, 25, 27, 29}
        };
        int target3 = 15;


        int[][] matrix4 = {}; // Test Cases - 4
        int target4 = 3;


        int[][] matrix5 = { // Test Cases - 5
            {42}
        };
        int target5 = 42;


        int[][] matrix6 = { // Test Cases - 6
            {42}
        };
        int target6 = 99;

        System.out.println(Arrays.toString(findTarget(matrix, target)));
        System.out.println(Arrays.toString(findTarget(matrix2, target2)));
        System.out.println(Arrays.toString(findTarget(matrix3, target3)));
        System.out.println(Arrays.toString(findTarget(matrix4, target4)));
        System.out.println(Arrays.toString(findTarget(matrix5, target5)));
        System.out.println(Arrays.toString(findTarget(matrix6, target6)));
    }

    public static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] findTarget(int[][] matrix, int target) {
        // Check if the matrix is empty or invalid
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1}; // Target cannot be found
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            // Single row case
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        // Narrow down the rows using the middle column
        while (rowStart < rowEnd - 1) { // Stop when only two rows remain
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};
            } else if (matrix[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // Check the two remaining rows in the middle column
        if (matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }
        if (matrix[rowEnd][colMid] == target) {
            return new int[]{rowEnd, colMid};
        }

        // Search in four quadrants of the matrix
        int[] result = binarySearch(matrix, rowStart, 0, colMid - 1, target);
        if (result[0] != -1) {
            return result;
        }

        result = binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
        if (result[0] != -1) {
            return result;
        }

        result = binarySearch(matrix, rowEnd, 0, colMid - 1, target);
        if (result[0] != -1) {
            return result;
        }

        return binarySearch(matrix, rowEnd, colMid + 1, cols - 1, target);
    }
}
