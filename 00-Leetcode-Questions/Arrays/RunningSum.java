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
        int rSum = 0;
        int sum[] = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            sum[i] = rSum;
        }
        return sum;
    }
}
