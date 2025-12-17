import java.io.ObjectInputFilter.Status;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rollNo = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] names = {"Hemraj", "Nischay", "Yash", "Digvijay", "Aditya", "Harry", "Arpan", "Danny"};
        int[][] marks = {
            {92, 94, 96, 85, 89},
            {82, 84, 86, 75, 79},
            {82, 74, 76, 65, 79},
            {62, 64, 66, 65, 69},
            {72, 74, 46, 45, 79},
            {82, 64, 46, 55, 69},
            {62, 74, 86, 75, 79},
            {82, 84, 76, 85, 90}
        };
        int[] totalMs = totalMarks(marks); // get the total marks of each student
        double percentage[] = percentage(totalMs, marks);
        showTotalMarks(rollNo, names, totalMs, percentage);

    }

    public static int[] totalMarks(int[][] marks) {
        int[] totalMs = new int[marks.length];
        for (int row = 0; row < marks.length; row++) {
            int total = 0;
            for (int col = 0; col < marks[row].length; col++) {
                total += marks[row][col];
            }
            totalMs[row] = total;
        }
        return totalMs;
    }

    static void showTotalMarks(int[] rollNo, String[] names, int[] totalMs, double[] percentage) {
        System.out.println("Total Marks of all students:");
    for (int i = 0; i < totalMs.length; i++) {
        System.out.printf(
            "%d. %-10s Total: %d Percentage: %.2f%n",
            rollNo[i],
            names[i],
            totalMs[i],
            percentage[i]
        );
    }
    }

    static double[] percentage(int[] totalMs, int[][] marks) {
        double[] percentage = new double[totalMs.length];
        for (int i = 0; i < totalMs.length; i++) {
            percentage[i] = (double)totalMs[i] / marks[i].length;
        }
        return percentage;
    }


}
