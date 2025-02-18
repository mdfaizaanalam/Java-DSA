package ArrayList;
import java.util.ArrayList;
import java.util.Collections;


public class ReserseArrayList {
    static void reverseList (ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List " + list);
        reverseList (list);
        System.out.println("Reversed List" + list);
        Collections.sort(list);
        System.out.println("Sorted List in Ascending Order" + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List in Descending Order" + list);


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Java");
        l1.add("World");
        System.out.println("Original List " + l1);
        Collections.sort(l1);
        System.out.println("S9orted List " + l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Reversed List " + l1);
        }
}
