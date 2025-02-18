import java.util.*;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        System.out.println("Sum of odd and even numbers: " + ans);
        sc.close();
    }
}
