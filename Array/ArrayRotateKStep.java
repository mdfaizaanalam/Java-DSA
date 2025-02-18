import java.util.Scanner;

public class ArrayRotateKStep {
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
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

        System.out.print("Enter the number of rotation steps: ");
        int k = sc.nextInt();

        int[] result = rotate(arr, k);

        System.out.println("Rotated array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
}
