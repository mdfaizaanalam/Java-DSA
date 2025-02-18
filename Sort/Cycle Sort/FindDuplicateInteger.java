
// https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicateInteger {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int[] nums1 = {3, 1, 3, 4, 2};
        int[] nums2 = {3, 3, 3, 3, 3};
        int[] nums3 = {1, 1};

        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicate(nums1));
        System.out.println(findDuplicate(nums2));
        System.out.println(findDuplicate(nums3));
    }

    // public int findDuplicate(int[] nums) {
    //     int i = 0;
    //     while (i < nums.length) {
    //         if (nums[i] != i + 1) {
    //             int correctIndex = nums[i] - 1;
    //             if (nums[i] != nums[correctIndex]) {
    //                 swap(nums, i, correctIndex);
    //             } else {
    //                 return nums[i];
    //             }
    //         } else {
    //             i++;
    //         }
    //     }
    //     return -1;
    // }
  

    public static int findDuplicate(int[] nums) { // 1 1
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return nums[index];
            }
        }
        return 0;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
