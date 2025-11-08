public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = {-12, -2, -1, 1, 2, 4, 5, 8, 87, 99, 205};
        int target = 5;

        System.out.println(ans(array, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1; 
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] array, int target, int start, int end) {
    
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            
            if (target < array[mid]) {
                end = mid - 1;
            }
            else if (target > array[mid]) {
                start = mid + 1;
            }
            else {
                return mid;           
            }
        }
        return -1;
    }
}
