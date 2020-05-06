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
public abstract class ContribuinteComRendimentos extends Contribuinte {
    private int RT;
    private static final int RT_OMISSO = 0;
    
    public ContribuinteComRendimentos(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR);
        this.RT = RT;
    }
    
    public ContribuinteComRendimentos(String nome, String morada, int OR) {
        super(nome, morada, OR);
        this.RT = RT_OMISSO;
    }
   
    /**
     * @return the RT
     */
    public int getRT() {
        return RT;
    }

    /**
     * @param RT the RT to set
     */
    public void setRT(int RT) {
        this.RT = RT;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nRendimentos do trabalho: %d", super.toString(), this.RT);
    }
    
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        if (!super.equals(outroObjeto)) {
            return false;
        }
        ContribuinteComRendimentos outroContribuinte = (ContribuinteComRendimentos) outroObjeto;
        return this.RT == outroContribuinte.RT;
    }
    
    public abstract double calcularImpostoRT();
    
    @Override
    public abstract double calcularImpostoOR();
    
    @Override
    public abstract double totalImposto();
}
