import java.util.*;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int n = sc.nextInt();
        int ans = 0;

        reverseDigits(n, ans);
        sc.close();
    }   

    public static void reverseDigits(int n, int ans) {
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;  // n = n / 10
        }
        System.out.println("Reversed number: " + ans); // Print the final reversed number
    }  
}
// Loop Iteration: The loop continues to extract digits from n and append them to ans until all digits have been processed.
//Lets Example

// For n = 123, & ans = 0, there's how the loop progresses:

// while (n > 0) {
//     ans = ans * 10 + n % 10;
//     n /= 10;  // n = n / 10
// }

// First Iteration: n = 123, ans = 0
// ans = 0 * 10 + 123 % 10; = 0 + 3 (Remainder) = 3
// n = 123 / 10 = 12 (Quotient)


// Second Iteration: n = 12, ans = 3
// ans = 3 * 10 + 12 % 10 = 30 + 2 = 32 
// n = 12 / 10 = 1 (Quotient)


// Third Iteration: n = 1, ans = 32 
// ans = 32 * 10 + 1 % 10 = 320 + 1 = 321 
// n = 1 / 10 = 0 (Quotient)

//NOTE: n % 10 extracts the last digit of n. For example, 123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1.
// n / 10 extracts the remaining digits of n. For example, 123 / 10 = 12, 12 / 10 = 1, 1 / 10 = 0.

