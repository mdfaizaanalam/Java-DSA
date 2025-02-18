public class HalfInvertedPyramid {
    public static void main(String[] args) {
        int n = 5;
        // Ist method Outer Loop
        for (int i = n; i >= 1; i--) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

// ---------------------------------------------------------

        // 2nd method Outter Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
