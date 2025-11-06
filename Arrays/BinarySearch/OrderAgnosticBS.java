public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {100, 99, 98, 77, 45, 37, 12, -1, -31, -55};
        int target = -55;

        int ans = OrderAgnosticBS(array, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS (int[] arr, int target) {
        
        int start = 0;
        int end = arr.length - 1;

        // find wheather the array is ascneding or descending 
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;           
            }
            
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                }
                else  {
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] < target) {
                    end = mid - 1;
                }
                else  {
                    start = mid + 1;
                }
            }
            
            
        }
        return -1;
    }
}
