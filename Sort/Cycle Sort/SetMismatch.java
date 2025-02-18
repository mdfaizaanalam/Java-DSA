import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] nums1 = {1, 1};

        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(findErrorNums(nums1)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 }; // {Duplicate, Missing}
            }
        }
        return new int[] { 0, 0 };
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
