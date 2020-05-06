/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl10;

/**
 *
 * @author Asus
 */
public abstract class Contribuinte {
    private String nome;
    private String morada;
    private int OR;
    
    private static final String NOME_OMISSO = "anonimo";
    private static final String MORADA_OMISSO = "indefinido";
    private static final int OR_OMISSO = 0;
    
    public Contribuinte() {
        this.nome = NOME_OMISSO;
        this.morada = MORADA_OMISSO;
        this.OR = OR_OMISSO;
    }
    
    public Contribuinte(String nome, String morada, int OR) {
        this.nome = nome;
        this.morada = morada;
        this.OR = OR;
    }
    
    public Contribuinte(String nome) {
        this.nome = nome;
        this.morada = MORADA_OMISSO;
        this.OR = OR_OMISSO;
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
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    
    public int getOR() {
        return OR;
    }
    
    public void setOR(int OR) {
        this.OR = OR;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s\nMorada: %s\nOutros rendimentos: %d", this.nome, this.morada, this.OR);
    }
    
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        if(this.getClass() == outroObjeto.getClass()) {
            return true;
        }
        Contribuinte outroContribuinte = (Contribuinte) outroObjeto;
        return this.nome.equalsIgnoreCase(outroContribuinte.nome) && this.morada.equalsIgnoreCase(outroContribuinte.morada) && this.OR == outroContribuinte.OR;
    }
    
    public abstract double calcularImpostoOR();
    
    public abstract double totalImposto();
}
