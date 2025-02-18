// write a program to check the given number is prime number or not in java by taking user input

import java.util.*;
public class PrimeOrNot {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number to check whether it is prime or not: ");
        int n = sc.nextInt();
        sc.close();

        boolean isPrime = true;
         if (n <= 1){
            isPrime = false;
         } else {
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    isPrime = false;
                
                }
            }
         }

        if (isPrime){
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

    }
}