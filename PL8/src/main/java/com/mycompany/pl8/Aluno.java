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
public class Aluno extends Pessoa {
    private int numeroMecanografico;
    private static final int NUMEROMECANOGRAFICO_OMISSO = 0000;
    
    public Aluno(String nome, int id) {
        super(nome, id);
        this.numeroMecanografico = NUMEROMECANOGRAFICO_OMISSO;
    }
    
    public Aluno(String nome, int id, int numeroMecanografico) {
        super(nome, id);
        this.numeroMecanografico = numeroMecanografico;
    }

    /**
     * @return the numeroMecanografico
     */
    public int getNumeroMecanografico() {
        return numeroMecanografico;
    }

    /**
     * @param numeroMecanografico the numeroMecanografico to set
     */
    public void setNumeroMecanografico(int numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }
    
    @Override
    public String toString() {
        return String.format("%sNumero de aluno: %d\n", super.toString(), this.numeroMecanografico);
    }
}
