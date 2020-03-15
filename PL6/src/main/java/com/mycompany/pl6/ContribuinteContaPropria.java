/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl6;

/**
 *
 * @author HMCFB
 */
public class ContribuinteContaPropria extends ContribuinteComRendimentos {
    private String profissao;
    private static double txRT = 0.03;
    private static double txOR1 = 0.02;
    private static double txOR2 = 0.05;
    
    private static final String PROFISSAO_OMISSO = "nao definido";
    
    public ContribuinteContaPropria(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR, RT);
        this.profissao = PROFISSAO_OMISSO;
    }
    
    public ContribuinteContaPropria(String nome, String morada, int OR, int RT, String profissao) {
        super(nome, morada, OR, RT);
        this.profissao = profissao;
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
     * @return the txRT
     */
    public static double getTxRT() {
        return txRT;
    }

    /**
     * @param aTxRT the txRT to set
     */
    public static void setTxRT(double aTxRT) {
        txRT = aTxRT;
    }

    /**
     * @return the txOR1
     */
    public static double getTxOR1() {
        return txOR1;
    }

    /**
     * @param aTxOR1 the txOR1 to set
     */
    public static void setTxOR1(double aTxOR1) {
        txOR1 = aTxOR1;
    }

    /**
     * @return the txOR2
     */
    public static double getTxOR2() {
        return txOR2;
    }

    /**
     * @param aTxOR2 the txOR2 to set
     */
    public static void setTxOR2(double aTxOR2) {
        txOR2 = aTxOR2;
    }
    
    @Override
    public double calcularImpostoRT() {
        double impostoRT = super.getRT()*getTxRT();        
        return impostoRT;
    }
    
    @Override
    public double calcularImpostoOR() {
        double impostoOR;        
        if(super.getOR() <= 50000) {
            impostoOR = super.getOR()*getTxOR1();
        } else {
            impostoOR = super.getOR()*getTxOR2();
        }        
        return impostoOR;
    }
    
    @Override
    public double totalImposto() {
        return calcularImpostoRT() + calcularImpostoOR();
    }
    
    @Override
    public String toString() {
        return String.format("%s\nTotal de imposto a pagar: %.2f\nProfissao: %s\n", super.toString(), totalImposto(), this.profissao);
    }
}
