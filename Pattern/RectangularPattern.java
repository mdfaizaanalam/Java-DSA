import java.util.*;
public class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the Row Value: ");
        int r = sc.nextInt();

        System.out.print("Enter the Column Value: ");
        int c = sc.nextInt();

        sc.close();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
    }
}
