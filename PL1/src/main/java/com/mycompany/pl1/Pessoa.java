/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl1;

/**
 *
 * @author HMCFB
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    private final String NOME_OMISSO = "anonimo";
    private final int IDADE_OMISSO = 0;
    
    public Pessoa() {
        this.nome = NOME_OMISSO;
        this.idade = IDADE_OMISSO;
    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString() {
        return String.format("%s tem %d anos\n", this.nome, this.idade);
    }
}
