import java.util.*;
public class Question2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the button: ");
      int button = sc.nextInt();

    //By using If Else Condition
      /*if (button ==1) {
        System.out.println("Hello");
      } else if (button == 2) {
        System.out.println("Namaste");
      } else if (button == 3) {
        System.out.println("Bonjour");
      } else {
        System.out.println("Invalid Button");
      } */
      
//By using Switch 
      switch (button) {
        case 1 : System.out.println("Hello");
        break;
        case 2 : System.out.println("Namaste");
        break;
        case 3 : System.out.println("Bonjour");
        break;
        default : System.out.println("Invalod Button");
        break;
      }

      sc.close();
    }
}
