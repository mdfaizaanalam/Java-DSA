import java.util.*;
public class UpperLowerCase {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char ch  = sc.next().trim().charAt(0);

    if (ch >= 'a' && ch <= 'z') {
        System.out.println("Lowercase");
    } else if (ch >= 'A' && ch <= 'z') {
        System.out.println("Uppercase");
    } else {
        System.out.println("Invalid");
    }
}
}
