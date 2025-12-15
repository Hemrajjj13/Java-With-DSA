public class ArrayBasics {
    public static void main(String[] args) {
        int[] array = {1, 9, 3, 5, 18, 6};
        secondLargest(array);

        reverse(array);
        CountEvenOdd(array);

    }

    public static void reverse(int[] a) {

        System.out.println("Reversed array :");

        int first = 0;
        int last = a.length - 1;

        while (first < last) {
            int temp = 0;
            temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }
        for(int X: a) {
            System.out.print(X + " ");
        }
        System.out.println();

        
    }

    public static void CountEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
            else if(array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Even nums count in array :" + evenCount);
        System.out.println("Odd nums count in array :" + oddCount);
    }

    public static void secondLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            int num = array[i];

            if (num > first) {
                second = first;
                first = num;
            } 
            else if (num < first && num > second) {
                second = num;
            }
        }
        System.out.println("Second largest element is :" + second);
    }
}
