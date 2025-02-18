// // For finding 3 element whose addition is equal to target value.
// import java.util.*;

// public class Target3Sum {

//     public int[] threeSum(int[] arr, int target) {
//         // int ans = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     if (arr[i] + arr[j] + arr[k] == target) {
//                         // ans++;
//                         return new int[] {arr[i], arr[j], arr[k]};
//                     }
//                 }
//             }
//         }
//         // return ans;
//         return null;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size]; // Array Decleration

//         System.out.println("Enter the elements: ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target: ");
//         int target = sc.nextInt();

//         Target3Sum obj = new Target3Sum();
//         int[] result = obj.threeSum(arr, target);

//         // System.out.println("Frequency of target: " + result);
//         // sc.close();

//         if (result == null) {
//             System.out.println("Target not found.");
//         } else {
//             System.out.println("Target found: " + Arrays.toString(result));
//         }
//     }
// }





// ----------------------------------------------------------------------------------------------------------

// For finding the how many pairs in the array sum up to the given target value?

import java.util.*;

public class Target3Sum {
    public int threeSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size]; // Array Decleration

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        Target3Sum obj = new Target3Sum();
        int result = obj.threeSum(arr, target);

        System.out.println("Frequency of target: " + result);
        sc.close();
    }
}
