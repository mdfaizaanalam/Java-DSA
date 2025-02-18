//Given an integer array 'a' sorted in non-decreasingorder, return an array of the squares of each number sorted in non-decreasing order.

import java.util.*;

//---------------------WITH SWAP and REVERSE Method-----------------

// public abstract class SquareSort {

//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void reverseArray(int[] arr) {
//         int i = 0;
//         int j = arr.length - 1;
//         while (i < j) {
//             swap (arr, i, j);
//             i++;
//             j--;
//         }
//     }

//     static int[] sortSquare(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];
//         int left = 0;
//         int right = n - 1;
//         int k = n;
//         while (left <= right) {
//             if (Math.abs(arr[left]) > Math.abs(arr[right])) {
//                 ans[k++] = arr[left] * arr[left];
//                 left++;
//             } else {
//                 ans[k++] = arr[right] * arr[right];
//                 right--;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] ans = sortSquare(arr);

//         reverseArray(ans);

//         System.out.println("Sorted squares: ");
//         for (int i = 0; i < ans.length; i++) {
//             System.out.print(ans[i] + " ");
//         }
//         sc.close();
//     }

// }










// ---------------------WITHOUT SWAP and REVERSE Method-----------------

public abstract class SquareSort {

    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int k = n - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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

        int[] ans = sortSquare(arr);

        System.out.println("Sorted squares: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }

}

