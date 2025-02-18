import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        areaOfRectangle(length, breadth);
        sc.close();
    }

    public static void areaOfRectangle(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);

        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        if (area > perimeter) {
            System.out.println("Area is greater than perimeter");
        } else if (area < perimeter) {
            System.out.println("Area is less than perimeter");
        } else {
            System.out.println("Area is equal to perimeter");
        }
    }
}
