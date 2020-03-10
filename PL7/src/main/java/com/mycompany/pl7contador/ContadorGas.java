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
public class ContadorGas extends Contador {
    private static double custo = 0.8; //atributo de classe, tal como o que esta em baixo
    private static int contadoresGasQt = 0; //é static, não haverá distinção com a outra classe de contadores de eletricidade, pq aí terá outra variável
    private static String prefixo = "GAS-";
    
    public ContadorGas(int consumo, String nomeCliente) {
        super(prefixo+contadoresGasQt, consumo, nomeCliente);
        contadoresGasQt++;
    }
    
//    public void determinarId() {
//        prefixo = prefixo + (this.contadoresGasQt);
//    }
    
    @Override
    public double calcularConsumoMes() {
        return custo*getConsumo();
    }
    
    @Override
    public String toString() {
        return String.format("ID: %s\nCusto: %.2f\nNome cliente: %s\n", prefixo+contadoresGasQt, calcularConsumoMes(), getNomeCliente());
    }
}
