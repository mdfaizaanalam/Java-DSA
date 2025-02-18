// https://leetcode.com/problems/valid-mountain-array/description/

public class ValidPeakIndex {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        ValidPeakIndex obj = new ValidPeakIndex();
        boolean result = obj.validMountainArray(arr);
        System.out.println(result); // Output: true
    }

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false; // A valid mountain array must have at least 3 elements
        }

        int peakIndex = findPeak(arr);

        // Peak cannot be the first or last element
        if (peakIndex == 0 || peakIndex == arr.length - 1) {
            return false;
        }

        // Check if elements before the peak are strictly increasing
        for (int i = 0; i < peakIndex; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

        // Check if elements after the peak are strictly decreasing
        for (int i = peakIndex; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    // Binary search to find the peak index
    public int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We are in the decreasing part of the mountain
                end = mid;
            } else {
                // We are in the increasing part of the mountain
                start = mid + 1;
            }
        }

        // Start and end will converge to the peak index
        return start;
    }
}
