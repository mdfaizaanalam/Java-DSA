public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        RotatedSortedArray obj = new RotatedSortedArray();
        int result = obj.search(nums, target);
        System.out.println(result);
    }
    public int search(int[] nums, int target) {
        int pivot = pivotNumber(nums);

        // If no pivot is found, array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If the target is the pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // Search in the left sorted portion
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Search in the right sorted portion
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int pivotNumber(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Decide whether to move left or right
            if (nums[mid] >= nums[start]) {
                start = mid + 1; // Pivot lies in the right half
            } else {
                end = mid - 1; // Pivot lies in the left half
            }
        }
        return -1;
    }

    public int pivotNumberDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if(nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot i
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // left side is sorted, so pivot must be in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1; // Pivot lies in the right half
            } else {
                end = mid - 1; // Pivot lies in the left half
            }
        }
        return -1;
    }
}
