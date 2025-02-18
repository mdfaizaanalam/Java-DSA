import java.util.Scanner;
public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first side: ");
        int a = sc.nextInt();
        System.out.print("Enter the length of second side: ");
        int b = sc.nextInt();
        System.out.print("Enter the length of third side: ");
        int c = sc.nextInt();

        triangleChecker(a, b, c);
        sc.close();
    }

    public static void triangleChecker(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("The sides form a triangle");
        } else {
            System.out.println("The sides do not form a triangle");
        }
    
}
}