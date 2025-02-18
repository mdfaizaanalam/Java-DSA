import java.util.*;

public class ARaineToPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        int a = sc.nextInt();

        System.out.print("Enter the b value: ");
        int b = sc.nextInt();

        int ans = 1;

        for (int i = 1; i <= b; i++) {
            ans *= a; //ans = ans * a
        }
        System.out.println("Value of A raise to power B: " + ans);
        sc.close();

    }
    
}
