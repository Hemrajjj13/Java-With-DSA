// https://leetcode.com/problems/count-items-matching-a-rule/description/
import java.util.*;

class MatchingItems {
    
    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue)); 
    }
    
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0 :
                    ruleKey.equals("color") ? 1 : 2;
        int count = 0;
        for (List<String> item: items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}