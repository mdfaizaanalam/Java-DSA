
import java.util.Scanner;

public class PascalTriangle {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascalTriangle(int n) {
        int[][] matrix = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i+1 columns
            matrix[i] = new int[i + 1];

            // first and last columns are 1
            matrix[i][0] = 1;
            matrix[i][i] = 1;

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int[][] matrix = pascalTriangle(n);
        printMatrix(matrix);
        sc.close();
    }
}
