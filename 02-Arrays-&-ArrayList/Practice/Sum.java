
public class Sum {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 7, 5, 12, 56 };
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };

        sumOfEles(a);
        sortedOrNot(a);

        copyOfArray(copyFrom);
    }

    // Sum of elements in the array
    public static int sumOfEles(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        int avg = sum / a.length;
        System.out.println("Sum of Elements :" + sum);
        System.out.println("Average of an array :" + avg);
        return sum;
    }

    // copying one array into another
    public static void copyOfArray(String[] a) {

        String[] b = new String[10];
        System.arraycopy(a, 0, b, 0, 10);
        for(String coffee: b){
            System.out.print(coffee + " ");
        }


        // System.out.print("Copy of an array :");
        // for (int j = 0; j < a.length; j++) {
        //     b[j] = a[j];
        //     System.out.print(b[j] + " ");
        // }
    }

    public static void sortedOrNot(int[] a) {
        boolean isSorted = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                isSorted = false;
                break; // no need to check further
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
