
// https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};  // 3
        int[] nums2 = {3,4,-1,1};  // 2 
        int[] nums3 = {7,8,9,11,12};  // 1
        int[] nums4 = {0,1,2,3}; // 

        System.out.println(firstMissingPositive(nums));
        System.out.println(firstMissingPositive(nums2));
        System.out.println(firstMissingPositive(nums3));
        System.out.println(firstMissingPositive(nums4));

    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        // Step 1: Cyclic sort
        while (i < nums.length) {
            int correctIndexNumber = nums[i] - 1; // here n start from 1 so index = value - 1
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndexNumber]) {
                swap(nums, i, correctIndexNumber);
            } else {
                i++;
            }
        }

        // Step 2: Find the first missing positive
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1; // If all numbers are in their correct positions
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
