import java.util.*;

public class TotalCost {
    public static void main(String args[]) {
       
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter cost of Pen :");
            float a = sc.nextFloat();
            System.out.println("Enter cost of Pencil :");
            float b = sc.nextFloat();
            System.out.println("Enter cost of Eraser :");
            float c = sc.nextFloat();
            float Total = a + b + c;

            System.out.println("Total money you need to pay:"+ Total +"$");
    }
    
}
