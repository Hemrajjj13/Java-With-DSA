public class SubArrays {
    public static void subArr(int numbers[]) {
        int ts = 0;
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total Subarrays : " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArr(numbers);
    }
}