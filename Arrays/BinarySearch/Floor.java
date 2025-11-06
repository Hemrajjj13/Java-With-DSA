public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 199};
        int target = 5;

        System.out.println(floor(arr, target));

    }

    // return the index: greatest number <= targrt
    static int floor(int[] array, int target) {
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
        return end;
    }
}
