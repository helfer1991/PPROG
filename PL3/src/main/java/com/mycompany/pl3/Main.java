/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl3;

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
        Tempo t1 = new Tempo(05, 30, 12);
                
        //b
        System.out.println(t1);
        
        //c
        t1.acrescentarSegundo();
        
        //d
        System.out.println(t1);
        
        //e
        Tempo t2 = new Tempo(18, 05, 20);
        
        //f
        System.out.println(t2);
        
        //g
        if(t1.isMaior(t2)) {
            System.out.println("Tempo t1 e superior ao tempo t2");
        } else {
            System.out.println("Tempo t1 e inferior ao tempo t2");
        }
        
        //h
        if(t1.isMaior(23, 07, 04)) {
            System.out.println("Tempo t1 e superior a 23:07:04");
        } else {
            System.out.println("Tempo t1 e inferior a 23:07:04");
        }
        
        //i.1
        System.out.printf("A diferenca e de %d segundos\n", t1.calcularDiferenca(t2));
        
        //i.2 retornar objeto
        System.out.println(t1.calcularDiferencaObjeto(t2));
    }
    
}
