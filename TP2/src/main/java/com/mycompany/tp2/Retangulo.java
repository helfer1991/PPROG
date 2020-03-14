/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp2;

/**
 *
 * @author HMCFB
 */
public class Retangulo extends Figura {
    private double comprimento;
    private double largura;

    private static final int COMPRIMENTO_POR_OMISSAO = 2;
    private static final int LARGURA_POR_OMISSAO = 1;

    public Retangulo(double comprimento, double largura, String cor) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public Retangulo(double comprimento, double largura) {
        super();
        this.comprimento = comprimento;
        this.largura = largura;           
    }

    public Retangulo(String cor) {
        super(cor);
        comprimento = COMPRIMENTO_POR_OMISSAO;
        largura = LARGURA_POR_OMISSAO;
    }

    public Retangulo() {
        super();
        comprimento = COMPRIMENTO_POR_OMISSAO;
        largura = LARGURA_POR_OMISSAO;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return String.format("Retangulo: comprimento = %.1f largura = %.1f %s",
                              comprimento, largura, super.toString());
    }
    
    @Override
    public double calcularArea() {
        return this.comprimento*this.largura;
    }
    
}
