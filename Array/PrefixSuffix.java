// Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.

import java.util.*;

public class PrefixSuffix {

    // Method to find the total sum of the array
    Method to check if there exists a point where prefix sum equals suffix sum
    static boolean equalSumFunction(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            int suffixSum = totalSum - prefSum;
            // Check if prefix sum equals suffix sum
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition possible: " + equalSumFunction(arr));
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }    
        return totalSum;
    }

    // 