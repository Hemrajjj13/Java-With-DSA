// https://leetcode.com/problems/build-array-from-permutation/description/

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] res = buildArray(nums);
        String result = Arrays.toString(res);
        System.out.println(result);
    }   
    
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    
}
