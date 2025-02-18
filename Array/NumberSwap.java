import java.util.Scanner;

public class NumberSwap {

    //Swap 2 numbers
    static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + " and b = " + b);
        
// ------------------METHOD 1------------------
        // int temp = a;
        // a = b;
        // b = temp;

// ------------------METHOD 2------------------        
        a = a + b; // let a = 2, b = 5, then a = 7
        b = a - b; // let a = 7, b = 5, then b = 2
        a = a - b; // let a = 7, b = 2, then a = 5
        System.out.println("After swap: a = " + a + " and b = " + b);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        swap(a, b);
    }
}
