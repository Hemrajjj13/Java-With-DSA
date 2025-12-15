import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 4, 5, 6, 7, 8, 9, 10, 45, 31};
        System.out.println(MaxItem(arr));
        System.out.println(MaxItemInRange(arr, 2, 8));

        int[] revArr = ReverseArray(arr);
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }

    static int MaxItem(int[] arr) {
        if (end > start) {
            return -1;
        }
        if (arr.length == 0 || arr == null) {
            return -1;
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int MaxItemInRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] ReverseArray(int[] arr) {
        if (end > start) {
            return -1;
        }
        if (arr.length == 0 || arr == null) {
            return -1;
        }

        int start = 0, end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
