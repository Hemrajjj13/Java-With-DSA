import java.util.*;
/*
Area Of Circle Java Program
*/
public class A18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        int radius = sc.nextInt();
        double pi = 3.14;

        double area = pi * (radius * radius);
        System.out.println("Area of a Circle: " + area);

    }
}
