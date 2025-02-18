// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class CountNegativeNumber {
    public static void main(String[] args) {
        // Example grid with both positive and negative numbers
        int[][] grid = {
            {4, 3, 2, -1},   // First row: 4, 3, 2, -1 (last number is negative)
            {3, 2, 1, -1},   // Second row: 3, 2, 1, -1 (last number is negative)
            {1, 1, -1, -2},  // Third row: 1, 1, -1, -2 (last two numbers are negative)
            {-1, -1, -2, -3} // Fourth row: -1, -1, -2, -3 (all numbers are negative)
        };

        // Calling the method and printing the result
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;  // This variable will store the total number of negative numbers

        // Start with the first row and last column
        int firstRow = 0;  // The first row index
        int lastRow = grid.length - 1;  // The last row index (grid.length gives the total number of rows)
        int lastCol = grid[0].length - 1;  // The last column index (grid[0].length gives the total number of columns)
        int firstCol = lastCol;  // Start from the last column in the first row

        // While we are within the bounds of the grid
        while (firstRow <= lastRow && firstCol >= 0) {
            // If the current element is negative
            if (grid[firstRow][firstCol] < 0) {
                // All the elements below the current element in the same column will also be negative
                // So, add all of them to the count
                count += (lastRow - firstRow + 1);  // Add the number of rows from the current row to the last row
                firstCol--;  // Move left to check the next column
            } else {
                // If the current element is non-negative, move down to the next row
                firstRow++;
            }
        }

        // Return the total count of negative numbers
        return count;
    }
}
