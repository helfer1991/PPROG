/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl7;

/**
 *
 * @author Asus
 */
public class ContadorGas extends Contador {
    private static double custo = 0.8;
    private static int contadoresGasQt = 0; //é static, não haverá distinção com a outra classe de contadores de eletricidade, pq aí terá outra variável
    
    public ContadorGas(int consumo, double custo) {
        super(consumo);
        this.custo = custo;
        contadoresGasQt++;
    }
    
    @Override
    public double calcularConsumoMes() {
        return custo*getConsumo();
    }
}
