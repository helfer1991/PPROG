/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl4;

/**
 *
 * @author HMCFB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        Utente u1 = new Utente("Helder", "Masculino", 28, 78, 1.83);
        Utente u2 = new Utente("Mafalda", "Feminino", 22, 54, 1.60);
        Utente u3 = new Utente("Renato", "Masculino", 37, 76, 1.77);
        Utente u4 = new Utente("Isabel", "Feminino", 29, 59, 1.70);
        Utente u5 = new Utente("Bola 7", "Masculino", 33, 150, 1.80);
        
        //b
        Utente[] array = new Utente[10];
        array[0] = u1;
        array[1] = u2;
        array[2] = u3;
        array[3] = u4;
        array[4] = u5;
        
        //c.i
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                System.out.println(array[i]);
            }
        }
        
        //c.ii
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                System.out.printf("Nome: %s\nIMC: %.2f%%\nGrau de obesidade: %s\n\n", array[i].getNome(), array[i].calcularIMC(), array[i].grauObesidade());
            }
        }
        
        //c.iii
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                if(!(array[i].checkSaudavel())) {
                    System.out.printf("Nome: %s\nGrau de Obesidade: %s\n\n", array[i].getNome(), array[i].grauObesidade());
                }
            }
        }
        
        //d sacar quantidade de instancas
        System.out.printf("Quantidade de instancias criadas: %d\n\n", Utente.checkQtInstancias());
        
        //e
        u3.setIdade(u5.getIdade());
        System.out.println(u3.getIdade());
        System.out.println();
        
        //f
        if(u3.isMaisNovo(u5) == 1) {
            System.out.printf("O utente %s e mais novo do que o utente %s\n\n", u3.getNome(), u5.getNome());
        } else if(u3.isMaisNovo(u5) == 0) {
            System.out.printf("O utente %s e mais novo do que o utente %s\n\n", u5.getNome(), u3.getNome());
        } else {
            System.out.printf("Os utentes %s e %s tem a mesma idade\n\n", u3.getNome(), u5.getNome());
        }
    }
    
}
