import java.util.*;

public class SuffixSum {

    static int[] suffixArraySum(int[] arr) {
        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            arr[i] += arr[i + 1];
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

        int[] pref = suffixArraySum(arr);

        System.out.println("Suffix Array Sum: ");
        for (int i = 0; i < n; i++) {
            System.out.print(pref[i] + " ");
        }

    }
}
