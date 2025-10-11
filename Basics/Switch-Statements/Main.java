import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Hello");
        System.out.println("Enter Fuit name:");
        String fruit = in.next();
        
        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;

            case "Apple":
                System.out.println("King of Smartphones.");
                break;

            
            case "Orange":
                System.out.println("Round Fruit");
                break;


            case "Grapes":
                System.out.println("Small Fruit");
                break;

        
            default:
                System.out.println("Enter Valid Fruit Name");
        }
    }
}
 