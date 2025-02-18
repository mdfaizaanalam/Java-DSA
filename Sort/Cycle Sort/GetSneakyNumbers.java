
// https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSneakyNumbers {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0};
        int[] nums1 = {0,3,2,1,3,2};
        int[] nums2 = {7,1,5,4,3,4,6,0,9,5,8,2};

        int[] ans = getSneakyNumbers(nums);
        int[] ans1 = getSneakyNumbers(nums1);
        int[] ans2 = getSneakyNumbers(nums2);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i]; // here number start from 0 to n
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                ans.add(nums[index]);
            }
        }
        return new int[] {ans.get(0), ans.get(1)};
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
