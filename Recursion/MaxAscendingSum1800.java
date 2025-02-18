
// https://leetcode.com/problems/maximum-ascending-subarray-sum/description

public class MaxAscendingSum1800 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 5, 10, 50};
        int[] nums1 = {12,17,15,13,10,11,12};
        int[] nums2 = {10,20,30,40,50};
        int[] nums3 = {100,10,1};

        System.out.println(maxAscendingSum1(nums));
        System.out.println(maxAscendingSum1(nums1));
        System.out.println(maxAscendingSum1(nums2));
        System.out.println(maxAscendingSum1(nums3));

        System.out.println(maxAscendingSum2(nums));
        System.out.println(maxAscendingSum2(nums1));
        System.out.println(maxAscendingSum2(nums2));
        System.out.println(maxAscendingSum2(nums3));

    }

    public static int maxAscendingSum1(int[] nums) {
        int maxSum = nums[0], currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i]; // Extend the ascending subarray
            } else {
                maxSum = Math.max(maxSum, currentSum); // Update maxSum
                currentSum = nums[i]; // Reset currentSum
            }
        }
        return Math.max(maxSum, currentSum); // Final check
    }

    public static int maxAscendingSum2(int[] nums) {
        int max = nums[0];
        int prev = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prev < nums[i]) {
                sum = sum + nums[i];
                prev = nums[i];
            } else {
                max = Math.max(max, sum);
                sum = nums[i];
                prev = nums[i];
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}
