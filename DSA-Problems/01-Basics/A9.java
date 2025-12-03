import java.util.*;;
/*
Write a program to print whether a number is even or odd, also take input from the user.
*/
public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = sc.nextInt();
        

        if (num1 % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is Odd");
        }

    }
}
