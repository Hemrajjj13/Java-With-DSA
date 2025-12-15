import java.util.*;
/*
Area Of Rhombus
*/
public class A23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diagonal 1: ");
        int d1 = sc.nextInt();
        System.out.print("Enter diagonal 2: ");
        int d2 = sc.nextInt();

        double area = 0.5 * d1 * d2;
        System.out.println("Area Of Rhombus: " + area);

        sc.close();
    }
}
