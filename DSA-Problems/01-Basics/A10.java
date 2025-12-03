/*
Take name as input and print a greeting message for that particular name.
*/

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.next();

        System.out.println("Hello " + name + "!");
    }
}
