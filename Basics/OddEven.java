import java.util.*;

 public class OddEven {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int x = sc.nextInt();

    checkEvenOrOdd(x);
    sc.close();
    }

    public static void checkEvenOrOdd (int x){
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
