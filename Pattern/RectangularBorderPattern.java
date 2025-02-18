import java.util.*;
public class RectangularBorderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();                    

        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= c; j++) {
        //         if (i == 1 || i == r || j == 1 || j == c) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();


        // for (int i = 0; i <= r; i++) {
        //     for (int j = 0; j <= c; j++) {
        //         if (i == 0 || i == r || j == 0 || j == c)
        //             System.out.print(j);
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 2 == 0 ) {
                    System.out.print(1);
                }    
                else
                    System.out.print(2);
            }
            System.out.println();
        }
            
        }
    }
