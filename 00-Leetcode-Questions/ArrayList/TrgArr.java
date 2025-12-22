// package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TrgArr {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        createTargetArray(nums, index);

    }
     public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = target.get(i);
        }
        System.out.println(Arrays.toString(result));

        return result;
     }
}
