import java.util.*;
public class Paaterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        
        pattern18(n);
    }

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
                
            }
            System.out.println();
        }
    } 

    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
                
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char)('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
                                    // 4
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1) / 2;
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print(ch);
                if (j <= breakPoint) ch++; 
                else ch--; 
            }
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char)('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }


    
}
