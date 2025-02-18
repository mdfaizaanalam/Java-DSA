//  https://leetcode.com/problems/find-pivot-index/description/
// https://leetcode.com/problems/find-the-middle-index-in-array/description/

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int middleIndex = pivotIndex(nums);
        System.out.println("Middle Index: " + middleIndex);
        
    }
    public static int pivotIndex(int[] nums) {
        // Step 1: Calculate total sum of the array
        int totalSum = findArraySum(nums);
        int prefSum = 0;

        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate suffix sum for current index
            int suffixSum = totalSum - prefSum - nums[i];

            // Check if prefix sum equals suffix sum
            if (prefSum == suffixSum) {
                return i; // Return the leftmost middleIndex
            }

            // Update prefix sum to include current element
            prefSum += nums[i];
        }

        // Step 3: If no middleIndex is found, return -1
        return -1;
    }

   

    // Helper method to calculate the total sum of the array
    public static int findArraySum(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }
        return totalSum;
    }
}

