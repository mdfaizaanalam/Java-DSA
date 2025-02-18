import java.util.*;
class Alzebra {
    int add (int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Alzebra obj = new Alzebra();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.print("Enter a number: ");
        int y = sc.nextInt();
        sc.close();

        System.out.print("Sum of two numbers is: ");
        int sum = obj.add(x, y); // obj.add(x, y)
        sc.close();
        System.out.print(sum);
    }
}