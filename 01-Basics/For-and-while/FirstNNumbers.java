import java.util.Scanner;

public class FirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            
            // System.out.println(sum);
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        
    }
}
