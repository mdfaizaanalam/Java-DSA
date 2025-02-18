import java.util.*;

public class SearchIndex {
    
    // Function to search for the index of a number in an array
    public static int searchNumberIndex(int[] num, int search) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                return i; // Return the index if the number is found
            }
        }
        return -1; // Return -1 if the number is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] num = new int[size]; // Array Declaration

        System.out.println("Enter the elements of the array: ");
        // For taking input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt(); // Take input from user for array size and store it in the array
        }

        System.out.print("Enter the number to be searched: ");
        int search = sc.nextInt();

        // Call the function to search for the number and get the index
        int index = searchNumberIndex(num, search);

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}
