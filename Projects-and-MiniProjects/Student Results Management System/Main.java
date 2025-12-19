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
            {62, 64, 26, 65, 69},
            {72, 74, 46, 45, 79},
            {82, 64, 46, 55, 69},
            {62, 74, 86, 75, 79},
            {82, 84, 76, 85, 90}
        };
        int[] totalMs = totalMarks(marks); // get the total marks of each student
        double percentage[] = percentage(totalMs, marks); // get the percentage of all students
        boolean[] isPass = passFail(marks); // to check if the students is passed in all subjects or not 
        char[] grade = grades(percentage, isPass);
        printAllData(rollNo, names, totalMs, percentage, grade); // prints the complete data of students 
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

    static boolean[] passFail(int[][] marks) {
        boolean[] isPass = new boolean[marks.length];
        for (int row = 0; row < marks.length; row++) {
            boolean res = true;
            for (int col = 0; col < marks[row].length; col++) {
                if (marks[row][col] < 35) {
                    res = false;
                } 
                isPass[row] = res;
            }
        }
        return isPass;
    }

    static double[] percentage(int[] totalMs, int[][] marks) {
        double[] percentage = new double[totalMs.length];
        for (int i = 0; i < totalMs.length; i++) {
            percentage[i] = (double)totalMs[i] / marks[i].length;
        }
        return percentage;
    }

    static char[] grades(double[] percentage, boolean[] isPass) {
        char[] grades = new char[isPass.length];

        for (int i = 0; i < percentage.length; i++) {
            if (percentage[i] >= 90 && isPass[i]) {
                grades[i] = 'A';
            }
            else if (percentage[i] >= 80 && isPass[i]) {
                grades[i] = 'B';
            }
            else if (percentage[i] >= 70 && isPass[i]) {
                grades[i] = 'C';
            }
            else if (percentage[i] >= 60 && isPass[i]) {
                grades[i] = 'D';
            }
            else{
                grades[i] = 'F';
            }
        }
        return grades;
    }

    static void printAllData(int[] rollNo, String[] names, int[] totalMs, double[] percentage, char[] grade) {
        System.out.println("Total Data of all students:");
        for (int i = 0; i < totalMs.length; i++) {
            System.out.printf(
                "%d. %-10s Total: %d Percentage: %.2f%n Grade: %c%n",
                rollNo[i],
                names[i],
                totalMs[i],
                percentage[i],
                grade[i]
            );
        }
    }
}
