//Q- Print the sum of first n natural numbers.

import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();

    }
}
