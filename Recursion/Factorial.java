import java.util.*;

public class Factorial {
    // public static int findFactorial(int n) {
    //     // base case
    //     if (n == 0 || n == 1) return 1;

    //     // smaller problem - recursive case
    //     int subProblem = findFactorial(n - 1);

    //     // larger problem - self work
    //     int ans = n * subProblem;
    //     return ans;
    // }

    public static int findFactorial(int n) {
        // base case
        if (n == 0 || n == 1) return 1;
        return n * findFactorial(n - 1); // Recurrence relation
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for finding the factorial - ");
        int n = sc.nextInt();
        sc.close();

        int result = findFactorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }
}
