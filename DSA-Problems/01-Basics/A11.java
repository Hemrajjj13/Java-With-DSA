import java.util.*;
/*
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
*/
public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int P = sc.nextInt();
        System.out.print("Enter Time(in years): ");
        int T = sc.nextInt();
        System.out.print("Enter Rate of interest (per year): ");
        int R = sc.nextInt();

        int SI = (P * R * T) / 100;
        System.out.println("Simple Interest: " + SI);

    }
}
