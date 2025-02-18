
// https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int[] nums1 = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,8};
        int[] nums4 = {1, 2, 0};  // 3

        System.out.println(missingNumber(nums)); // 8
        System.out.println(missingNumber(nums1)); // 2
        System.out.println(missingNumber(nums2)); // 2
        System.out.println(missingNumber(nums3)); // 1
        System.out.println(missingNumber(nums4)); // 

    }

    public static int missingNumber(int[] nums) {
        int i = 0;

        // Step - 1 Cyclic Sort
        while (i < nums.length) {
            int correctIndex = nums[i]; // here n start from 0 so index = value
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Step - 2 Find Missing Number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) { // here nums[index] is the number
                return index; // here index is the missing number
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
