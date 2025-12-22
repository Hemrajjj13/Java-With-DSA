// https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] res = runningSum(nums);
        String result = Arrays.toString(res);
        System.out.println(result);
    }

    static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
