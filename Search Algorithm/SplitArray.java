// https://leetcode.com/problems/split-array-largest-sum/


public class SplitArray {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8}; // Input array
        int k = 2; // Number of subarrays required

        int ans = splitArray(nums, k);
        System.out.println(ans);
    }

    // Function to find the minimum largest sum among k subarrays
    public static int splitArray(int[] nums, int k) {
        int start = 0; // Minimum possible largest sum (max single element in the array)
        int end = 0;   // Maximum possible largest sum (sum of all elements in the array)

        // Calculate initial start and end values
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // Start is the largest single element
            end += nums[i];                  // End is the total sum of all elements
        }

        int ans = 0; // Variable to store the final result
        while (start <= end) {
            int mid = start + (end - start) / 2; // Midpoint of start and end

            // Check the number of subarrays required with max sum as mid
            int n = noOfSubArraysWithMaximumSumAsMid(nums, k, mid);

            if (n > k) { 
                // If more subarrays are needed than allowed, increase the max sum
                start = mid + 1;
            } else { 
                // Otherwise, reduce the max sum and update the result
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    // Function to count the number of subarrays with the max sum <= mid
    public static int noOfSubArraysWithMaximumSumAsMid(int[] nums, int k, int mid) {
        int count = 1; // Start with one subarray
        int sum = 0;   // Current sum of the subarray

        for (int i = 0; i < nums.length; i++) {
            // If adding nums[i] exceeds mid, start a new subarray
            if (sum + nums[i] > mid) {
                count++; // Increment the subarray count
                sum = nums[i]; // Start the new subarray with nums[i]
            } else {
                sum += nums[i]; // Add nums[i] to the current subarray
            }
        }
        return count; // Return the total number of subarrays needed
    }
}
