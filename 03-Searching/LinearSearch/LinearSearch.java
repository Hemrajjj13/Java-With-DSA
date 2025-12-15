public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(String menuStrings[], String itemString) {
        for(int i=0; i<menuStrings.length; i++) {
            if(menuStrings[i] == itemString) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] = {"Samosa", "Idli", "Sandwich", "Poha"};
        int key = 16;
        String item = "Poha";

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found !");
        }else {
            System.out.println("Key is at index : "+index);
        }

        int id = linearSearch(menu, item);
        if (id == -1) {
            System.out.println("Not Found !");
        }else {
            System.out.println("Item is available : "+ id);
        }
    }
}
