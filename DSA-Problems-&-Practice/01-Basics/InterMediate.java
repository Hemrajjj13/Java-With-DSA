import java.util.*;

public class InterMediate {
    public static void main(String[] args) {
        
        int num = 5;
        System.out.println("Factorial of " + num + ": " + factorial(num));
    } 
    
    // Factorial Program In Java
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
}
