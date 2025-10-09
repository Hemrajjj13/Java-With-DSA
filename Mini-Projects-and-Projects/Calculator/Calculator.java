import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            //take operator as input 
            System.out.println("Enter the operator(+, -, *, /, %, or x to exit): ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.println("Enter Two Numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();


                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

            }else if (op == 'x' || op == 'X') {
                break;
            }else {
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
            
        }
        
        in.close();
    }
}
