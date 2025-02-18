// // Write a program to display transpose of matrix entered by the user.
import java.util.*;

// public class Transpose {

//     static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int[][] transposeFinder(int[][] matrix, int r, int c) {
//         int[][] transpose = new int[c][r];

//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 transpose[j][i] = matrix[i][j];
//             }
//         }
//         return transpose;
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of rows: ");
//         int r = sc.nextInt();

//         System.out.print("Enter the number of columns: ");
//         int c = sc.nextInt();

//         // Input for the matrix elements
//         System.out.println("Enter " + r * c + " elements: ");

//         int[][] matrix = new int[r][c];

//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Print user input matrix
//         System.out.println("User input matrix:");
//         printMatrix(matrix);

//         // Transpose the matrix
//         System.out.println("Transpose of matrix");
//         int[][] transpose = transposeFinder(matrix, r, c);
//         printMatrix(transpose);
//         sc.close();

//         }
// }











// ---------------------By using inplace method--------------Only for square matrix----------
public class Transpose {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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

        // Transpose the matrix
        System.out.println("Transpose of matrix");
        inplaceTranspose(matrix, r, c);
        printMatrix(matrix);
        sc.close();
    }
}
