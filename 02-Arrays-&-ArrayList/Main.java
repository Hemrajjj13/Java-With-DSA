// import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(45);
        list.add(67);
        list.add(34);
        list.add(4);
        list.add(434);
        list.add(43);
        list.add(78);
        list.add(12);
        list.add(32);
        list.add(90);
        list.add(90);
        list.remove(5);
        System.out.println(list.get(0));

        System.out.println(list.size());
        System.out.println(list.contains(34));
        System.out.println(list);

    }
}
