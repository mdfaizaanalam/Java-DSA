import java.util.Scanner;

public class Sort {

    // Function to check if the array is sorted in ascending order
    public static boolean isSortedAscending(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false; // The array is not sorted in ascending order
            }
        }
        return true; // The array is sorted in ascending order
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size]; // Create an array of the given size

        System.out.println("Enter the elements of the array: ");
        // Input the array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check if the array is sorted in ascending order
        if (isSortedAscending(numbers)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        sc.close(); // Close the scanner
    }
}
