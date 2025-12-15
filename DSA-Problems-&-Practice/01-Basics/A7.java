import java.util.*;
/*
Take 2 numbers as inputs and find their HCF and LCM.
*/

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        int lcf = (x * y) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcf);
    }
}
