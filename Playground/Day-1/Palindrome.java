import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a Number: ");
        int num = sc.nextInt();

        boolean result;
        result = isPalindrome(num);
        System.out.println("Number is Palindrome: " + result);

        result = isPrime(num);
        System.out.println("Number is Prime: " + result);
    }

    public static boolean isPalindrome(int num){
        int ogNum = num;
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            newNum = newNum * 10 + rem;
            num /= 10;
        }
        if (ogNum == newNum) {
            return true;
        }
        else return false;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for(int i = 2; i*i <= num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
