import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter Number. of Students: ");
        // int n = in.nextInt();
        // int[][] students = new int[n][];
        int[][] students = {
            {40, 35, 45, 56, 78, 99},
            {30, 35, 45, 65, 75, 99},
            {40, 57, 45, 23, 78, 99}
        };
        int[] total = total(students);
        for (int marks: total){
            System.out.println(marks);
        }


    }

    static int[] total(int[][] students) {
        int[] total = new int[students.length];
        for (int row = 0; row < students.length; row++) {
            int totalMarks = 0;
            for (int col = 0; col < students[row].length; col++) {
                if (students[row][col] < 35) {
                    System.out.println("Student" + (col + 1) + "Failed");
                    return -1;
                }
                totalMarks += students[row][col]; 
            }
            total[row] = totalMarks;
        }
        return total;
    }


}
