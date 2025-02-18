// Given an integer array ‘a', return the prefix sum/running sum in the same array without creating a new array.

// //------------------------------by using extra arry----------------------
// import java.util.*;
// public class PrefixSum {

//     static int[] prefixArraySum(int[] arr) {
//         int n = arr.length;
//         int[] pref = new int[n]; 

//         pref[0] = arr[0];

//         for (int i = 1; i < n; i++){
//             pref[i] = pref[i - 1] + arr[i];
//         }
//         return pref;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the elements of array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] pref = prefixArraySum(arr);

//         System.out.println("Prefix Array Sum: ");
//         for (int i = 0; i < n; i++){
//             System.out.print(pref[i] + " ");
//         }

//     }
    
// }










//--------------------by using without any extra array or space--------------------------

import java.util.*;
public class PrefixSum {

    static int[] prefixArraySum(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pref = prefixArraySum(arr);

        System.out.println("Prefix Array Sum: ");
        for (int i = 0; i < n; i++){
            System.out.print(pref[i] + " ");
        }

    }
    
}
