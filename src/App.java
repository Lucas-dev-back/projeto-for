import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // imprime 100x a frase
        for (int i = 0; i < 100; i++) {
            System.out.println("Fala Dev!");
        }

        String[] vetor = new String[] { "Gabriel", "Michael", "Kafriel" };

        // imprime todos os elementos do vetor
        for (String valorDoVetor : vetor) {
            System.out.println(valorDoVetor);
        }

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Hector");
        nomes.add("Júnior");

        // imprime todos os nomes da lista
        nomes.forEach(System.out::println);

        // imprime enquanto for verdade
        for (;;) {
            System.out.println("Fala Dev!");
        }
    }
}
