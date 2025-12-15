import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rupees to convert in USD($)");
        double rs = in.nextDouble();
        double usd = rs * 0.011315;
        System.out.println(usd);
    }
}

