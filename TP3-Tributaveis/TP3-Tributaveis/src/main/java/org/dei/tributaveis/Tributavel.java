/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.tributaveis;

/**
 *
 * @author HMCFB
 */
public interface Tributavel {
    public abstract float calcularImposto(); //para resolver o tipo de variavel retornado por veiculo e moradia para calcular imposto
    //tenho de implementar esta interface nas classes veiculo e moradia
}
