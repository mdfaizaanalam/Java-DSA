// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

import java.util.Scanner;

public class Spiral {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {   
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] printSpiralOrder(int n) {
        int[][] matrix = new int[n][n];
    
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int currentElement = 1;

        while (currentElement <= n * n) {
            
            // top row --> leftCol to rightCol
            for (int j = leftCol; j <= rightCol; j++) {
                matrix[topRow][j] = currentElement;
                currentElement++;
            }
            topRow++;

            // rightCol --> topRow to bottomRow
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = currentElement;
                currentElement++;
            }
            rightCol--;

            // bottomRow --> rightCol to leftCol
            for (int j = rightCol; j >= leftCol; j--) {
                matrix[bottomRow][j] = currentElement;
                currentElement++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i = bottomRow; i >= topRow; i--) {
                matrix[i][leftCol] = currentElement;
                currentElement++;
            }
            leftCol++;
        }

        return matrix;

    }
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    int[][] matrix = printSpiralOrder(n);
    printMatrix(matrix);
    sc.close();
}
}

