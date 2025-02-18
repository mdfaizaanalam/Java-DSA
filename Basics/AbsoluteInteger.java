import java.util.*;
public class AbsoluteInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        absoluteIntegerValue(num);
        sc.close();
    }

    public static void absoluteIntegerValue(int num) {
        if (num < 0) { // n is less than 0, or n is -ve.
            num = num * (-1);
            System.out.println(num);
        } else {
            System.out.println(num);
        }
    } 
}
