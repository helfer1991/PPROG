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
public abstract class Professor extends Pessoa {
    private static int salarioBase = 1500;
    
    public Professor(String nome, int id) {
        super(nome, id);
    }

    /**
     * @return the salarioBase
     */
    public static int getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param aSalarioBase the salarioBase to set
     */
    public static void setSalarioBase(int aSalarioBase) {
        salarioBase = aSalarioBase;
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }    
}
