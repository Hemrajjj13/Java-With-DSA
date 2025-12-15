import java.util.Arrays;
import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Hemraj";
        char target = 'a';
        // System.out.println(search(name, target));
        System.out.println(search2(name, target));

    }

    static boolean search2(String str,char target) {
        if (str.length() == 0) {
            return false;
        }
        
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }


    static boolean search(String str,char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
