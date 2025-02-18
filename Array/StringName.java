import java.util.Scanner;

public class StringName {

    public static void stringName(String[] name) {
        for (int i = 0; i < name.length; i++) {
            System.out.println("name " + (i + 1) + " is : " + name[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: " );
        int size = sc.nextInt();

        String name[] = new String[size]; // Create an array of the given size

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            name[i] = sc.next(); // Take input from user for array size and store it in the array list
        }
        
        // Call the stringName method to output the names
        stringName(name);
    }
}
