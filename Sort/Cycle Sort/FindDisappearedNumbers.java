
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums1 = {1, 1};

        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers(nums1));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // Step 1: Cyclic Sort
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // because numbers range from 1 to n
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Step 2: Find Missing Numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
