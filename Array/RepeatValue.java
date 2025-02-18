import java.util.Scanner;

public class RepeatValue {

    int repeatValueChecker(int[] arr, int search) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Search repeat value in array: ");
        int search = sc.nextInt();

        RepeatValue obj = new RepeatValue();
        int result = obj.repeatValueChecker(arr, search); // Get the count of occurrences

        System.out.println("The number " + search + " occurs " + result + " times in the array.");
    }

}
