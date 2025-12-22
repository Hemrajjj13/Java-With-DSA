// https://leetcode.com/problems/maximum-subarray/description/

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

import java.util.*;
public class TwoDimKadane {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1};

        System.out.println(maxSubArr(nums));
    }
    static int maxSubArr(int[] nums) {
        int max_sum = nums[0];
        int curr_sum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            curr_sum = Math.max(nums[i], curr_sum + nums[i]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}

