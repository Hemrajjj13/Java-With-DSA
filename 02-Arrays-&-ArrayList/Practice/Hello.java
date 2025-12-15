import java.util.Arrays;
public class Hello {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] reversed = new int[image.length][];

        for (int row = 0; row < image.length; row++) {

            int n = image[row].length;
            reversed[row] = new int[n];

            int left = 0;
            int right = n - 1;
            while (left <= right) {
                reversed[row][left] = image[row][right] ^ 1;
                reversed[row][right] = image[row][left] ^ 1;

                left++;
                right--;
            }

        }
        return reversed;
        
    }
}
