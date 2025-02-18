public class PalindromePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            // Numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
