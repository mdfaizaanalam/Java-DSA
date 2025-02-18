import java.util.Scanner;

//       1
//     2   2
//   3       3
// 4 4 4 4 4 4 4 

public class HollowTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hollow triangle: ");
        int rows = sc.nextInt();
        sc.close();

        printHollowTriangle(rows);
    
    }

    public static void printHollowTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Inner Loop for Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            //Inner Loop for Numbers and Spaces:
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == rows || j == 1 || j == (2 * i - 1)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

    
