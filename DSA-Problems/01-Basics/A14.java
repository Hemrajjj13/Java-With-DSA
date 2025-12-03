import java.util.*;
/*
Input currency in rupees and output in USD.
*/
public class A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Rupees: ");
        double num = sc.nextDouble();

        double dollars = num * 0.011;
        System.out.println(dollars + "$");
        
    }
}
