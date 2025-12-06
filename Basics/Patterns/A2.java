import java.util.*;
/*
n = 5
* 
* *
* * *
* * * *
* * * * *
*/
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
