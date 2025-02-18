public class HalfNumTriangle {
    public static void main(String[] args) {
        int n = 5;
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

        // ---------------------------------------------------------

        // Question-5 Half Pyramid (Inverted 180-degree)
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner Loop star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}