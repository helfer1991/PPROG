/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentos;

import java.util.Comparator;
/**
 *
 * @author Asus
 */
public class ComparatorTrabalhador implements Comparator<Trabalhador> {
    
    @Override
    public int compare(Trabalhador t1, Trabalhador t2) {
        if(t1.calcularVencimento() > t2.calcularVencimento())
            return 1;
        else if(t1.calcularVencimento() < t2.calcularVencimento())
            return -1;
        return 0;
    }
}
