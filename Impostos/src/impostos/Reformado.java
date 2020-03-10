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
public class Reformado extends ContribuinteComRendimentos {
    private static double txRT = 0.01;
    private static double txOR = 0.03;
    
    public Reformado(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR, RT);
    }
    
    @Override
    public String toString() {
        return String.format("%s\nTotal de impostos a pagar: %.2f\n", super.toString(), (calcularImpostoOR() + calcularImpostoRT()));
    }

    @Override
    public double calcularImpostoOR() {
        return getOR()*txOR;
    }

    @Override
    public double calcularImpostoRT() {
        return getRT()*txRT;
    }
    
}
