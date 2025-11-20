// https://leetcode.com/problems/count-items-matching-a-rule/
import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {
        // Creating the list of items
        List<List<String>> items = new ArrayList<>();

        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");

        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");

        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println(result);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);

            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                count++;
            }
            else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                count++;
            }
            else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
