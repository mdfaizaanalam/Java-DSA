import java.util.*;

public class ExceptMultipleOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
