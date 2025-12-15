import java.util.*;
/*
n = 5
* * * * *
* * * *
* * *
* *
*
*/
public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
