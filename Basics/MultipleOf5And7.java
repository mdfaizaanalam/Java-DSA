import java.util.*;

public class MultipleOf5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number - ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Multiples of 5 and 7 between 1 and " + n);

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("Multiple of 5 and 7 - " + i);
                break;
            }
        }
    }
}
