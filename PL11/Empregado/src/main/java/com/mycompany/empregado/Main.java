/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.empregado;

import com.mycompany.utilitarios.Data;
import com.mycompany.utilitarios.Tempo;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        Data d1 = new Data(2010,3,31);
        System.out.println(d1);
        
        //b
        Tempo t1 = new Tempo(9,00,00);
        Tempo t2 = new Tempo(17,00,00);
        
        //c
        Empregado e1 = new Empregado("Helder", "Ferreira", d1, t1, t2);
        Empregado e2 = new Empregado("Mafalda", "Pinheiro", d1, t1, t2);
        System.out.println(e1);
        
        //d ref partilhadas: criar uma data partilhada por 2 empregados. se alterar uma, vai alterar nos 2, ou só num? se nos 2, a ref é partilhada
        e2.setDataContrato(new Data(2012,3,4)); //de outro modo n altera
        System.out.println(e1);
        System.out.println(e2);
        
        //e
        
        //f
        
        //g
        System.out.println(d1);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(e1);
        System.out.println(e2);
        
        //h
        e2.setHoraEntrada(new Tempo(8,30,0));
        e2.setHoraSaida(new Tempo(17,30,0));
        System.out.println(e2);
                
        //i
        ArrayList<Empregado> empregados = new ArrayList<>();
        empregados.add(e1);
        empregados.add(e2);
        
        //j
        listar(empregados);
        
        //k
        listar2(empregados);
    }
    
    private static void listar(ArrayList<Empregado> empregados) {
        for(Empregado empregado: empregados) {
            if(empregado != null) {
                System.out.println(empregado);
            }
        }
    }
    
    private static void listar2(ArrayList<Empregado> empregados) {
        for(Empregado empregado: empregados) {
            if(empregado != null) {
                System.out.printf("Nome: %s\nHoras de trabalho semanais: %d horas\nTempo na emmpresa: %d dias\n\n", empregado.getPrimeiroNome() + " " + empregado.getUltimoNome(), empregado.calcularHorasSemanais(), empregado.tempoNaEmpresa());
            }
        }
    }
    
}
