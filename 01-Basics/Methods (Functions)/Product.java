import java.util.Scanner;

public class Product {
    public static void Multiply(int a, double b){
        double product = 0;
        product = a * b;
        product = (int)product;
        System.out.println(product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        double b = sc.nextDouble();
        // int c = 0;
        int c = (int)b;
        Multiply(a, c);
    }
}
