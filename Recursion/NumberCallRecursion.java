public class NumberCallRecursion {
    public static void main(String[] args) {
        number(1); // Start the recursion from 1
    }

    public static void number(int n) {  
        // Base case: Stop when n reaches 5
        if (n == 5) {
            System.out.println(5); // Print 5 and end recursion
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call: Move to the next number
        number(n + 1);
    }
}
