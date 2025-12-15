import java.util.Scanner;

public class Factorial {

    public static int factorial(int num) {
        int f = 1;
        // Handle negative input first
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
   
        for (int i = 1; i <= num; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        if (result != -1) {
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close();
    }
}
