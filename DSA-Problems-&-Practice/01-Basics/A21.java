import java.util.*;
/*
Area Of Isosceles Triangle
*/
public class A21 {
    public static void main(String[] args) {
        int b = 5;
        int height = 20;

        double area = 0.5 * b * height;
        System.out.println("Area Of Isosceles Triangle: " + area);

        // If using equal sides a and base b (no height given):
        int a = 5;
        double area1 = (b / 4.0) * Math.sqrt(4 * (a*a) - (b*b));
        System.out.println("Area Of Isosceles Triangle (no height): " + area1);
    }
}
