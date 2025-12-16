import java.util.*;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int count = findNumbers(nums);
        System.out.println(count);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) { // even function call
                count++;
            }
        }
        return count;
    }
    // function to check wheather a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    // to find the count of digits
    static int digits(int num) {
        if ( num < 0) {
            num = num * -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}


// approach 2
// public int findNumbers(int[] nums) {
//     int count = 0;

//     for (int i = 0; i < nums.length; i++) {
//         int evencount=0;

//         while (nums[i] > 0) {
//             nums[i] = nums[i] / 10;
//             evencount++;
//         }
//         if(evencount % 2 == 0) {
//             count++;
//         }
//     }
//     return count;
// }