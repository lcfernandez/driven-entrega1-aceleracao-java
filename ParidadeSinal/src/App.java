public class App {
    public static void main(String[] args) throws Exception {
        int num = -5;
        
        String paridade;
        String sinal;

        if (num == 0)
            System.out.println(num + " é nulo.");
        else {
            if (num % 2 == 0)
                paridade = "par";
            else
                paridade = "ímpar";

            if (num > 0)
                sinal = "positivo";
            else
                sinal = "negativo";
            
            System.out.println(num + " é " + paridade + " e " + sinal + ".");
        }
    }
}
