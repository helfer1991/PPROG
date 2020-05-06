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
public class AlunoBolseiro extends Aluno implements Pagamentos {
    private int bolsa;
    private static final int BOLSA_OMISSO = 200;
    
    public AlunoBolseiro(String nome, int id, int numeroMecanografico) {
        super(nome, id, numeroMecanografico);
        this.bolsa = BOLSA_OMISSO;
    }
    
    public AlunoBolseiro(String nome, int id, int numeroMecanografico, int bolsa) {
        super(nome, id, numeroMecanografico);
        this.bolsa = bolsa;
    }

    /**
     * @return the bolsa
     */
    public int getBolsa() {
        return bolsa;
    }

    /**
     * @param bolsa the bolsa to set
     */
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public double calcularPagamento() {
        return getBolsa();
    }
    
    @Override
    public String toString() {
        return String.format("%sValor da bolsa: %d\n", super.toString(), calcularPagamento());
    }
}
