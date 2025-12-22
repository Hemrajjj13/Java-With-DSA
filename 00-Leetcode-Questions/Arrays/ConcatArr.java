// https://leetcode.com/problems/concatenation-of-array/description/ 


public class ConcatArr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 9, 2, 3, 4, 5};
        int n = 7;

        getConcatenation(nums, n);
    }

    public static int[] getConcatenation(int[] nums, int n) {
        int ans[] = new int[nums.length*2];

        for(int i = 0; i < n; i++) {
            ans[i] =  ans[i + n] = nums[i];
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }
        return ans;
    }
}
