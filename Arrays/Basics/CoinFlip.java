import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        int heads = 0, tails = 0;

        for (int i = 1; i <= 1000; i++) {
            double a = Math.random();  // 0.0 ≤ a < 1.0
            if (a < 0.5) {             // 50% chance for heads
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Heads: " + heads + "  Tails: " + tails);
    }
}
