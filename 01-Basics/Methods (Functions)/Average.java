import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three values");
        System.out.println("Enter X: ");
        int x = sc.nextInt();
        System.out.println("Enter Y: ");
        int y = sc.nextInt();
        System.out.println("Enter Z: ");
        int z = sc.nextInt();
        System.out.println(Avg(x, y, z));
    }
    public static int Avg(int a, int b, int c) {
        float avg = (a + b + c)/3;
        // System.out.println((int)avg); 
        return (int)avg;
    }
}
