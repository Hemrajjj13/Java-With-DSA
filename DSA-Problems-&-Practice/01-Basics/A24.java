import java.util.Scanner;
/*
Area Of Equilateral Triangle
*/
public class A24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        int side = sc.nextInt();

        double area = (Math.sqrt(3)/4) * (side * side);
        System.out.println("Area Of Equilateral Triangle: " + area);

        sc.close();
    }
}
