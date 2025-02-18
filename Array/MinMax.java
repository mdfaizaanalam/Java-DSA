import java.util.Scanner;

public class MinMax {

    // Function to find the min and max numbers in an array
    public static int[] minMaxNumbers(int[] numbers) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
        int min = Integer.MAX_VALUE; // Initialize min to the largest possible integer

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if a smaller number is found
            }
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger number is found
            }
        }

        return new int[]{min, max}; // Return both min and max as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size]; // Create an array of the given size 

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt(); // Store input elements in the array
        }

        // Call the method and store the returned min and max values
        int[] minMax = minMaxNumbers(numbers);
        int min = minMax[0];
        int max = minMax[1];

        // Output the results
        System.out.println("Smallest number is: " + min);
        System.out.println("Largest number is: " + max);
    }
}
