// Leetcode - 1095. Find in Mountain Array

public class MountainArray {

    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        int peak = findPeakIndex(mountainArr);
        System.out.println("Peak Index: " + peak);

        int ans = findInMountainArray(target, mountainArr);
        System.out.println("Target Index: " + ans);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakIndex(mountainArr);
        int firstTry = agnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return agnosticBS(mountainArr, target, peak + 1, mountainArr.length - 1);

    }

    public static int findPeakIndex(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    public static int agnosticBS(int[] mountainArr, int target, int start, int end) {
        boolean isAscending;
        if (mountainArr[start] < mountainArr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == mountainArr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}