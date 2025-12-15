public class sumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // last digit
            sum += digit;
            num /= 10; // remove last digit
        }

        System.out.println("Sum of digits = " + sum);


    }
}
