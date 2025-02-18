import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        float p = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.print("Enter time: ");
        float t = sc.nextFloat();

        System.out.println("Principle: " + p);
        System.out.println("Rate: " + r);
        System.out.println("Time: " + t);

        // Calculate simple interest
        float si = calculateSimpleInterest(p, r, t);
        System.out.println("Simple Interest: " + si);

        sc.close();
    }

    public static float calculateSimpleInterest(float p, float r, float t) {
        return (p * r * t) / 100;
    }
}
