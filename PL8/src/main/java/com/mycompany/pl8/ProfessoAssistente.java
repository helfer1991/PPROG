/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl8;

/**
 *
 * @author HMCFB
 */
public class ProfessoAssistente extends Professor implements Pagamentos {
    private static double majoracao = 0;
    
    public ProfessoAssistente(String nome, int id) {
        super(nome, id);
    }    
    
    /**
     * @return the majoracao
     */
    public static double getMajoracao() {
        return majoracao;
    }

    /**
     * @param aMajoracao the majoracao to set
     */
    public static void setMajoracao(double aMajoracao) {
        majoracao = aMajoracao;
    }
    
    @Override
    public double calcularPagamento() {
        return (1+majoracao)*getSalarioBase();
    }
    
    @Override
    public String toString() {
        return String.format("%sSalario: %.2f\n", super.toString(), calcularPagamento());
    }

}
