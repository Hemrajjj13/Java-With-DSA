public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 4, 53, 12, 35, -52, -43, 32, 223};
        int target = 243566432;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        
    }

    // search in the array: return index if item found
    //otherswise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        
        // run a for loop 
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
            
        }
        //this line will be executed when no target element will found
        return -1;
    }
}
