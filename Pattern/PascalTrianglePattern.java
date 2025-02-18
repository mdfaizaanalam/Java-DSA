public class PascalTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        // Outter Loop
        for (int i = 0; i < n; i++) {
            // Inner Loop
            int number = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
