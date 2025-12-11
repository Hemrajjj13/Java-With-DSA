import java.util.*;
/*
n = 5
1
01
101
0101
10101
*/
public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int start = 1;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) start = 1;
            else start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            
            System.out.println();
        }
    }
}
