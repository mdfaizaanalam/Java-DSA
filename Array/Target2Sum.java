
import java.util.*;

class Target2Sum {

    public int twoSum(int[] nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        Target2Sum obj = new Target2Sum();
        int result = obj.twoSum(arr, target);

        System.out.println("Frequency of target: " + result);
        

    

    }
}
