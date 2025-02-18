
import java.util.*;

public class PointInCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x-coordinate of the center of the circle: ");
        double centerx = sc.nextDouble();

        System.out.print("Enter the value of y-coordinate of the center of the circle: ");
        double centery = sc.nextDouble();

        System.out.print("Enter the value of radius of the circle: ");
        double r = sc.nextDouble();

        System.out.print("Enter the value of x-coordinate of the point: ");
        double pointx = sc.nextDouble();

        System.out.print("Enter the value of y-coordinate of the point: ");
        double pointy = sc.nextDouble();

        sc.close();
        pointInCircle(centerx, centery, r, pointx, pointy);
    }

    public static void pointInCircle(double centerx, double centery, double r, double pointx, double pointy) {

        // Calculate the distance between the point and the center of the circle within a square root
        double distance = ((pointx - centerx) * (pointx - centerx) + (pointy - centery) * (pointy - centery));
        double squaredRadius = r * r;  // Square the radius to avoid calculating the square root
        if (distance < squaredRadius) {
            System.out.println("The point is inside the circle");
        } else if (distance == squaredRadius) {
            System.out.println("The point is on the circle");
        } else {
            System.out.println("The point is outside the circle");
        }

        
        // // Calculate the distance between the point and the center of the circle without a square root
        // double distance = Math.sqrt((pointx - centerx) * (pointx - centerx) + (pointy - centery) * (pointy - centery));
        // if (distance < r) {
        //     System.out.println("The point is inside the circle");
        // } else if (distance == r) {
        //     System.out.println("The point is on the circle");
        // } else {
        //     System.out.println("The point is outside the circle");
        // }

    }

}
