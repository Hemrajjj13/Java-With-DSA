import java.util.*;
/*
Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
*/
public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String input = sc.next();

            if (input.equals("x")) {
                break;
            }

            sum += Integer.parseInt(input);
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
