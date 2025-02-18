
// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal

public class StringAreAlmostEqual {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2)); // true

        String s3 = "attack";
        String s4 = "defend";
        System.out.println(areAlmostEqual(s3, s4)); // false

        String s5 = "kelb";
        String s6 = "kelb";
        System.out.println(areAlmostEqual(s5, s6)); // true
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true; // Already equal, no swap needed
        }

        int firstIndex = -1, secondIndex = -1;
        int mismatchCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatchCount++;

                if (mismatchCount > 2) {
                    return false; // More than 2 mismatches → swap not possible
                }

                if (firstIndex == -1) {
                    firstIndex = i; // Store the first mismatch index
                } else {
                    secondIndex = i; // Store the second mismatch index
                }
            }
        }

        // We must have exactly 2 mismatches, and swapping them should make the strings equal
        return (mismatchCount == 2 && 
                s1.charAt(firstIndex) == s2.charAt(secondIndex) && 
                s1.charAt(secondIndex) == s2.charAt(firstIndex));
    }
}
