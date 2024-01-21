public class App {
    public static void main(String[] args) throws Exception {
        int num = 5;

        if (num > 0) {
            int[] sequencia = new int[num];
            sequencia[0] = 0;

            if (num > 1) {
                sequencia[1] = 1;

                for (int i = 2; i < num; i++)
                    sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
            }

            for (int i = 0; i < num - 1; i++)
                System.out.print(sequencia[i] + " ");
            System.out.println(sequencia[num - 1]);
        }
    }
}
