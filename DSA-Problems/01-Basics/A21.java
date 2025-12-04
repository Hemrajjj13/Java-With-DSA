import java.util.*;
/*
Area Of Isosceles Triangle
*/
public class A21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        double area = 0.5 * base * height;
        System.out.println("Area Of Isosceles Triangle: " + area);

        sc.close();
    }
}
