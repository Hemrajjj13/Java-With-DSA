package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        kidsWithCandies(candies, extraCandies);
        
    }

    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        } 
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}

