public class EuclideanAlgorithm {

    // Method to compute GCD / HCF
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Method to compute LCM
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }

    // Main method for testing
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        System.out.println("GCD (HCF) = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));
    }
}
