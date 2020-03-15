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
public class Reformado extends ContribuinteComRendimentos {
    private static double txOR = 0.03;
    private static double txRT = 0.01;
    
    public Reformado(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR, RT);
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
    
    @Override
    public double calcularImpostoRT() {
        double impostoRT = super.getRT()*getTxRT();
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
        return String.format("%s\nTotal de impostos a pagar: %.2f\n", super.toString(), totalImposto());
    }
}
