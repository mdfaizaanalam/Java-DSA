// For squeare matrix
import java.util.*;
public class Rotate90 {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0; 
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr [i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    static void inplaceTranspose(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void rotate(int[][] matrix, int n) {
        inplaceTranspose(matrix, n, n);
        for (int i = 0; i < n; i++){
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        // Input for the matrix elements
        System.out.println("Enter " + r * c + " elements: ");

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print user input matrix
        System.out.println("User input matrix:");
        printMatrix(matrix);

        rotate(matrix, r);

        System.out.println("Rotation of matrix: ");
        printMatrix(matrix);

    }
    
}
