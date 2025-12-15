import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        
        pattern22(n);
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
            char ch = (char)('A' + n - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            
            int stars = n - i;
            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            int spaces = i * 2;
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < (n*2-i*2); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < (n*2-i*2); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            
            int stars = n - i;
            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            int spaces = i * 2;
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == 4) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        for (int i = 0; i < 2*n-1; i++){
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int bottom = (2*n -2) - i;

                System.out.print(n - min(min(top, bottom), min(left, right)) + " ");

            }
            System.out.println();
        }
    }

    public static int min(int num1, int num2) {
        if (num1 > num2) return num2;
        else return num1;
    }
}
