
import java.util.Scanner;

public class Query {

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005]; 

        for (int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of query: ");
        int q = sc.nextInt();

        while ( q > 0){
            System.out.print("Enter the number to be search; ");
            int x = sc.nextInt();
            if (freq[x] > 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
    }
}
