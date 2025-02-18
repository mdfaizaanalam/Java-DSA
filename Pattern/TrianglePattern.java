import java.util.*;
public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int r = sc.nextInt();

// Forward Direction
        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }


// Backward Direction
        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= (r+1-i); j++) {  
        //         System.out.print(" * ");            
        // }
        // System.out.println();
        // }
        


        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r+1-i); j++) {  
                System.out.print(j);            
        }
        System.out.println();
        }


        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= i; j++) {  
        //         System.out.print(j);            
        // }
        // System.out.println();
        // }
    }
    }
