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
public class ContadorElecBi extends ContadorEle {
    private static double tarifa1 = 0.066;
    private static double tarifa2 = 0.14;
    private int consumo2;
    private final int CONSUMO2_OMISSO = 0;
    
    public ContadorElecBi(int consumo, int consumo2, String nomeCliente) {
        super(consumo, nomeCliente);
        this.consumo2 = consumo2;
    }
    
    public ContadorElecBi(int consumo, String nomeCliente) {
        super(consumo, nomeCliente);
        this.consumo2 = CONSUMO2_OMISSO;
    }
    
    /**
     * @return the consumo2
     */
    public int getConsumo2() {
        return consumo2;
    }

    /**
     * @param consumo2 the consumo2 to set
     */
    public void setConsumo2(int consumo2) {
        this.consumo2 = consumo2;
    }
    
    @Override
    public double calcularConsumoMes() {
        return getConsumo()*tarifa1 + consumo2*tarifa2;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}
