public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        // patternt4(n);
        pattern31(n);
        
        
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i: i;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {

            // space
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // numbers [5 4 3 2 1]
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // numbers [2 3 4 5]
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            // space
            for (int space = 1; space <= n - c; space++) {
                System.out.print("  ");
            }

            // numbers [5 4 3 2 1]
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // numbers [2 3 4 5]
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    // Square pattern with number
    public static void pattern32(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    public static void pattern31(int n) {
        int size = 2 * n - 1;  // To form a square matrix (odd number of rows and columns)
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Find the minimum distance from the edge (top, bottom, left, right)
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(size - row - 1, size - col - 1));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    


}
