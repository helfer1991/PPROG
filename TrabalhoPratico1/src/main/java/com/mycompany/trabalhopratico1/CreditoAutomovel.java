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
public class CreditoAutomovel extends CreditoBancario {
    private static double txJuro = 6;
    private static double txDesconto = 1;
    
    public CreditoAutomovel(String nomeCliente, String profissao, int montante, int prazo) {
        super(nomeCliente, profissao, montante, prazo);
    }
    
    public CreditoAutomovel() {
        super();
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
     * @return the txDesconto
     */
    public static double getTxDesconto() {
        return txDesconto;
    }

    /**
     * @param aTxDesconto the txDesconto to set
     */
    public static void setTxDesconto(double aTxDesconto) {
        txDesconto = aTxDesconto;
    }
    
    @Override
    public double calcularMontanteTotalJuros() {
        double totalJuros = 0;
        double mensalidade = super.getMontante() / super.getPrazo();
        double txJuroMensal = this.txJuro/100/12;
        double montanteEmprestimo = super.getMontante();
        
        if(super.getPrazo() <= 24) {
            while(montanteEmprestimo > 0) {
                totalJuros += (montanteEmprestimo * txJuroMensal) * 0.99;
                montanteEmprestimo -= mensalidade;
            }
        } else {
            while(montanteEmprestimo > 0) {
                totalJuros += montanteEmprestimo * txJuroMensal;
                montanteEmprestimo -= mensalidade;
            }
        }    
        return totalJuros;
    }
    
    @Override
    public double calcularMontanteAReceberPorCadaCredito() {
        if(super.getPrazo() > 24) {
            return calcularMontanteTotalJuros() + super.getMontante();
        } else {
            return calcularMontanteTotalJuros() + super.getMontante()*0.99;
        }        
    }
    
    @Override
    public String toString() {
        return String.format("%sJuros a pagar: %.2f\nMontante total imputado ao consumidor: %.2f\n", super.toString(), calcularMontanteTotalJuros(), calcularMontanteAReceberPorCadaCredito());
    }
}
