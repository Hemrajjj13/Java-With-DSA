package Basics;

public class ArrayAsFunn {
    
    public static void main(String[] args) {
        int marks[] = {12, 24, 15};
        int nonchangeble = 5;
        update(marks, nonchangeble);
        
        // print our marks 
        for (int i =0; i < marks.length; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();
        System.out.println("nonchangeble = " + nonchangeble);
    }
    public static void update(int marks[], int nonchangeble) {
        nonchangeble = 10;
        System.out.println("Nonchngeble:"+ nonchangeble);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }
    }
}


// int nonchangeble = 5;