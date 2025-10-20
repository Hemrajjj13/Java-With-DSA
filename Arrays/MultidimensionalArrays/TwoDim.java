// package Arrays.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][];

        // int[][] arr2D = {
        //     {1, 2, 3},//0 th index
        //     {4, 5},//1first index
        //     {7, 8, 9, 10}// 2nd index
        // };

        int[][] arr = new int[3][3];
        // System.out.println(arr.length);

        //input

        for(int row = 0; row < arr.length; row++ ) {
            // for each col in every row 
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // // output
        // for(int row = 0; row < arr.length; row++ ) {
        //     // for each col in every row 
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // // output another way 
        // for(int row = 0; row < arr.length; row++ ) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // op another method 
        for (int a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
 