package ArrayList;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
    //wrapper classes
        // Integer i = Integer.valueOf(10);
        // System.out.println(i);
        // Float f = Float.valueOf(4.5f);
        // System.out.println(f);

    //array list
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<>();
        ArrayList<Character> l4 = new ArrayList<>();


    // add new elements
        l1.add(5); // 5
        l1.add(10); // 5, 10
        l1.add(15); // 5, 10, 15
        l1.add(20); // 5, 10, 15, 20
        l1.add(25); // 5, 10, 15, 20, 25
        System.out.println(l1);

    // get an element at index i
        System.out.println(l1.get(1));
        System.out.println(l1.get(4));

    // print with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

    //printing the array list directly
        System.out.println(l1);

    //adding element at some index i [5, 100, 10, 15, 20, 25]
        l1.add(1, 100);
        System.out.println(l1);
        
    //modifying element at some index i [5, 50, 10, 15, 20, 25]
        l1.set(1, 50); 
        System.out.println(l1);

    //removing an element at some index i [5, 15, 20, 25]
        l1.remove(1);
        System.out.println(l1);

    //modifying an element e [5, 20, 25]
        l1.remove(Integer.valueOf(10));
        System.out.println(l1);

    //checking if an element is exist or not
        boolean ans = l1.contains(Integer.valueOf(15));
        System.out.println(ans);
        // boolean ans = l1.contains(Integer.valueOf(30));
        // System.out.println(ans);
        
    // If we dont specify wrapper class, we can put anything inside l
        ArrayList l = new ArrayList();
        l.add("hello");
        l.add(1);
        l.add("true");
        System.out.println(l);
    }
}
