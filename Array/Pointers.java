
import java.util.*;
// // ------------------------by using ectra array
// public class Pointers {

//     static void sort(int[] arr) {
//         // Count the number of zeros
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 0) {
//                 count++;
//             }
//         }
//         // Set the first 'count' elements to 0
//         for (int i = 0; i < count; i++) {
//             arr[i] = 0;
//         }
//         // Set the remaining elements to 1
//         for (int i = count; i < arr.length; i++) {
//             arr[i] = 1;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter the elements of the array (only 0s and 1s): ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sort(arr);
//         System.out.println("Sorted array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }
//---------------------------by using pointers or no extra array
public class Pointers {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            } 
            if (arr[right] == 1) {    
                right--;
        }
    }
}   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array (only 0s and 1s): ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
