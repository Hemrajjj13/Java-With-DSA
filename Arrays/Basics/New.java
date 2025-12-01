public class New {
    public static void main(String[] args) {
        

        int count = 0;
        for (int i = 1; i <= 904; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
