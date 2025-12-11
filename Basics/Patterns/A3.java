import java.util.*;
/*
n = 5
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
*/
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            
            System.out.println();
        }
    }
}
