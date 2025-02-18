public class HollowPattern {
    public static void main(String[] args) {
        // Question-2 Hollow Pattern
        int n = 4;
        int m = 5;
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= 5; j++) {
                // Cell (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
