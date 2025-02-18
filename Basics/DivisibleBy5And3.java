import java.util.*;
public class DivisibleBy5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        divisibleBy5And3(n);
        sc.close();
    }
    public static void divisibleBy5And3(int n) {
        if  (n % 5 == 0 && n % 3 == 0) {
            System.out.println(n + " is divisible by 5 and 3");
        } else {
            System.out.println(n + " is not divisible by 5 and 3");
        }   
    }
}
