import java.util.*;
/*
Input a year and find whether it is a leap year or not.
*/
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year % 3 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
