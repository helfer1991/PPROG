/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl5;

/**
 *
 * @author HMCFB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //3
        TrabalhadorPeca t1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao t2 = new TrabalhadorComissao("Susana Ferreira", 650.0f, 2731.5f, 4.25f);
        TrabalhadorHora t3 = new TrabalhadorHora("Carlos Miguel", 168, 4.5f);
        
        //4 e 7
        Trabalhador[] array = new Trabalhador[10];
        
        //5
        array[0] = t1;
        array[1] = t2;
        array[2] = t3;
        
        //6.1
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                System.out.println(array[i]);
                System.out.println();
            }
        }

        //6.2
        for(int i = 0; i < array.length; i++) {
            if(array[i] instanceof TrabalhadorHora) {
                System.out.println(array[i]);
                System.out.println();
            }
        }
        
        //6.3
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                System.out.printf("Nome: %s\nVencimento: %.2f\n\n", array[i].getNome(), array[i].calcularVencimento());
            }
        }
    }
    
}
