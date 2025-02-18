
public class Array2D {
    void array2D() {
        // int[][] arr = new int[3][3]; // 2D array declaration and initialization
        int[][] arr = { { 11, 22, 43 }, { 44, 56, 61 }, { 75, 68, 49 } }; // Array literals for a 2D array

        // // Initializing 2D array
        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[0][2] = 3;
        // arr[1][0] = 4;
        // arr[1][1] = 5;
        // arr[1][2] = 6;
        // arr[2][0] = 7;
        // arr[2][1] = 8;
        // arr[2][2] = 9;

        // Printing 2D array
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
        // System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
        // System.out.println(arr[2][0] + " " + arr[2][1] + " " + arr[2][2]);
        
    }

    public static void main(String[] args) {
        Array2D obj = new Array2D();
        obj.array2D();
    }
}
