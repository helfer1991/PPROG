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
public class Desempregado extends Contribuinte {
    private int mesesParagem;
    private static double txOR = 0.02;
    public static final int MESESPARAGEM_OMISSO = 1;
    
    public Desempregado(String nome, String morada, int OR) {
        super(nome, morada, OR);
        this.mesesParagem = MESESPARAGEM_OMISSO;
    }
    
    public Desempregado(String nome, String morada, int OR, int mesesParagem) {
        super(nome, morada, OR);
        this.mesesParagem = mesesParagem;
    }

    /**
     * @return the mesesParagem
     */
    public int getMesesParagem() {
        return mesesParagem;
    }

    /**
     * @param mesesParagem the mesesParagem to set
     */
    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
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
    public double calcularImpostoOR() {
        double impostoOR = super.getOR()*getTxOR();
        return impostoOR;
    }
    
    @Override
    public double totalImposto() {
        return calcularImpostoOR();
    }
    
    @Override
    public String toString() {
        return String.format("%s\nTotal de imposto a pagar: %.2f\nMeses de paragem: %d\n", super.toString(), totalImposto(), this.mesesParagem);
    }
}
