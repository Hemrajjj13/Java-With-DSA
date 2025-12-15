public class Main {
    public static void main(String[] args) {
        int[] array = {-12, -2, -1, 1, 2, 4, 5, 8, 87, 99, 205};
        int target = -2;

        int ans = binarySearch(array, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (array[mid] == target) {
                return mid;           
            }
            else if (array[mid] > target) {
                end = mid - 1;
            }
            else if (array[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
