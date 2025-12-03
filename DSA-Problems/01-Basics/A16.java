import java.util.*;
/*
To find out whether the given String is Palindrome or not.
*/
public class A16 {
    public static void main(String[] args) {
        String str = "AAA";
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome == true) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }
    }
}
