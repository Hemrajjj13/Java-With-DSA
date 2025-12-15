import java.util.*;
/*
Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
*/
public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (op == '+') {
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            System.out.println(num1 / num2);
        } else if (op == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid Operation !");
        }
    }
}
