import java.util.ArrayList;
import java.util.List;

public class App {
    static List<Feriado> listaFeriados = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        listaFeriados.add(new Feriado("01-01-2024", "Confraternização Mundial"));
        listaFeriados.add(new Feriado("12-02-2024", "Carnaval"));
        listaFeriados.add(new Feriado("13-02-2024", "Carnaval"));
        listaFeriados.add(new Feriado("29-03-2024", "Sexta-feira Santa"));
        listaFeriados.add(new Feriado("21-04-2024", "Tiradentes"));
        listaFeriados.add(new Feriado("01-05-2024", "Dia do Trabalho"));
        listaFeriados.add(new Feriado("30-05-2024", "Corpus Christi"));
        listaFeriados.add(new Feriado("07-09-2024", "Independência do Brasil"));
        listaFeriados.add(new Feriado("12-10-2024", "Nossa Senhora Aparecida"));
        listaFeriados.add(new Feriado("02-11-2024", "Finados"));
        listaFeriados.add(new Feriado("15-11-2024", "Proclamação da República"));
        listaFeriados.add(new Feriado("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        listaFeriados.add(new Feriado("25-12-2024", "Natal"));

        System.out.println("Lista de Feriados:\n");
        imprimeFeriados();
        
        System.out.println();
        verificaFeriado("22-01-2024");
        
        System.out.println();
        verificaFeriado("01-05-2024");
    }

    public static void imprimeFeriados() {
        for (int i = 0; i < listaFeriados.size(); i++)
            System.out.println(listaFeriados.get(i).getData() + " => " + listaFeriados.get(i).getNome());
    }

    public static void verificaFeriado(String data) {
        for (int i = 0; i < listaFeriados.size(); i++) {
            if (data == listaFeriados.get(i).getData()) {
                System.out.println("Dia " + listaFeriados.get(i).getData() + " é " + listaFeriados.get(i).getNome() + "! 🎉");
                return;
            }
        }

        System.out.println("Dia " + data + " não é feriado 🥲");
    }
}
