/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl8;

/**
 *
 * @author HMCFB
 */
public class AlunoNaoBolseiro extends Aluno implements Pagamentos {
    
    public AlunoNaoBolseiro(String nome, int id, int numeroMecanografico) {
        super(nome, id, numeroMecanografico);
    }
    
    @Override
    public double calcularPagamento() {
        return 0;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
