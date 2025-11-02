import java.util.*;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many times you want to flip the coin :");
        int x = in.nextInt();
        coinFlip(x);
    }
    public static void coinFlip(int x) {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < x; i++) {
            double b  = Math.random();
            if (b <= 0.5) {
                heads++;
            }
            else {
                tails++;
            }
        }
        System.out.println("Heads count :" + heads);
        System.out.println("Tails count :" + tails);
    }
}
