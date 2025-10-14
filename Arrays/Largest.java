public class Largest {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            
        }
        System.out.println("Samllest value is :" + smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int numbers[] = {0, -111, -100, -101, 2, 3, 39, 5, 4, 11, 6, 34};

        System.out.println("Lrgest numbers is : " + getLargest(numbers));

    }
}
