public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, -7, 8, 9, 20};
        System.out.println(min(arr));
    }


    // assume arr.length != 0
    // return the minimum value int the array
    static int min(int[] arr) {

        int ans = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];
            }
            
        }
        return ans;
    }
}
