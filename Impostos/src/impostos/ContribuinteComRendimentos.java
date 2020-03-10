/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos;

/**
 *
 * @author Asus
 */
public abstract class ContribuinteComRendimentos extends Contribuinte {
    private static int RT;
    private static int RT_OMISSAO = 0;
    
    public ContribuinteComRendimentos(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR);
        this.RT = RT;
    }
    
    public ContribuinteComRendimentos(String nome, String morada, int OR) {
        super(nome, morada, OR);
        this.RT = RT_OMISSAO;
    }

    /**
     * @return the RT
     */
    public static double getRT() {
        return RT;
    }

    /**
     * @param aRT the RT to set
     */
    public static void setRT(int aRT) {
        RT = aRT;
    }
    
    public String toString() {
        return String.format("%s\nRendimentos do trabalho: %d\n", super.toString(), this.RT);
    }
    
    @Override
    public abstract double calcularImpostoOR();
    
    @Override
    public abstract double calcularImpostoRT();
}
