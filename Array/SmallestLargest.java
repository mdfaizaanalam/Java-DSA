// import java.util.Arrays;
// import java.util.Scanner;

// public class SmallestLargest {

//     // Function to find the smallest and largest numbers in an array
//     public static int[] smallestLargestCheck(int[] numbers) {
//         // Sort the array in ascending order
//         Arrays.sort(numbers);

//         // Find the smallest and largest numbers in the array
//         int[] ans = {numbers[0], numbers[numbers.length - 1]};
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] numbers = new int[size]; // Create an array of the given size

//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt(); // Store input elements in the array
//         }

//         // Call the method and store the returned min and max values
//         int[] ans = smallestLargestCheck(numbers);

//         // Output the results
//         System.out.println("Smallest number is: " + ans[0]);
//         System.out.println("Largest number is: " + ans[1]);
//     }
// }


import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargest {

    // Function to find the k-th smallest and k-th largest numbers in an array
    public static int[] kthSmallestLargest(int[] numbers, int k) {
        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Find the k-th smallest and k-th largest numbers
        int kthSmallest = numbers[k - 1];
        int kthLargest = numbers[numbers.length - k];

        return new int[]{kthSmallest, kthLargest};
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

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        if (k > 0 && k <= size) {
            // Call the method and store the returned k-th smallest and largest values
            int[] ans = kthSmallestLargest(numbers, k);

            // Output the results
            System.out.println("k-th Smallest number is: " + ans[0]);
            System.out.println("k-th Largest number is: " + ans[1]);
        } else {
            System.out.println("Invalid value of k. It should be between 1 and " + size);
        }
    }
}
