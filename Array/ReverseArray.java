
import java.util.Scanner;

//-----------By Using Extra Array & Space-----------------------
// public class ReverseArray {
//     static int[] reverseArray(int[] arr) {
//         int n = arr.length;
//         int[] reverse = new int[n];
//         int j = 0;
//         for (int i = n - 1; i >= 0; i--) { // this loop is used for reversing the array
//             reverse[j++] = arr[i]; // this line is used for comparing the elements
//         }
//         return reverse;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements: ");
//         for (int i = 0; i < n; i++) { // this loop is used for taking input from user
//             arr[i] = sc.nextInt();
//         }
//         int[] reverse = reverseArray(arr); // this line is used for calling the reverseArray method
//         System.out.println("Reversed array: ");
//         for (int i = 0; i < n; i++){ // this loop is used for printing the reversed array
//             System.out.print(reverse[i] + " ");
//         }
//     }
// }
// // ------------------By using swap method or without extra array----------------------------
// public class ReverseArray {
//     static void reverseArray(int[] arr) {
//         int i = 0;
//         int j = arr.length - 1;
//         while (i < j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         reverseArray(arr);
//         System.out.println("Reversed array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// ------------------By using swap method or without extra space----------------------------
public class ReverseArray {

    static void reverseArray(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    // Rotate the array to the right by k steps
    static void rotatePlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Ensure k is within bounds of the array size
        reverseArray(arr, 0, n - k - 1); // Reverse the first part
        reverseArray(arr, n - k, n - 1); // Reverse the second part
        reverseArray(arr, 0, n - 1);     // Reverse the whole array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotation steps: ");
        int k = sc.nextInt();

        rotatePlace(arr, k);

        System.out.println("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
