import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary_num = sc.nextInt();

        int ans = 0; //converted decimal number
        int power = 1; // 2 ^ 0 = 1 power of 2

        decimalNumber(binary_num, ans, power);
        sc.close();
    }

    public static void decimalNumber(int binary_num, int ans, int power) {

        while (binary_num > 0) {
            int unit_digit = binary_num % 10;
            ans += unit_digit * power; //ans = ans + unit_digit * power
            power *= 2; //power = power * 2
            binary_num /= 10; //binary_num = binary_num / 10
        }
        System.out.println("Decimal number: " + ans);

    }   
}


// Example
// Let's say the user inputs the binary number 1011.

// First Iteration:
// unit_digit = 1011 % 10 = 1
// ans = 0 + 1 * 1 = 1
// power = 1 * 2 = 2
// binary_num = 1011 / 10 = 101

// Second Iteration:
// unit_digit = 101 % 10 = 1
// ans = 1 + 1 * 2 = 3
// power = 2 * 2 = 4
// binary_num = 101 / 10 = 10

// Third Iteration:
// unit_digit = 10 % 10 = 0
// ans = 3 + 0 * 4 = 3
// power = 4 * 2 = 8
// binary_num = 10 / 10 = 1

// Fourth Iteration:
// unit_digit = 1 % 10 = 1
// ans = 3 + 1 * 8 = 11
// power = 8 * 2 = 16
// binary_num = 1 / 10 = 0

// The loop ends because binary_num is now 0.
// Result: The program outputs 11, which is the decimal equivalent of the binary 1011.