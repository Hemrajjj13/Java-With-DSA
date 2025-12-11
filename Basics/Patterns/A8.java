import java.util.*;
/*
Enter a Number: 5
    *    
   ***   
  *****  
 ******* 
*********
*/
public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
                                    // 4
            for (int j = n; j > (n - i); j--) {
                System.out.print(" ");
            }
            
            for (int j = 2*n; j > (2 * i + 1); j--) {
                System.out.print("*");
            }

            for (int j = n; j > (n - i); j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
