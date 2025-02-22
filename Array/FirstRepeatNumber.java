import java.util.Scanner;
public class FirstRepeatNumber {

    static int firstRepeatedNumber(int[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size]; // Array Decleration

        System.out.println("Enter the element of array: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First Repeated Number: " + firstRepeatedNumber(arr));
    }
}
