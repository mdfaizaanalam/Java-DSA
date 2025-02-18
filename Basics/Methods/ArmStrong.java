
public class ArmStrong {

    // Method to check if a number is an Armstrong number
    static boolean isArmstrong(int n) {
        int sum = 0;
        int originalNumber = n; // Preserve the original number

        while (n > 0) {
            int remainder = n % 10; // Get the last digit
            sum += remainder * remainder * remainder; // Add the cube of the digit to sum
            n = n / 10; // Remove the last digit
        }

        return sum == originalNumber; // Compare the sum with the original number
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); // Create a scanner for user input
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt(); // Take input from the user

        // // Call the isArmstrong method and display the result
        // if (isArmstrong(num)) {
        //     System.out.println(num + " is an Armstrong number.");
        // } else {
        //     System.out.println(num + " is not an Armstrong number.");
        // }

        for (int i = 100; i < 999 ; i++) {

            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
            
        }

    }
}
