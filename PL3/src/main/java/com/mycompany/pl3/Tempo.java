/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl3;

/**
 *
 * @author HMCFB
 */
public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;
    
    private static final int HORAS_OMISSO = 0;
    private static final int MINUTOS_OMISSO = 0;
    private static final int SEGUNDOS_OMISSO = 0;
    
    public Tempo() {
        this.horas = HORAS_OMISSO;
        this.minutos = MINUTOS_OMISSO;
        this.segundos = SEGUNDOS_OMISSO;
    }
    
    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Tempo(int horas) {
        this.horas = horas;
        this.minutos = MINUTOS_OMISSO;
        this.segundos = SEGUNDOS_OMISSO;
    }
    
    public Tempo(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = SEGUNDOS_OMISSO;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public String toString() {
        return String.format("%d:%d:%d\n", this.horas, this.minutos, this.segundos);
    }
    
    public void acrescentarSegundo() {
        if(this.segundos == 59) {
            this.segundos = 0;
            if(this.minutos == 59) {
                this.minutos = 0;
                if(this.horas == 23) {
                    this.horas = 0;
                } else {
                    this.horas++;
                }
            } else {
                this.minutos++;
            }
        } else {
            this.segundos++;
        }
    }
    
//    public int minutosToSeg() {
//        return this.minutos*60;
//    }
//    
//    public int horasToSeg() {
//        return this.horas*3600;
//    }
    
    public int tudoParaSeg() {
        //int totalSeg = this.segundos + minutosToSeg() + horasToSeg();
        int totalSeg = this.segundos + this.minutos*60 + this.horas*3600;
        
        return totalSeg;
    }
    
    public int somarSeg() {        
        return tudoParaSeg() + 1;
    }
    
    public boolean isMaior(Tempo outroTempo) {
        return this.somarSeg() > outroTempo.somarSeg();
    }
    
    public boolean isMaior(int h, int m, int s) {
        return this.somarSeg() > (h*3600 + m*60 + s);
    }
    
    public int calcularDiferenca(Tempo outroTempo) {
        return Math.abs(this.tudoParaSeg() - outroTempo.tudoParaSeg());
    }
    
    public Tempo calcularDiferencaObjeto(Tempo outroTempo) {
        int totalSegundos = calcularDiferenca(outroTempo);
        
        int hh = totalSegundos/3600;
        int mm = (totalSegundos%3600)/60;
        int ss = (totalSegundos%3600)%60;
        
        Tempo t3 = new Tempo(hh, mm, ss);
        return t3;
    }
}
