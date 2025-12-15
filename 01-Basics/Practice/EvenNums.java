import java.util.Scanner;

public class EvenNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        EvenNums(n);
        int num = 0;
        int count = 0;
        while (count < n) {
            num = num + 2;
            System.out.print(num + " ");
            count++;
        }
    }
    public static void EvenNums(int n) {
        int num = 0;
        int count = 0;
        while (count < n) {
            num = num + 2;
            System.out.print(num + " ");
            count++;
        }
    }
}
