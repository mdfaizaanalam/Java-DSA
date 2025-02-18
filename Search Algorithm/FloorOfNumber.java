public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // Sorted array
        int target = 13; // Target value for which we need to find the floor
        int ans = floorOfNumber(arr, target); // Call the floor function
        System.out.println(ans); // Print the result
    }

    public static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // If the target is greater than the largest element in the array, there's no floor
        if (target > arr[arr.length - 1]) {
            System.out.println("Target is greater than the largest element in the array");
            return -1; // Return -1 indicating no floor exists
        }

        // Binary search loop to find the floor value
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index to avoid overflow
            
            if (target == arr[mid]) { 
                // If the target matches the mid element, return its value
                return arr[mid];
            } else if (target < arr[mid]) {
                // If the target is less than mid, ignore the right part
                end = mid - 1;
            } else {
                // If the target is greater than mid, ignore the left part
                start = mid + 1;
            }
        }

        // After the loop, 'end' points to the largest element smaller than or equal to the target
        return arr[end];
    }
}
