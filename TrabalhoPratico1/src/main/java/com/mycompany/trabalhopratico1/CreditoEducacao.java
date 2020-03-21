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
public class CreditoEducacao extends CreditoBancario {
    private static double txJuro = 2;
    private int periodoCarencia;
    
    private final int PERIODOCARENCIA_OMISSO = 12;
    
    public CreditoEducacao() {
        super();
        this.periodoCarencia = PERIODOCARENCIA_OMISSO;
    }
    
    public CreditoEducacao(String nomeCliente, String profissao, int montante, int prazo, int periodoCarencia) {
        super(nomeCliente, profissao, montante, prazo);
        this.periodoCarencia = periodoCarencia;
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
     * @return the periodoCarencia
     */
    public int getPeriodoCarencia() {
        return periodoCarencia;
    }

    /**
     * @param periodoCarencia the periodoCarencia to set
     */
    public void setPeriodoCarencia(int periodoCarencia) {
        this.periodoCarencia = periodoCarencia;
    }
    
    @Override
    public double calcularMontanteTotalJuros() {
        double capitalAmortizarMensal = super.getMontante() / (super.getPrazo() - this.periodoCarencia);
        double txJuroMensal = (this.txJuro/100/12);
        double totalJuros = this.periodoCarencia * txJuroMensal * super.getMontante();
        double montanteEmprestimo = super.getMontante();
        
        while(montanteEmprestimo > 0) {
            totalJuros += montanteEmprestimo * txJuroMensal;
            montanteEmprestimo -= capitalAmortizarMensal;
        }        
        return totalJuros;
    }
    
    @Override
    public double calcularMontanteAReceberPorCadaCredito() {
        return calcularMontanteTotalJuros() + super.getMontante();
    }
    
    @Override
    public String toString() {
        return String.format("%sJuros a pagar: %.2f\nMontante total imputado ao cliente: %.2f\n", super.toString(), calcularMontanteTotalJuros(), calcularMontanteAReceberPorCadaCredito());
    }
}
