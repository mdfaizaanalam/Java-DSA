public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String str1 = "";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
