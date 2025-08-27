import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // icludes spaces
        System.out.println(input);

        String ip = sc.next(); // Single String
        System.out.println(ip);   

        int age = sc.nextInt();
        System.out.println(age);

        sc.close();
    }
}

