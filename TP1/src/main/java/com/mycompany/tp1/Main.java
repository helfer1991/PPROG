/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp1;

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
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1200);
        
        //b
        System.out.println(a1);
        
        //c
        System.out.println(a1.getMatricula());
        
        //d
        System.out.println(a1.getInstancias());
        
        //e
        Automovel a2 = new Automovel("22-22-BB", "Audi");
        
        //f
        System.out.println(a2);
        
        //g
        a2.setCilindrada(1800);
        
        //h
        System.out.println(a2);
        
        //i
        System.out.println(a2.getInstancias());
        
        //j
        System.out.println(a1.diferencaCilindrada(a2));
        
        //k
        if(a1.cilindradaMaior(a2.getCilindrada())) {
            System.out.println(a1);
        } else {
            System.out.println(a2);
        }
        
        //i
        System.out.println(a1.cilindradaMaior(2000));
    }
    
}
