
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1,2};

        System.out.println(findDuplicates(nums1));
        System.out.println(findDuplicates(nums2));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        // Step 1: Use cyclic sort to place numbers in their correct positions
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex); // Swap to put nums[i] in the correct place
            } else {
                i++;
            }
        }

        // Step 2: Identify numbers that are in incorrect positions (duplicates)
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]); // nums[index] is a duplicate
            }
        }

        return ans;
    }

    // Helper function to swap elements in the array
    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
