import java.util.*;
/*
Area Of Triangle
*/
public class A19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base & height of  Triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        double area = 0.5 * (base * height);
        System.out.println("Area Of Triangle: " + area);
    }
}
