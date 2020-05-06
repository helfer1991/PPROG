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
public class CompareNome implements Comparator {
    
    @Override
    public int compare(Object obj1, Object obj2) {
        Trabalhador t1 = (Trabalhador) obj1;
        Trabalhador t2 = (Trabalhador) obj2;
        
        return (int) (t1.getNome().compareTo(t2.getNome()));
    }
}
