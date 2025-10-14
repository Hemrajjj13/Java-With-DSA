import java.util.Scanner;

public class SumOfDigits {
    public static void DigitsSum(int num) {
        int myNum = num;
        int sum = 0;
        while (myNum > 0) {
            sum = sum + (myNum % 10);
            myNum = myNum / 10;
        }
        System.out.println("Sum of digits:" + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        DigitsSum(num);
    }
}
