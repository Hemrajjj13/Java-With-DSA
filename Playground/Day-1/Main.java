import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hello ");
        System.out.println("World!");
        System.out.printf("My age is %d\n", 23);

        // %d - Integer, %f - Floating point number, %s - String, %c - Character, %b - Boolean
        System.out.printf("I'm %s %d years old, I got %.2f CGPA in my Graudtion. \n", "Hemraj", 23, 6.9732432);

        // int age = sc.nextInt();
        // double CGPA = sc.nextDouble();
        // String name = sc.next();
        // String line = sc.nextLine();

        // System.out.println(" " + name + " " + age+ line + " " + CGPA);

        System.out.println(5 / 2);        // both are integers
        System.out.println(5 / 2.0);      // 1 is double
        System.out.println((double)5 / 2);// answer in converted to double so o/p will be in double

        char ch = 'Y';
        int val = ch;
        val += 32;

        System.out.println(val + " " +(char)val);


    }    
}
