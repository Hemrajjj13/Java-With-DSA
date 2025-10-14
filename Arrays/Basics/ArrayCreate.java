import java.util.*;
public class ArrayCreate {
    public static void main(String[] args) {
        int moreNumbers [] = {4, 5, 6};
        String names[] = {"Hemraj", "Digvijay", "Nishchay"};

        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = 7;

        marks[2] = ( ( marks[2] + 1 ) / 1 ) * 2;

        int percentage = (marks[0] + marks[1] + marks[3]) / 3;

        System.out.println("Physics: "+marks[0]);
        System.out.println("Math: "+marks[1]);
        System.out.println("Biology: "+marks[2]);

        System.out.println("Percentage = " + percentage );
    }
}
