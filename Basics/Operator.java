public class Operator {
    public static void main(String[] args) {
        int p = 10;
        int q;

        q = p;
        System.out.println(q);

        p += q; // p = p + q; p= 10 + 10;
        System.out.println(p);

        p -= q; // p = p - q; p = 20 - 10;
        System.out.println(p);

        p *= q; // p = p * q; p = 10 * 10;
        System.out.println(p);
        
        p /= q; // p = p / q; p = 100 / 10;
        System.out.println(p);
    }
}
