import java.util.Scanner;

public class LastIndexSearch {

    public static int lastIndexSearch(int[] arr, int search) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] num = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched and find its last index: ");
        int search = sc.nextInt();

        // Call the function to search for the number and get the index
        int lastIndex = lastIndexSearch(num, search);

        // Print the result
        if (lastIndex != -1) {
            System.out.println("The last index of the number " + search + " is: " + lastIndex);
        } else {
            System.out.println("The number " + search + " is not found in the array.");
        }
    }
}
