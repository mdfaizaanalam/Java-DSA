public class Array1D {

    void arrayDemo() {
        int[] age = new int[3]; // 1D Array Decleration
        // int[] age = { 10, 20, 30 }; // 1D Array Literal
        
        float[] weight = new float[3];
        // String[] name = new String[3];
        String[] name = { "Tony", "Steve", "Bruce" }; // 1D Array Literal


        age[0] = 10;
        age[1] = 20;
        age[2] = 30;

        weight[0] = 10.5f;
        weight[1] = 20.5f;
        weight[2] = 30.5f;

        // name[0] = "Tony";
        // name[1] = "Steve";
        // name[2] = "Bruce";

        for (int i = 0; i < 3; i++) {
            System.out.println("Age is: " + age[i] + ", " + "weight is: " + weight[i] + ", " + "Name is: " + name[i]);
        }

        // System.out.println("Age is: " + age[0] + ", " + "weight is: " + weight[0] + ", " + "Name is: " + name[0]);
        // System.out.println("Age is: " + age[1] + ", " + "weight is: " + weight[1] + ", " + "Name is: " + name[1]);
        // System.out.println("Age is: " + age[2] + ", " + "weight is: " + weight[2] + ", " + "Name is: " + name[2]);
       

        //For checking array length

        System.out.println("Array length is: " + age.length);
        System.out.println("Array length is: " + weight.length);
        System.out.println("Array length is: " + name.length);
    }

    public static void main(String[] args) {
        Array1D obj = new Array1D(); //making an oblect of class ArrayDemo name
        obj.arrayDemo(); //Object call
    }
}
