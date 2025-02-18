public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // Sorted array
        int target = 15; // Target value for which we need to find the ceiling
        int ans = ceilingOfNumber(arr, target);
        System.out.println(ans); // Print the result
    }

    public static int ceilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // If the target is greater than the largest element in the array, there's no ceiling
        if (target > arr[arr.length - 1]) {
            System.out.println("Target is greater than the largest element in the array");
            return -1; // Return -1 indicating no ceiling exists
        }

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index to avoid overflow

            if (target == arr[mid]) { // If target matches an array element, return it
                return arr[mid];
            } else if (target < arr[mid]) { // If target is less than mid, search the left half
                end = mid - 1;
            } else { // If target is greater than mid, search the right half
                start = mid + 1;
            }
        }

        // At the end of the loop, 'start' points to the smallest element greater than or equal to the target
        return arr[start];
    }
}
