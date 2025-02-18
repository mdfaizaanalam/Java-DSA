// Find position of an element in a sorted array of infinite numbers

public class PositionOfElementInInfiniteNumbers {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 20, 40, 60, 85, 90, 100, 130, 140, 160, 170};
        int target = 160;
        int ans = position(arr, target);
        System.out.println(ans);
    }

    public static int position(int[] arr, int target) {
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }


    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
