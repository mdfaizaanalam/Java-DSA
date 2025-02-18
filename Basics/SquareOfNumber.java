import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        // Call the method to calculate the square
        int squaredNumber = squareOfNumber(number);

        // Print the result
        System.out.println("Square of " + number + " is: " + squaredNumber);
    }

    // Method to calculate the square of a number
    public static int squareOfNumber(int number) {
        return number * number;
    }
}
