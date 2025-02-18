public class FindUniqueXOR {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int uniqueDigit = 0;

        for (int num : arr) {
            uniqueDigit = uniqueDigit ^ num;
        }
        return uniqueDigit;
    }
}
