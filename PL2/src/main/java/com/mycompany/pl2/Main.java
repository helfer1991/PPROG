/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl2;

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
        Data data1 = new Data(2020,03,13);
        
        //b
        System.out.println(data1);
        
        //c
        Data data2 = new Data(1974,04,25);
        
        //d
        System.out.println(data2.toAnoMesDiaString());
        
        //e
        if(data1.isMaior(data2)) {
            System.out.println("A data 1 e mais recente do que a data 2");
        } else {
            System.out.println("A data 2 e mais recente do que a data 1");
        }
        
        //f
        System.out.printf("A diferenca entre as duas datas e igual a %d dias\n", data1.calcularDiferenca(data2));
        
        //g
        System.out.printf("Faltam %d dias para o Natal\n", data1.calcularDiferenca(2020, 12, 24));
        
        //h
        System.out.println(data2.determinarDiaDaSemana());
        
        //i.1
        System.out.println(data2.isAnoBissexto(data2.getAno()));
        
        //ii.2
        System.out.println(Data.isAnoBissexto(1974));
    }
    
}
