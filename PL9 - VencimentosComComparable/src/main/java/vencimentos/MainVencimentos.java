package vencimentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);
        TrabalhadorHora th2 = new TrabalhadorHora("Diogo", 300, 15.5f);

        List<Trabalhador> trabalhadores = new ArrayList<>();
        trabalhadores.add(tc);
        trabalhadores.add(tp);
        trabalhadores.add(th);
        trabalhadores.add(th2);

        System.out.println("\n### Trabalhadores Normal ###");
        listar(trabalhadores);


        System.out.println("\n### Trabalhadores Ordernados Vencimento Crescente ###");
        Collections.sort(trabalhadores);
        listar(trabalhadores);



        System.out.println("\n### Trabalhadores Ordernados Vencimento Decrescente ###");
        Collections.sort(trabalhadores, Collections.reverseOrder());
        listar(trabalhadores);

    }

    private static void listar(List<Trabalhador> trabalhadores) {
        for (Trabalhador trabalhador : trabalhadores) {
            if (trabalhador != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trabalhador.getNome(),
                        trabalhador.calcularVencimento());
            }
        }
    }

}
