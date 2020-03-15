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
public class ContribuinteContaOutrem extends ContribuinteComRendimentos {
    private String nomeEmpresa;
    private static double txRT1 = 0.01;
    private static double txRT2 = 0.02;
    private static double txOR = 0.02;
    
    private static final String NOMEEMPRESA_OMISSO = "nao definido";
    
    public ContribuinteContaOutrem(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR, RT);
        this.nomeEmpresa = NOMEEMPRESA_OMISSO;
    }
    
    public ContribuinteContaOutrem(String nome, String morada, int OR, int RT, String nomeEmpresa) {
        super(nome, morada, OR, RT);
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the txRT1
     */
    public static double getTxRT1() {
        return txRT1;
    }

    /**
     * @param aTxRT1 the txRT1 to set
     */
    public static void setTxRT1(double aTxRT1) {
        txRT1 = aTxRT1;
    }

    /**
     * @return the txRT2
     */
    public static double getTxRT2() {
        return txRT2;
    }

    /**
     * @param aTxRT2 the txRT2 to set
     */
    public static void setTxRT2(double aTxRT2) {
        txRT2 = aTxRT2;
    }

    /**
     * @return the txOR
     */
    public static double getTxOR() {
        return txOR;
    }

    /**
     * @param aTxOR the txOR to set
     */
    public static void setTxOR(double aTxOR) {
        txOR = aTxOR;
    }
    
    @Override
    public double calcularImpostoRT() {
        double impostoRT;
        if(super.getRT() <= 30000) {
            impostoRT = super.getRT()*getTxRT1();
        } else {
            impostoRT = super.getRT()*getTxRT1();
        }
        return impostoRT;
    }
    
    @Override
    public double calcularImpostoOR() {
        double impostoOR = super.getOR()*getTxOR();        
        return impostoOR;
    }
    
    @Override
    public double totalImposto() {
        return calcularImpostoRT() + calcularImpostoOR();
    }
    
    @Override
    public String toString() {
        return String.format("%s\nTotal de impostos a pagar: %.2f\nNome da empresa: %s\n", super.toString(), totalImposto(), this.nomeEmpresa);
    }
}
