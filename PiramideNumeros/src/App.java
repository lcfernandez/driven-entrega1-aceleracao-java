public class App {
    public static void main(String[] args) throws Exception {
        int num = 5;

        if (num > 0) {
            for (int i = 1; i < num + 1; i++) {
                for (int j = 0; j < i; j++)
                    System.out.print(i);
                
                System.out.println();
            }
        }
    }
}
