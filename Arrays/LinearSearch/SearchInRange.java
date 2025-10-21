public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1, 2,  65, 774, 156, 555, 5};
        int target = 555;
        int start = 2;
        int end = 4;
        System.out.println(linearSearch(arr, target, start, end));

    } 

    static int linearSearch(int[] arr, int target,int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }
}
