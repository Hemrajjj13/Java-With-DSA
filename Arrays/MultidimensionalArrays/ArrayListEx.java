import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(500);
        // list.add(5550);
        // list.add(500);
        // list.add(5550);
        // list.add(500);
        // list.add(5456);
        // list.add(500);
        // list.add(2);
        // list.add(500);
        // list.add(778);
        // list.add(500);
        // list.add(456);

        // System.out.println(list.contains(2));
        // list.set(0, 99);
        // list.remove(0);
        // System.out.println(list);

        //input 
        for (int i = 0; i < 20; i++) {
            list.add(in.nextInt());
        }
         
        // Get item at any index 
        for (int i = 0; i < 20; i++) {
            System.out.print(list.get(i) + " ");// pass index here,list[index] syntax will not work here
        }
    }
}
