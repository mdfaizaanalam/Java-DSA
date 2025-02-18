public class HollowRhombuspttern {
    public static void main(String[] args) {
        int n = 5;
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print star
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
