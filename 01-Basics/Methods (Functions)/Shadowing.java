public class Shadowing {
    static int x = 4; // this will be shadowed at line 5
    public static void main(String[] args) {
        int x = 44;
        System.out.println(x);//44
        fun();
    }
    static void fun() {
        System.out.println(x);//4
    }
}
// shadowing is practice of using two variables with same name within the scope that overlaps