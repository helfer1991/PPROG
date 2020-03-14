/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl4;

/**
 *
 * @author HMCFB
 */
public class Utente {
    private String nome;
    private String genero;
    private int idade;
    private int peso;
    private double altura;
    private static int qtInstancias = 0;
    
    private static final String NOME_OMISSO = "anonimo";
    private static final String GENERO_OMISSO = "nao definido";
    private static final int IDADE_OMISSO = 0;
    private static final int PESO_OMISSO = 0;
    private static final double ALTURA_OMISSO = 1;
    
    public Utente() {
        this.nome = NOME_OMISSO;
        this.genero = GENERO_OMISSO;
        this.idade = IDADE_OMISSO;
        this.peso = PESO_OMISSO;
        this.altura = ALTURA_OMISSO;
        this.qtInstancias++;
    }
    
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.genero = GENERO_OMISSO;
        this.idade = idade;
        this.peso = PESO_OMISSO;
        this.altura = ALTURA_OMISSO;
        this.qtInstancias++;
    }
    
    public Utente(String nome, String genero, int idade, int peso, double altura) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.qtInstancias++;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String toString() {
        return String.format("Nome: %s\nGenero: %s\nIdade: %d anos\nPeso: %d kg\nAltura: %.1f mts\n", this.nome, this.genero, this.idade, this.peso, this.altura);
    }
    
    public int diferencaIdades(Utente outroUtente) {
        return Math.abs(this.idade - outroUtente.getIdade());
    }
    
    public double calcularIMC() {
        return this.peso/Math.pow(this.altura, 2);
    }
    
    public String grauObesidade() {
        double IMC = this.calcularIMC();
        
        if(IMC < 18) {
            return "Magro";
        } else if(IMC > 25) {
            return "Obeso";
        } else {
            return "Saudavel";
        }
    }
    
    public boolean checkSaudavel() {
        return this.grauObesidade().equalsIgnoreCase("Saudavel");
    }
    
    public int isMaisNovo(Utente outroUtente) {
        if(this.idade > outroUtente.getIdade()) {
            return 1;
        } else if (this.idade < outroUtente.getIdade()) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static int checkQtInstancias() {
        return qtInstancias;
    }
    
}
