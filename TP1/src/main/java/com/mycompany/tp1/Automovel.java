/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp1;

/**
 *
 * @author HMCFB
 */
public class Automovel  {
    private String matricula;
    private String marca;
    private int cilindrada;
    
    private static final String MATRICULA_OMISSAO = "sem matricula";    
    private static final String MARCA_OMISSAO = "sem marca";    
    private static final int CILINDRADA_OMISSAO = 0;
    private static int qtInstancias = 0; //variavel de classe, logo fica static
    
    public Automovel() {
        this.matricula = MATRICULA_OMISSAO;
        this.marca = MARCA_OMISSAO;
        this.cilindrada = CILINDRADA_OMISSAO;
        this.qtInstancias++;
    }
    
    public Automovel(String matricula) {
        this.matricula = matricula;
        this.marca = MARCA_OMISSAO;
        this.cilindrada = CILINDRADA_OMISSAO;
        this.qtInstancias++;
    }
    
    public Automovel(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = CILINDRADA_OMISSAO;
        this.qtInstancias++;
    }
    
    public Automovel(String matricula, String marca, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.qtInstancias++;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String toString() {
        return String.format("Automovel com matricula %s e um %s e tem cilindrada de %dcc\n", this.matricula, this.marca, this.cilindrada);
    }
    
    public int diferencaCilindrada(Automovel outroAutomovel) {
        return this.cilindrada - outroAutomovel.getCilindrada();
    }
    
    public boolean cilindradaIsMaior(Automovel outroAutomovel) {
        return this.cilindrada > outroAutomovel.getCilindrada();
    }
    
    public boolean cilindradaMaior(int valor) {
        return this.cilindrada > valor;
    }
    
    public int getInstancias() {
        return qtInstancias;
    }
    
}
