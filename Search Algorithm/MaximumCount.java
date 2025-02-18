//  https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
public class MaximumCount {

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {-3, -2, -1, 0, 0, 1, 2};
        int[] nums2 = {5, 20, 66, 1314};
        int[] nums3 = {-2, -1, -1, 1, 2, 3};

        // Calculate and print the result for all arrays
        System.out.println(maximumCount(nums1));
        System.out.println(maximumCount(nums2));
        System.out.println(maximumCount(nums3));
       
    }

    public static int maximumCount(int[] nums) {
        int lasrNegativeIndex = findLastNegativeIndex(nums);
        int firstPositiveIndex = findFirstPositiveIndex(nums);

        int negativeCount = lasrNegativeIndex + 1;
        int positiveCount = nums.length - firstPositiveIndex;

        return Math.max(negativeCount, positiveCount);
    }

    public static int findLastNegativeIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                result = mid; // might be possibe it is the last negative index
                start = mid + 1; // search in right subarray whether any another negaive number index is present or not
            } else {
                end = mid - 1; // search in left subarray
            }
        }
        return result;
    }

    public static int findFirstPositiveIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int result = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > 0) {
                result = mid; // might be possibe it is the first positive index
                end = mid - 1; // search in left subarray whether any another positive number index is present or not
            } else {
                start = mid + 1; // search in right subarray
            }
        }
        return result;
    }
}











// class Solution {
//     public int maximumCount(int[] nums) {
//         int positiveIndexStart = binarySearch(nums);

//         int negativeCount = 0;
//         int positiveCount = 0;

//         for (int i = 0; i < positiveIndexStart; i++) {
//             if (nums[i] < 0 ) {
//                 negativeCount++;
//             }
//         }

//         for (int i = positiveIndexStart; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 positiveCount++;
//             }
//         }
//         return Math.max(negativeCount, positiveCount);
//     }

//     public int binarySearch(int[] nums) {
//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (nums[mid] <= 0) { // for checking positive number
//                 start = mid + 1;
//             } else { // for checking negatine numbers
//                 end = mid - 1;
//             }
//         }
//         return start;
//     }
// }