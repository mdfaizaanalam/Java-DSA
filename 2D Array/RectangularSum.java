// Given a matrix 'a' of dimension n x m and 2 coordinates (11, r1) and (12, r2). Return the sum of the rectangle from (11,r1) to (12, r2).

import java.util.*;

// -----------------------------Merhod 1---Brute force method-------------------------
// public class RectangularSum {
//     static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int rectangularSum(int[][] matrix, int l1, int r1, int l2, int r2) {
//         int sum = 0;
//         for (int i = l1; i <= l2 ; i++) {
//             for (int j = r1; j <= r2; j++) {
//                 sum += matrix[i][j];
//             }
//         }
//         return sum;
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

//         System.out.println("Enter the elements of the matrix: ");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.print("Enter the coordinates l1, r1, l2, r2: ");
//         int l1 = sc.nextInt();
//         int r1 = sc.nextInt();
//         int l2 = sc.nextInt();
//         int r2 = sc.nextInt();

//         System.out.println("Sum of the rectangle: " + rectangularSum(matrix, l1, r1, l2, r2));
//     }
// }





//---------Method 2----------------------
// Method 2: Pre-Calculating the horizontal sum for each row in the Matrix