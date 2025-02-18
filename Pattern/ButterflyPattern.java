public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        butterflyPattern(n);
        butterflyPattern2(n);

        // for (int i = 1; i <= 4; i++) {
        //     // Quad = 1
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     // Spaces
        //     int spaces = 2 * (4 - i);
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print("  ");
        //     }
        //     // Quad = 2
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 4; i >= 1; i--) {
        //     // Quad = 3
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     // Spaces
        //     int spaces = 2 * (4 - i);
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print("  ");
        //     }
        //     // Quad = 4
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }

    public static void butterflyPattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            // Left Side Stars
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            // Corrected Middle Spaces Loop
            int spaces = 2 * (n - col);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  "); // Print 2 spaces to align with stars
            }
            // Right Side Stars
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
