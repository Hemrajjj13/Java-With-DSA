import java.util.*;

public class TypePromo {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<Secion 1>>>>>>>>> 1");
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b * a);

        System.out.println("<<<<<<<<<<Secion 2>>>>>>>>> 1");        

        short A = 5;
        byte B = 25;
        char C = 'c';
        byte bt = (byte) (A + B + C);
        System.out.println(bt);

        System.out.println("<<<<<<<<<<Secion 3>>>>>>>>> 1");

        int p = 10;
        float q =20.25f;
        long r = 25;
        double s = 30;
        double ans = p + q + r + s;
        System.out.println(ans);

    }

    
}
