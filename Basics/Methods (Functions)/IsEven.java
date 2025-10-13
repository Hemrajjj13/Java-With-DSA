import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = sc.nextInt();
        isEven(x);
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num +" "+" is Even");
            return true;
        }
        else {
            System.out.println(num + "is Not Even");
            return false;
        }
        
    }
}
