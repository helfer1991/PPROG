/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.empregado;

import com.mycompany.utilitarios.Data;
import com.mycompany.utilitarios.Tempo;

/**
 *
 * @author Asus
 */
public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;
    
    private static final String PRIMEIRONOME_OMISSO = "sem primeiro nome";
    private static final String ULTIMONOME_OMISSO = "sem ultimo nome";
    private static int diasTrabalho = 5;
    
    public Empregado(String primeiroNome, String ultimoNome, int ano, int mes, int dia, int horas, int minutos, int segundos) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(ano, mes, dia);
        this.horaEntrada = new Tempo(horas, minutos, segundos);
        this.horaSaida = new Tempo(horas, minutos, segundos);
    }
    
    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);
    }
    
    public Empregado () {
        this.primeiroNome = PRIMEIRONOME_OMISSO;
        this.ultimoNome = ULTIMONOME_OMISSO;
        this.dataContrato = new Data();
        this.horaEntrada = new Tempo();
        this.horaSaida = new Tempo();
    }

    /**
     * @return the primeiroNome
     */
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     * @param primeiroNome the primeiroNome to set
     */
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    /**
     * @return the ultimoNome
     */
    public String getUltimoNome() {
        return ultimoNome;
    }

    /**
     * @param ultimoNome the ultimoNome to set
     */
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    /**
     * @return the dataContrato
     */
    public Data getDataContrato() {
//        return dataContrato;
        return new Data(dataContrato);
    }

    /**
     * @param dataContrato the dataContrato to set
     */
    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    /**
     * @return the horaEntrada
     */
    public Tempo getHoraEntrada() {
//        return horaEntrada;
        return new Tempo(horaEntrada);
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSaida
     */
    public Tempo getHoraSaida() {
//        return horaSaida;
        return new Tempo(horaSaida);
    }

    /**
     * @param horaSaida the horaSaida to set
     */
    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    public int tempoNaEmpresa() {
        Data dataEntrada = new Data(this.dataContrato);
        Data dataHoje = Data.dataAtual();
        return dataEntrada.diferenca(dataHoje);
    }
    
    public int calcularHorasSemanais() {
        return (this.horaEntrada.diferencaEmSegundos(this.horaSaida) * diasTrabalho) / 3600;
    }
    
    public String toString() {
        return String.format("Primeiro nome: %s\nUltimo nome: %s\nData do contrato: %s\nHora de entrada: %s\nHora de saida: %s\n\n", this.primeiroNome, this.ultimoNome, this.dataContrato, this.horaEntrada, this.horaSaida);
    }
}
