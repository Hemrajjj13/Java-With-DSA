import java.util.Scanner;

public class IsPalindrome {
    public static void IsPalindrome(int n) {
        int myNum = n;
        int rem = 0;
        int reversed = 0;
        while (n > 0) {
            rem = n % 10;
            reversed = (reversed * 10) + rem;
            n = n / 10;
        }  
        if (myNum == reversed) {
            System.out.println(myNum + " NUmber is Palindrome");
        }
        else {
            System.out.println(myNum + " Number is not Palindrome");
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        IsPalindrome(num);
    }
}
