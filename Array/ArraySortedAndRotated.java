// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class ArraySortedAndRotated {
    public static void main(String[] args) {
        // int[] nums = {4, 5, 6, 7, 0, 1, 2};
        // int[] nums = {3, 4, 5, 1, 2};
        int[] nums = {2, 1, 3, 4};

        boolean ans = checkArraySortedAndRotated(nums);
        System.out.println(ans);
    }

    public static boolean checkArraySortedAndRotated(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        if (count > 1) {
            return false;
        } else {
            return true;
        }
    }
}
