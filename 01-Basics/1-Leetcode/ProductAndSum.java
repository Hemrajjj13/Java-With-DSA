// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

public class ProductAndSum {
    public static void main (String[] args){
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int rem;
        while(n > 0){
            rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
        }
        int Result = product - sum;
        return Result;
    }
}