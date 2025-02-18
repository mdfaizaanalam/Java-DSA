
public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {  5, 7, 7, 8, 8, 10 };
        int target = 12;

        int[] ans = solution(arr, target);
        System.out.println(ans[0] + ", " + ans[1]);

    }

    public static int[] solution(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = findRange(arr, target, true);
        ans[1] = findRange(arr, target, false);
        return ans;
    }



    public static int findRange(int[] arr, int target, boolean firstIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else { //(arr[mid] == target) 
                ans = mid;
                if (firstIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
