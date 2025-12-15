import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            6 4 5
            7 8 9
        */

        int[][] arr = {
            {1, 2, 3},
            {6, 4, 5},
            {7, 8, 9}
        };
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        int[][] arr2 = new int[3][2];
        twoDim(arr2, in);
    }

    static void twoDim(int[][] arr,Scanner in) {
        System.out.println(arr.length);//no of rows

        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter value at [" + row + "][" + col + "]: ");
                arr[row][col] = in.nextInt();
            }
        }

        // for (int[] row : arr) {
        //     for (int col : row) {
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
