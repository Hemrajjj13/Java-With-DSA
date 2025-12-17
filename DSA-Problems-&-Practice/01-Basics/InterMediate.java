import java.util.*;

public class InterMediate {
    public static void main(String[] args) {
        
        int num = 10;
        System.out.println("Factorial of " + num + ": " + factorial(num));
        System.out.printf("Electricity Bill: %.2f $\n", eleBill());
        System.out.println("Average Of N Numbers: " + avgOfNNums(num));
        System.out.println("Discount Of Product: " + discount(200, 20));
        System.out.println("Distance Between Two Points: " + distance(5, 10, 30, 20));

    } 
    
    // Factorial Program In Java
    static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Calculate Electricity Bill
    static double eleBill () {
        int prevMeterReading = 2350;
        int currReading = 2500;
        double tariffRate = 0.15;
        double fixedCharge = 12.0;
        int energyConsumed = currReading - prevMeterReading;
        double energyCost = energyConsumed * tariffRate;
        double subTotal = energyCost + fixedCharge;
        double tax = (subTotal * 0.10);
        double calcBill = subTotal + tax;
        return calcBill;
    }
    // Average Of N Numbers
    static double avgOfNNums(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return (double)total / n;
    }

    // Discount Of Product
    static double discount(int price, int discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
    
    // Distance Between Two Points
    static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
