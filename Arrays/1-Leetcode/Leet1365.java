// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class Leet1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        
        int[] result = smallerNumbersThanCurrent(nums);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[i] > nums [j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
