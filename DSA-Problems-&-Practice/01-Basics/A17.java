import java.util.*;
/*
To find Armstrong Number between two given number.
*/
public class A17 {
    public static void main(String[] args) {
        int start = 1;
        int end = 500;

        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;

            // count digits
            int digits = String.valueOf(num).length();

            // calculate Armstrong sum
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            // check
            if (sum == original) {
                System.out.println(original);
            }
        }
    }
    
}
