import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double pi = 3.14159265359;

        double area = areaOfCircle(r, pi);    
        System.out.println("The area of the circle is: " + area);
        sc.close();
    }

    public static double areaOfCircle(double r, double pi) {
        return pi * r * r;
    }
    
}
