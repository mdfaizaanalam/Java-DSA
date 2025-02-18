import java.util.Scanner;

public class LastRepeatedNumber {

    // Finding the last repeated number
    static int lastRepeatedNumber(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {  // Start from the end of the array
            for (int j = i - 1; j >= 0; j--) {  // Compare with previous elements
                if (arr[i] == arr[j]) {
                    return arr[i];  // Return the last repeated number found
                }
            }
        }
        return -1;  // Return -1 if no repeated number is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // int result = lastRepeatedNumber(arr);
        // if (result != -1) {
        //     System.out.println("Last Repeated Number: " + result);
        // } else {
        //     System.out.println("No repeated number found.");
        // }

        System.out.println("Last Repeated Number: " + lastRepeatedNumber(arr));
    }
}
