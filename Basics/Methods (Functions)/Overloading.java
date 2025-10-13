public class Overloading {
    public static void main(String[] args) {
        fun(10);
        fun("Hemraj");
    }
    static void fun(int a) {
        System.out.println("First One");
        System.out.println(a);
    }
    static void fun(String a) {
        System.out.println("Second One");
        System.out.println(a);
    }
}
