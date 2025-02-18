
import java.util.*;

public class UniqueNumber {

    public int uniqueNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }

        int unique = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > 0) {
                unique = arr[k];
            }
        }
        return unique;
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

        UniqueNumber obj = new UniqueNumber();
        // int result = obj.uniqueNumber(arr);

        // System.out.println("Unique number is: " + result);

        System.out.println("Unique number is: " + obj.uniqueNumber(arr));
    }

}
