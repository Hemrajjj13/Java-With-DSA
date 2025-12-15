//https://leetcode.com/problems/find-in-mountain-array/description/
//1095

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int target = 6;
        FindInMountain obj = new FindInMountain();
        int ans = obj.search(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half 
        return OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in descending part of an array 
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid ;
            }
            else {
                start = mid + 1;
            }
        }

        // in the end, start == end and pointing to the largest number because of the 2checks above
        // start and end are always trying to find max elemnet in above 2 checks 
        // hence, when they are pointing to just one element, that is the max one because that is what checks say 
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time 
        // aand if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer 

         return start;
    }
    
    static int OrderAgnosticBS (int[] arr, int target, int start, int end) {
      

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
