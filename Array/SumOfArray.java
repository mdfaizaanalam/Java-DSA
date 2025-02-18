import java.util.*;

public class SumOfArray {
    int sumOfArray(int[] arr){
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();   
        }

        SumOfArray obj = new SumOfArray();

        int sum = obj.sumOfArray(arr);
        System.out.println("Sum of the array is: " + sum);
        sc.close();

}
}