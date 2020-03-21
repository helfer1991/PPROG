/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico1;

/**
 *
 * @author HMCFB
 */
public abstract class CreditoBancario {
    private String nomeCliente;
    private String profissao;
    private int montante;
    private int prazo;
    private static int qtInstancias = 0;
    
    private static final String NOMECLIENTE_OMISSO = "anonimo";
    private static final String PROFISSAO_OMISSO = "indefinido";
    private static final int MONTANTE_OMISSO = 5000;
    private static final int PRAZO_OMISSO = 60;
    
    public CreditoBancario() {
        this.nomeCliente = NOMECLIENTE_OMISSO;
        this.profissao = PROFISSAO_OMISSO;
        this.montante = MONTANTE_OMISSO;
        this.prazo = PRAZO_OMISSO;
        qtInstancias++;
    }
    
    public CreditoBancario(String nomeCliente, String profissao, int montante, int prazo) {
        this.nomeCliente = nomeCliente;
        this.profissao = profissao;
        this.montante = montante;
        this.prazo = prazo;
        qtInstancias++;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the montante
     */
    public int getMontante() {
        return montante;
    }

    /**
     * @param montante the montante to set
     */
    public void setMontante(int montante) {
        this.montante = montante;
    }

    /**
     * @return the prazo
     */
    public int getPrazo() {
        return prazo;
    }

    /**
     * @param prazo the prazo to set
     */
    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
    
    public static int getQtInstancias() {
        return qtInstancias;
    }
    
    @Override
    public String toString() {
        return String.format("Nome do cliente: %s\nProfissao: %s\nMontante emprestado: %d\nPrazo do emprestimo: %d\n", this.nomeCliente, this.profissao, this.montante, this.prazo);
    }
    
    public abstract double calcularMontanteTotalJuros();
    
    public abstract double calcularMontanteAReceberPorCadaCredito();   
}
