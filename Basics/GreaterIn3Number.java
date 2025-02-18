import java.util.Scanner;
public class GreaterIn3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        sc.close();
        greaterIn3NumberChecker(a, b, c);
    }
    // public static void greaterIn3NumberChecker(int a, int b, int c) {
    //     if (a > b && a > c) {
    //         System.out.println("The greatest number is: " + a);
    //     } else if (b > a && b > c) {
    //         System.out.println("The greatest number is: " + b);
    //     } else {
    //         System.out.println("The greatest number is: " + c);
    //     }
    // }

    public static void greaterIn3NumberChecker(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("The greatest number is A: " + a);
            } else {
                System.out.println("The greatest number is C: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("The greatest number is B: " + b);
            } else {
                System.out.println("The greatest number is C: " + c);
            }
        }
    }
}
