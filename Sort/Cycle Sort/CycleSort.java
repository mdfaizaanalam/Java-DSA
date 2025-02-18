
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] arr1 = {2, 1, 5, 4, 6, 8, 7, 3};
        cycleSort(arr);
        cycleSort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    public static void cycleSort(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int correctIndex = arr[start] - 1; // because njmber start from 1 to n
            if (arr[start] != arr[correctIndex]) {
                swap(arr, start, correctIndex);
            } else {
                start++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
