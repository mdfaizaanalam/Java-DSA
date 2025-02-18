import java.util.Scanner;
public class PointLiesOnXOrY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        sc.close();
        pointLiesOnXOrY(x, y);  
    }

    public static void pointLiesOnXOrY(int x, int y) {
       if (x == 0 && y == 0) {
           System.out.println("The point lies at the origin");
       } else if (x == 0 ) {
           System.out.println("The point lies on y-axis");
       } else if (y == 0) {
           System.out.println("The point lies on x-axis");
       } else if (x > 0 && y > 0) {
           System.out.println("The point lies in 1st quadrant");
       } else if (x < 0 && y > 0) {
           System.out.println("The point lies in 2nd quadrant");
       } else if (x < 0 && y < 0) {
           System.out.println("The point lies in 3rd quadrant");
       } else if (x > 0 && y < 0) {
           System.out.println("The point lies in 4th quadrant");
       }
    }
}
