// https://leetcode.com/problems/flipping-an-image/description/
import java.util.*;

public class ImgFlipAndReverse {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {1, 1, 1}
        };

        // to print the flip and inverted image
        int[][] result = flipAndInvertImage(image);
        for(int[] row: result) {
            System.err.println(Arrays.toString(row));
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            
            int left = 0;
            int right = image[i].length - 1;
            // rerverse and flip it
            while (left <= right) {
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }
}
