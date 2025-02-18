import java.util.Scanner;

public class RemainderCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number (a)
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        // Prompt the user to enter the second number (b)
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();
        sc.close();

        // Check if a is greater than b
        if (a <= b) {
            System.out.println("The first number (a) should be greater than the second number (b).");
        } else {
            // Calculate the remainder when a is divided by b
            int remainder = calculateRemainder(a, b);

            // Print the result
            System.out.println("Remainder when " + a + " is divided by " + b + " is: " + remainder);
        }
    }

    // Method to calculate the remainder
    public static int calculateRemainder(int a, int b) {
        return a % b;
    }
}
