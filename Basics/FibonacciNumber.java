import java.util.Scanner;

public class FibonacciNumber {

    // Function to print the Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        
        // Print the first term
        System.out.print(a + " ");
        
        // Print the remaining terms if n > 1
        if (n > 1) {
            System.out.print(b + " "); // Print the second term
            
            for (int i = 3; i <= n; i++) {
                int nextTerm = a + b; // Calculate the next term
                System.out.print(nextTerm + " "); // Print the next term
                a = b; // Update a to the previous term
                b = nextTerm; // Update b to the current term
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        // Call the function to print the Fibonacci series
        System.out.print("Fibonacci series: ");
        printFibonacci(n);
        
        sc.close(); // Close the scanner
    }
}
