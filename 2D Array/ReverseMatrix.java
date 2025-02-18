import java.util.Scanner;

public class ReverseMatrix {
    
    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to reverse each row of the matrix
    static void reverse(int[][] arr, int r, int c) {
        int temp;
        for(int i = 0; i < r; i++) {  
            int s = 0;
            int e = c - 1;
            // Swap elements from start and end until they meet
            while(s <= e) {
                temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
                s++;
                e--;
            }
        }
        System.out.println("Reversed matrix:");
        printMatrix(arr); // Correct method call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows and columns of 1st matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Input for the matrix elements
        System.out.println("Enter " + r * c + " elements:");
        int[][] arr = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Reverse the rows of the matrix
        reverse(arr, r, c);
        sc.close(); // Closing the scanner
    }
}
