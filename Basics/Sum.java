import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.close();

        int sum = sumOfNumber(a, b);

        System.out.println("Sum of two numbers is: " + sum);
        }

    public static int sumOfNumber(int a, int b) {
        return a + b;
    }
}
