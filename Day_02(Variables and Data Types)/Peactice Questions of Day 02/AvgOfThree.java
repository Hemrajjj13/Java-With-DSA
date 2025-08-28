import java.util.*;

public class AvgOfThree {
    public static void main(String args[]) {
       
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of a :");
            int a = sc.nextInt();
            System.out.println("Enter value of b :");
            int b = sc.nextInt();
            System.out.println("Enter value of c :");
            int c = sc.nextInt();
            int sum = a + b + c;
            int Avg = sum / 3;
            System.out.println("Average is :"+Avg);
    }
}

