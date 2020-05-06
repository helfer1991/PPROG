/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Contribuinte> contribuintes = new ArrayList<>();
        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new ContribuinteContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new ContribuinteContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new ContribuinteContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new ContribuinteContaOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new ContribuinteContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));
                
        //3
        listar(contribuintes);
        
        //4
//        contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1)); com o método equals comentado n acontece nada
        System.out.println("Removido?" + contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1)));
        
        //5
        listar(contribuintes);
        
        //6 feito
        
        //7
        System.out.println("Removido?" + contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1)));
        //vai ser removido se descomentar o método equals
        
        //8 a)
        System.out.println("\n### Equals ###");
        System.out.println("Instâncias com características iguais: " + contribuintes.get(0).equals(new Reformado("Valter Cubilhas", "Olival", 600, 400)));
        
        //8 b)
        System.out.println("Instâncias do mesmo tipo com características diferentes: " + contribuintes.get(1).equals(contribuintes.get(contribuintes.size() - 1)));
        
        //8 c)
        System.out.println("Instâncias de tipos diferentes: " + contribuintes.get(0).equals(contribuintes.get(contribuintes.size() - 1)));
    }
    
    private static void listar(List<Contribuinte> contribuintes) {
        for(Contribuinte cont: contribuintes) {
            if(cont != null) {
                System.out.println(cont);
            }
        }
    }
}
