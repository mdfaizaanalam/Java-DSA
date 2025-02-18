// Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from 1 to r (both included). 0
// Note: The values of 1 and r in queries follow 1-based indexing.

import java.util.*;
public class PrefixSumQuery {

    static int[] prefixSumQuery(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter the elements of array: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefSum = prefixSumQuery(arr);

        System.out.print("Enter the query: ");
        int q = sc.nextInt();

       while (q-- > 0){
        System.out.print("Enter range to be search: ");
        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans = prefSum[r] - prefSum[l - 1];

        System.out.println("Sum: " + ans);
       }
    }
}
