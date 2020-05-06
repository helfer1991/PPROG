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
public abstract class Pessoa {
    private String nome;
    private int id;
    private static final String NOME_OMISSO = "anonimo";
    private static final int ID_OMISSO = 000000000;
    
    public Pessoa() {
        this.nome = NOME_OMISSO;
        this.id = ID_OMISSO;
    }
    
    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s\nNumero identificacao civil: %d\n", this.nome, this.id);
    }
}
