import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int x = sc.nextInt();
        if (x >= 0) {
            System.out.println("Number is Positive");
        }
        else {
            System.out.println("number is negative");
        }

        double temp = 99.5;
        if (temp >= 100) {
            System.out.println("You have fever");
        }
        else {
            System.out.println("You don't have fever");
        }
    }
}
