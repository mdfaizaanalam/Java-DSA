
import java.util.Arrays;

public class RowCol2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
    }

    public static int[] searchMatrix(int[][] matrix, int target) {

        // Check for empty matrix case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
