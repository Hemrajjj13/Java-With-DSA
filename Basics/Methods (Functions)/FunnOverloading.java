public class FunnOverloading {
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 7));
        System.out.println(sum(6, 9, 23));
        System.out.println(sum(45, 3));
        System.out.println(sum(34, 56));
        System.out.println(sum(23, 35));
        System.out.println(sum(3.5f, 4.7f));
    }
    static int sum (int a, int b) {
        return a + b;
    }
    static int sum (int a, int b, int c) {
        return a + b + c;
    }
    static float sum(float a, float b) {
        return a + b;
    }
}
