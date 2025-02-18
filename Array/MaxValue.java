import java.util.*;

public class MaxValue {
    int maxValueChecker(int[] max){

        int ans = 0; 
        for (int i = 0; i < max.length; i++){
            if (max[i] > ans){
                ans = max[i];
            }
        }
        System.out.println("Maximum value in array is: " + ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        sc.close();

        int[] max = new int[size]; // Array Decleration

        System.out.println("Enter the element of array: ");
        for (int i = 0; i < size; i++){
            max[i] = sc.nextInt();
        }

        MaxValue obj = new MaxValue();

        obj.maxValueChecker(max);
    }
}
