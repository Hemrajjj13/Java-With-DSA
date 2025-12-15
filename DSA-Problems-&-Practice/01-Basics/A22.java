import java.util.*;
/*
Area Of Parallelogram
*/
public class A22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        double area = base * height;
        System.out.println("Area Of Parallelogram: " + area);

        sc.close();
    }
}
