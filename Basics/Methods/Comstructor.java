class Algebra {
    double a;
    double b;
    Algebra (double x, double y) {
        System.out.println("Hello World");
        a = x;
        b = y;
    }

double add () {
    return a + b;
}

double sub () {
    return a - b;
}

double mul () {
    return a * b;
}

double div () {
    return a / b;
}  
}

public class Comstructor {
    public static void main(String[] args) {
        Algebra obj = new Algebra(10, 15);

        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());


        Algebra obj2 = new Algebra(20, 5);

        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.div());
        
    }   
}
