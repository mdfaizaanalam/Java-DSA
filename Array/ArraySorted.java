
import java.util.Scanner;

public class ArraySorted {

    // Function to check if array is sorted
    public static boolean isSorted(int[] arr) {
        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] sort = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = sc.nextInt();
        }

        
        if (isSorted(sort)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
