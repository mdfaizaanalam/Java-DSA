import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.close();

        numberRelation(a, b);
    }

    public static void numberRelation(int a, int b) {
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is Greater");
        } else {
            System.out.println("A is Lesser");
        }
    }
}
