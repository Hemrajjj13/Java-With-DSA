import java.util.*;
/*
Area Of Rectangle Program
*/
public class A20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int lenght = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        double area = lenght * width;
        System.out.println("Area Of Rectangle: " + area);
    }
}
