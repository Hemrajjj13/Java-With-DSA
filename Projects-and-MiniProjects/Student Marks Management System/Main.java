import java.io.ObjectInputFilter.Status;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] students = {
            {95, 92, 90, 88, 85, 80}, // Total = 530 (500+)
            {75, 78, 72, 70, 68, 65}, // Total = 428 (400+)
            {55, 58, 52, 50, 48, 45}, // Total = 308 (300+)
            {40, 42, 38, 35, 30, 25}  // Total = 210 (200+)
        };

        
        total(students);


    }

    static void total(int[][] students) {
        int[] totalM = new int[students.length];
        boolean[] passOrFail = new boolean[students.length];
        double[] avg = new double[students.length];
        char[] grades = new char[students.length];


        for (int row = 0; row < students.length; row++) {
            int totalMarks = 0;
            boolean pass = true;
            int subs = 0;
            for (int col = 0; col < students[row].length; col++) {
                totalMarks += students[row][col]; 
                if (students[row][col] < 35) {
                    pass = false;
                }
                subs = students[row].length;

            }
            totalM[row] = totalMarks;
            passOrFail[row] = pass;
            avg[row] = totalMarks / subs;
            if (totalMarks > 500) {
                grades[row] = 'A';
            }
            else if (totalMarks > 450) {
                grades[row] = 'B';
            }
            else if (totalMarks > 350) {
                grades[row] = 'C';
            }
            else {
                grades[row] = 'F';
            }

        }



        // For Final Ouput
        for(int i = 0; i < totalM.length; i++) {
            System.out.println("Student "+ (i+1) + ":");
            System.out.println("Total Marks: " + totalM[i]);
            System.out.println("Average: "+ avg[i]);
            System.out.println("Grade: " + grades[i]);

            if (passOrFail[i]) {
                System.out.println("Status: Pass");
            } else {
                System.out.println("Status: Fail");
            }
            System.out.println("----------------------------");
        }
        
    }



}
