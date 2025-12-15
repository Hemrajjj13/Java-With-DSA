import java.util.Scanner;

public class CalculateSum {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+ b);
    }
    public static void main(String[] args) {
        // swap = value exchange
        int a = 5;
        int b = 10;
        System.out.println("a = "+a);
        System.out.println("b = "+ b);
        System.out.println("Values after swap");
        swap(a, b);//call by value
    }
}

