import java.util.*; 

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        sc.close();

        // for (int i = 1; i <= r; i++) {
        //     // for printing spaces
        //     for (int j = 1; j <= r-i; j++) {
        //         System.out.print(" ");
        //     }
        //     // for printing stars
        //     for (int k = 1; k <= (2*i-1); k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        printPyramidPattern(r);

    }

        public static void printPyramidPattern(int r){
            for (int i = 1; i <= r; i++) {
                // for printing spaces
                for (int j = 1; j <= r-i; j++) {
                    System.out.print(" ");
                }
                // for printing 1 to i
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                // for printing i to 1
                for (int n = i-1; n >= 1; n--) {
                    System.out.print(n);
                }
                System.out.println();
            }
        }
}
