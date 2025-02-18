import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        int[] arr1 = {1, 2, 3, -4, -5};
        int[] arr2 = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static int swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return temp;
    }
}
