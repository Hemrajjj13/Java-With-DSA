import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 67, 34, 3546, 53, 46);
        multiple(5, 34, true, "Hemraj", "Digvijay", "Nischay", "Yash", "Aditya");
    }

    static void multiple(int a, int b, boolean c, String ...v) {

    }

    static void fun (int  ...v) {
        System.out.println(Arrays.toString(v));
    }
}
// variable length arguments
// length is not constant it varies towards the input you providing