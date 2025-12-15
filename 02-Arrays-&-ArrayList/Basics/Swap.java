import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 5, 1};
        Swaping(arr);
    }
    public static void Swaping(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[5];
        arr[5] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
