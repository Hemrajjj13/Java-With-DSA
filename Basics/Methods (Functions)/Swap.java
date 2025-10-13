public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println("Values Before Swap");
        System.out.println("a:" + a + " " +"b:"+ b);
    }
    static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after Swap");
        System.out.println("a:" + a + " " + "b:"+ b );

        // function/method scope 
        // This change only will be valid in this function scope only 
    }
}
