import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 4, 5, 6, 7, 8, 9, 10, 45, 31};
        System.out.println(MaxItem(arr));
    }

    static int MaxItem(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
