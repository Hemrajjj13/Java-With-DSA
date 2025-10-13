public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            int a = 70; // already intialised outside the block in the same method, hence you cannot intialise it again
                        
            a = 100;
            int c = 99; 
            // values intialised in this block, will remain in block
        }
        System.out.println(a);
    }
}
