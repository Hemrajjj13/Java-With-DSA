import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 13, 2, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int max = maxNum(arr);
        System.out.println("Maximum element of the array :"+ max);
    }
    //Search a element in 2d array
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }return new int[]{-1, -1};
    }

    // to find maximum number from 2d array
    static int maxNum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                if (max <= arr[row][col]) {
                    max = arr[row][col];
                    break;
                }
            }
        }return max;
    }


}
