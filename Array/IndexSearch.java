import java.util.Scanner;

public class IndexSearch {

    int indexSearch(int[] num, int search) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                System.out.println("Element found at index: " + i);
                return i; // Return the index if the number is found
            }
        }
        System.out.println("Element not found.");
        return -1; // Return -1 if the number is not found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] num = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int search = sc.nextInt();

        IndexSearch obj = new IndexSearch();
        obj.indexSearch(num, search);
    }
}
