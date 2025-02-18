public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        diamondPattern3(n);
    }

    public static void diamondPattern(int n) {
        // Outer Loop
        for (int i = 1; i <= 4; i++) {
            // spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamondPattern2(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;

            // Spaces
            int totalSpaces = n - col;
            for (int s = 1; s <= totalSpaces; s++) { // Fixed loop condition
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * col - 1; j++) { // Corrected loop for stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamondPattern3(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            // Spaces
            int noOfSpaces = n - totalColsInRow;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Ensures each row prints on a new line
        }
    }
}
