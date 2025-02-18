import java.util.Scanner;
public class ThreePointsOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first point: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble(); 

        System.out.print("Enter the second point: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter the third point: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        sc.close();
        threePointsOnALineChecker(x1, y1, x2, y2, x3, y3);
    }

    public static void threePointsOnALineChecker(double x1, double y1, double x2, double y2, double x3, double y3) {
        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y3 - y2) / (x3 - x2);
        if (m1 == m2) {
            System.out.println("The three points lies on single line");
        } else {
            System.out.println("The three points does not lies on single line");
        }
    }
    
}
