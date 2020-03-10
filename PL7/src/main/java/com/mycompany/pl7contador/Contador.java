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
public abstract class Contador {
    private int consumo;
    private final int CONSUMO_OMISSO = 0;
    private String id; //para distinguir os contadores de gás e de eletricidade. não é static, pq pode haver id de gás e id de. e de instancia
    private final String ID_OMISSO = "0";
    private String nomeCliente;
    private final String NOMECLIENTE_OMISSO = "anonimo";
    
    public Contador(String id, int consumo, String nomeCliente) {
        this.id = id;
        this.consumo = consumo;
        this.nomeCliente = nomeCliente;
    }
    
    public Contador() {
        this.id = ID_OMISSO;
        this.consumo = CONSUMO_OMISSO;
        this.nomeCliente = NOMECLIENTE_OMISSO;
    }
    
    public Contador(String id) {
        this.id = id;
        this.consumo = CONSUMO_OMISSO;
        this.nomeCliente = NOMECLIENTE_OMISSO;
    }
    
    public Contador(int consumo) {
        this.id = ID_OMISSO;
        this.consumo = consumo;
        this.nomeCliente = NOMECLIENTE_OMISSO;
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

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
   
    @Override
    public String toString() {
        return String.format("id: %s\nConsumo: %d\nNome do cliente: %s\n", this.id, this.consumo, this.nomeCliente);
    }
    
    public abstract double calcularConsumoMes(); //aqui sera o polimorfismo
    
}
