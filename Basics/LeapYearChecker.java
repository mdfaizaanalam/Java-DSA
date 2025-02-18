import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        checkLeapYear(year);
        sc.close();
    }

    public static void checkLeapYear(int year) {

        // Check if the year is a leap year
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If the year is divisible by 100, it must also be divisible by 400 to be a leap year
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
