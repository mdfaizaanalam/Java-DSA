import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Sample array to be sorted
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array :" + Arrays.toString(arr));
    }

    // Method to perform the selection sort on the given array
    public static void selectionSort(int[] arr) {
        // Loop through the entire array except the last element
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the smallest element in the unsorted portion of the array
            int smallest = getSmallestIndex(arr, i, arr.length - 1);
            
            // Swap the found smallest element with the element at index i
            swap(arr, i, smallest);
        }
    }

    // Method to find the index of the smallest element in the unsorted portion of the array
    public static int getSmallestIndex(int[] arr, int start, int end) {
        // Assume the first element in the unsorted part is the smallest
        int smallest = start;
        
        // Loop through the unsorted portion of the array
        for (int i = start + 1; i <= end; i++) {
            // If a smaller element is found, update the index of the smallest element
            if (arr[smallest] > arr[i]) {
                smallest = i;
            }
        }
        // Return the index of the smallest element
        return smallest;
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
