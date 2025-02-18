// Question-1  print a hollow butterfly pattern

public class HollowButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        hollowButterflyPattern(n);

        // // Upper Half Outter Loop
        // for (int i = 1; i <= n; i++) {
        //     // Inner Loop
        //     // for printing star
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }

        //     // for spaces
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // for printing star
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // // Lower Half Outter Loop
        // for (int i = n; i >= 1; i--) {
        //     // Inner Loop
        //     // for printing star
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }

        //     // for spaces
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // for printing star
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }

    public static void hollowButterflyPattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;

            // Left hollow pattern
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == 2 * n - 1 || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Spaces
            int spaces = 2 * (n - col);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Right hollow pattern
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == 2 * n - 1 || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
