public class FirstTenNumber {
    public static void main(String[] args) {
        int n = 987654321;

        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10; // n = n / 10

            ans = ans * 10 + rem;
            System.out.println(ans);
        }
        System.out.println("The Final Answer Is:"+ans);
        
    }
}
