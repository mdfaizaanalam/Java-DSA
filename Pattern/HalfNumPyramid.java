// Question-5  print a inverted half pyramid pattern

public class HalfNumPyramid {
    public static void main(String[] args) {

        int n = 4;
        // Outter Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
