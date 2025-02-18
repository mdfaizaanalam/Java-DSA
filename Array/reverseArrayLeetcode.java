
// https://leetcode.com/problems/rotate-array/
public class reverseArrayLeetcode {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // Ensure k is within bounds of the array size
        reverseArray(nums, 0, nums.length - k - 1); // Reverse the first part
        reverseArray(nums, nums.length - k, nums.length - 1); // Reverse the second part
        reverseArray(nums, 0, nums.length - 1); // Reverse the whole array
    }

    public static void reverseArray(int[] nums, int i, int j) {
        while (i < j) {
            // // Swap using addition and subtraction
            // nums[i] = nums[i] + nums[j];
            // nums[j] = nums[i] - nums[j];
            // nums[i] = nums[i] - nums[j];
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
