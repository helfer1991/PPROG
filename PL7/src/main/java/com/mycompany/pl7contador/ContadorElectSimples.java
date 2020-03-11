/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl7contador;

/**
 *
 * @author HMCFB
 */
public class ContadorElectSimples extends ContadorEle {
    private static double tarifa1 = 0.13;
    private static double tarifa2 = 0.16;
    private double potenciaContratada; //e de instancia, nao de classe, logo nao e static
    
    public ContadorElectSimples(int consumo, String nomeCliente, double potenciaContratada) {
        super(consumo, nomeCliente);
        this.potenciaContratada = potenciaContratada;
    }
    
    /**
     * @return the potenciaContratada
     */
    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    /**
     * @param potenciaContratada the potenciaContratada to set
     */
    public void setPotenciaContratada(double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }
    
    @Override
    public double calcularConsumoMes() {
        if(getPotenciaContratada() < 6.9) {
            return getConsumo()*tarifa1;
        } else {
            return getConsumo()*tarifa2;
        }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}
