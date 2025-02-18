import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TupleSameProduct1726 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 6 };
        int[] nums1 = { 1, 2, 4, 5, 10 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = {20,10,6,24,15,5,4,30};

        // System.out.println(bruteForceMethod(nums));
        // System.out.println(bruteForceMethod(nums1));
        // System.out.println(bruteForceMethod(nums2));
        // System.out.println(bruteForceMethod(nums3));


        System.out.println(optimizedMethod(nums));
        System.out.println(optimizedMethod(nums1));
        System.out.println(optimizedMethod(nums2));
        System.out.println(optimizedMethod(nums3));
    }

    public static int optimizedMethod(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;

        // Step 1: Compute product frequencies
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // Step 2: Count tuples
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (productCount.containsKey(product)) {
                    count += productCount.get(product);
                }
            }
        }
        return count;
        
    }

    public static int bruteForceMethod(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int product = nums[i] * nums[j];
                for (int k = i + 1; k < j; k++) {
                    for (int l = k + 1; l < j; l++) {
                        if (nums[k] * nums[l] == product) {
                            count = count + 8;
                        }
                    }
                }
            }
        }
        return count;
    }
}
