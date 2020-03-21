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
public class CreditoHabitacao extends CreditoBancario {
    private static double txJuro = 0.1;
    private double spread;
    
    private final double SPREAD_OMISSO = 1;
    
    public CreditoHabitacao(String nomeCliente, String profissao, int montante, int prazo) {
        super(nomeCliente, profissao, montante, prazo);
        this.spread = SPREAD_OMISSO;
    }
    
    public CreditoHabitacao(String nomeCliente, String profissao, int montante, int prazo, double spread) {
        super(nomeCliente, profissao, montante, prazo);
        this.spread = spread;
    }

    /**
     * @return the txJuro
     */
    public static double getTxJuro() {
        return txJuro;
    }

    /**
     * @param aTxJuro the txJuro to set
     */
    public static void setTxJuro(double aTxJuro) {
        txJuro = aTxJuro;
    }

    /**
     * @return the spread
     */
    public double getSpread() {
        return spread;
    }

    /**
     * @param spread the spread to set
     */
    public void setSpread(double spread) {
        this.spread = spread; 
    }
    
    @Override
    public double calcularMontanteTotalJuros() {
        double txJuroSpreadMensal = (this.spread/100/12) + (this.txJuro/100/12); //fazer while com capital em falta a diminuir 500 por cada ciclo (no caso do exemplo do excel)
        double capitalAmortizarMensal = super.getMontante() / super.getPrazo(); 
        double totalJuros = 0;
        double montanteEmprestimo = super.getMontante();
        
        while(montanteEmprestimo > 0) {
            totalJuros += montanteEmprestimo * txJuroSpreadMensal;
            montanteEmprestimo -= capitalAmortizarMensal;
        }
        return totalJuros;
    }
    
    @Override
    public double calcularMontanteAReceberPorCadaCredito() {
        return super.getMontante() + calcularMontanteTotalJuros();
    }
    
    @Override
    public String toString() {
        return String.format("%sTotal de Juros a pagar: %.2f\nMontante total imputado ao cliente: %.2f\n", super.toString(), calcularMontanteTotalJuros(), calcularMontanteAReceberPorCadaCredito());
    }
}
