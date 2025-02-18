import java.util.*;
public class FibonacciNumber {
    public static int findFibonacci(int n) {
        if (n <= 1) { // base condition which print 0 and 1
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static long fibonacciFormula(int n) {
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // For finding list of fibonacci number till nth term
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciFormula(i) + " ");
        }

        // For finding single nth term
        // System.out.println(findFibonacci(n));
        //System.out.println(fibonacciFormula(n));

        sc.close();
    }
}
