import java.util.*;
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // int a = 0;
        // int b = 1;

        // System.out.print("Fibonacci Series: ");
        // for (int i = 1; i <= n; i++) {
        //     System.out.print(a + " ");
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }
        // sc.close();


         // Edge case: if n <= 0, no output
         if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("Fibonacci sequence: 0");
        } else {
            // Start generating Fibonacci sequence
            int a = 0; // First term
            int b = 1; // Second term
            System.out.print("Fibonacci sequence: " + a + " " + b + " ");

            int count = 2; // Start from the 3rd term
            while (count <= n) {
                int temp = b;
                b = b + a;
                a = temp;
                System.out.print(b + " ");
                count++;
            }
        }
        sc.close();
    }
}
