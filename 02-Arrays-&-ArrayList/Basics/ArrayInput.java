import java.util.*;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        arr[0] = 23;
        arr[1] = 231;
        arr[2] = 231;
        arr[3] = 2323;
        arr[4] = 2;
        // System.err.println(arr[3]);

        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }
        // for(int i = 0; i < arr.length; i++ ) {
        //     System.out.print(arr[i]+" ");
        // }

        //another method 
        // for (int num : arr) {//for every element inarray, print the element
        //     System.out.print(num + " ");// here num represents element ot the array
        // }

        // Another Method to print Array 
        System.out.println(Arrays.toString(arr));


        // Array of  objects 

        // String[] arr1 = new String[6];
        // for(int i = 0; i < arr1.length; i++ ) {
        //     arr 1[i] = sc.next();
        // }
        // arr1[3] = "Hemraj";// Modify
        // for(int i = 0; i < arr1.length; i++ ) {
        //     System.out.print(arr1[i]+" ");
        // }
    }      
}
