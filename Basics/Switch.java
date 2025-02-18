import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the button: ");
        // int Weeks = sc.nextInt();
        int Month = sc.nextInt();
        sc.close();

        /*
         * switch (Weeks) {
         * case 1 : System.out.println("Monday");
         * break;
         * case 2 : System.out.println("Tuesday");
         * break;
         * case 3 : System.out.println("Wrdnesday");
         * break;
         * case 4 : System.out.println("Thursday");
         * break;
         * case 5 : System.out.println("Friday");
         * break;
         * case 6 : System.out.println("Sturday");
         * break;
         * case 7 : System.out.println("Sunday");
         * break;
         * default : System.out.println("Invalid Button");
         * break;
         * 
         * }
         */

        switch (Month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Button");
                break;

        }
    }
}