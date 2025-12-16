// https://leetcode.com/problems/richest-customer-wealth/description/
import java.util.*;

public class RichestCust {
    public static void main(String[] args) {
        int[][] accounts1 = {
            {1, 2, 3},
            {3, 2, 1}
        };
        int accounts2[][] = {{1,5}, {7,3}, {3,5}};
        int ans = maxWealth(accounts1);
        System.out.println(ans);
        System.out.println(maxWealth(accounts2));
    }    

    static int maxWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int max = 0;
            for (int j = 0; j <accounts[i].length; j++) {
                 max += accounts[i][j];
            }
            if (maxWealth < max) {
                maxWealth = max;
            }
        }
        return maxWealth;
    }
}
