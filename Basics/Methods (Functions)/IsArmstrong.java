import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number");
        // int n = sc.nextInt();
        
        // boolean ans = isPrime(n);
        // System.out.println(ans);

        for ( int i = 100; i <= 999; i++) {
            if (isArmsrong(i)) {
                System.out.println(i + "");
            }
        }
    }

    static boolean isArmsrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
        /*
        if (sum == original) {
            return true;
        }
        return false;
         */
    }
 
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        }
        return false;
    }
}
