package vencimentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//posso ter vários comparators, mas só um compareTo, daí a maior versatilidade do comparator face ao comparable
//usar outra classe como interface para implementar os metodos do comparator

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 
                                                          500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);
        TrabalhadorHora th2 = new TrabalhadorHora("Diogo", 300, 15.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);
        trabs.add(th2);
        
        System.out.println("Lista de trabalhadores sem alterações de ordem:");
        listar(trabs);
        
        System.out.println();
        
        System.out.println("Lista de trabalhadores ordenados de forma crescente de acordo com o salário");
        ComparatorTrabalhador c1 = new ComparatorTrabalhador();
        Collections.sort(trabs, c1);
        listar(trabs);
        
        System.out.println();
        
        System.out.println("Lista de trabalhadores ordenados de forma decrescente de acordo com o salário");
        CompareDecres c2 = new CompareDecres();
        Collections.sort(trabs, c2);
        listar(trabs);
                
        System.out.println();
        
        System.out.println("Lista de trabalhadores por ordem alfabética");
        Collections.sort(trabs, new CompareNome());
        listar(trabs);

    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(), 
                                    trab.calcularVencimento());
            }
        }
    }

}
