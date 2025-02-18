import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decimal_num = sc.nextInt();

        int ans = 0; //converted binary number
        int power = 1; // 10 ^ 0 = 1 power of 10

        decimalToBinary(decimal_num, ans, power);
        sc.close(); 
    }

    public static void decimalToBinary(int decimal_num, int ans, int power) {
        
        while (decimal_num > 0) {
            int parity = decimal_num % 2;
            ans += parity * power; //ans = ans + parity * power
            power *= 10; //power = power * 10
            decimal_num /= 2; //decimal_num = decimal_num / 2 
        }

        System.out.println("Binary number: " + ans);
    }
    
}
