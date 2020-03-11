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
public abstract class ContadorEle extends Contador {
    private static int contadorElect = 0;
    private static String prefixo = "Elect-";
    
    public ContadorEle(int consumo, String nomeCliente) {
        super(prefixo+contadorElect, consumo, nomeCliente); //erro aqui no calculo do contaodr de eletricidade
        contadorElect++;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public abstract double calcularConsumoMes();
}
