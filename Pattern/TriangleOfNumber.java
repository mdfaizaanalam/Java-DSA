public class TriangleOfNumber {
  public static void main(String[] args) {

    /* //Question-2 Print a number pyramid */

    int n = 5;

    // Outter Loop
    for (int i = 1; i <= n; i++) {

      // Inner Loop
      // for space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // for printing star
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
