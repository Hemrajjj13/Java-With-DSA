import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number: ");
        int x = sc.nextInt();
        decToBin(x);
    }

    public static void decToBin (int myNum) {
        int decNum = myNum;
        int pow = 0;
        int binNum = 0;
        int rem = 0;

        while (decNum > 0) {
            rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            decNum = decNum / 2;
            
        }
        System.out.println("Binary number of "+ myNum +" = "+ binNum);
    }
}
