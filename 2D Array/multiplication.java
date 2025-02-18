import java.util.*;
public class multiplication {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible");
        } else {
            int[][] multiply = new int[r1][c2];

            for (int i = 0; i < r1; i++) { // roe number
                for (int j = 0; j < c2; j++) { // column number
                    for (int k = 0; k < c1; k++) {
                        multiply[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two matrices: ");
            printMatrix(multiply);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows and columns of 1st matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("Enter the elements of 1st matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the rows and columns of 2nd matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("Enter the elements of 2nd matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1: ");
        printMatrix(a);
        System.out.println("Matrix 2: ");
        printMatrix(b);

        multiply(a, r1, c1, b, r2, c2);
        sc.close();
    }

}
