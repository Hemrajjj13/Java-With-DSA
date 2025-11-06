public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 199};
        int target = 50;

        System.out.println(ceiling(arr, target));
    }

    // return the index of smallest number greater then target 
    static int ceiling(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        // if target element is > than largest number
        if (array[end] < target) {
            return -1;
        }
        

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
        return start;
    }
}
