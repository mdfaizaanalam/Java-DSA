import java.util.Scanner;

public class StrictlyGreaterThan {

    int strictlyGreaterThanChecker(int[] arr, int search) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > search) {
                count++;
            }
        }
        return count;
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

        System.out.print("Search repeat value in array: ");
        int search = sc.nextInt();

        StrictlyGreaterThan obj = new StrictlyGreaterThan();
        int result = obj.strictlyGreaterThanChecker(arr, search); // Get the count of occurrences

        System.out.println("Number of elements strictly greater than " + search + " is: " + result);
    }

}
