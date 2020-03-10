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
public abstract class Contador {
    private int consumo;
    private final int CONSUMO_OMISSO = 0;
    private String id; //para distinguir os contadores de gás e de eletricidade. não é static, pq pode haver id de gás e id de eletricidade
    private final String ID_OMISSO = "0";
    
    public Contador(String id, int consumo) {
        this.id = id;
        this.consumo = consumo;
    }
    
    public Contador() {
        this.id = ID_OMISSO;
        this.consumo = CONSUMO_OMISSO;
    }
    
    public Contador(String id) {
        this.id = id;
        this.consumo = CONSUMO_OMISSO;
    }
    
    public Contador(int consumo) {
        this.id = ID_OMISSO;
        this.consumo = consumo;
    }

    /**
     * @return the consumo
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format("id: %s\nConsumo: %d\n", this.id, this.consumo);
    }
    
    public abstract double calcularConsumoMes();
    
}
