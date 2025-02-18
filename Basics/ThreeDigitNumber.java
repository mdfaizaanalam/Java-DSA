import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        
        threeDigitNumberChecker(num);
        sc.close();
    }
    public static void threeDigitNumberChecker(int num) {
        if (num > 99 && num < 1000) {
            System.out.println(num + " is a three digit number");
        } else {
            System.out.println(num + " is not a three digit number");
        }
    }
    
}
