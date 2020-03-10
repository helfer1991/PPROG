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
public class Desempregado extends Contribuinte {
    private int mesesParagem;
    private final int MESESPARAGEM_OMISSAO = 0;
    private static double txOR = 0.02;
    
    public Desempregado(String nome, String morada, int OR) {
        super(nome, morada, OR);
        this.mesesParagem = MESESPARAGEM_OMISSAO;
    }
    
    public Desempregado(String nome, String morada, int OR, int mesesParagem) {
        super(nome, morada, OR);
        this.mesesParagem = mesesParagem;
    }

    /**
     * @return the mesesParagem
     */
    public int getMesesParagem() {
        return mesesParagem;
    }

    /**
     * @param mesesParagem the mesesParagem to set
     */
    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }
    
    /**
     * @return the txOR
     */
    public static double getTxOR() {
        return txOR;
    }

    /**
     * @param aTxOR the txOR to set
     */
    public static void setTxOR(double aTxOR) {
        txOR = aTxOR;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nMeses de paragem: %d\nTotal de impostos a pagar: %.2f", super.toString(), this.mesesParagem, calcularImpostoOR());
    }

    @Override
    public double calcularImpostoOR() {
        return getOR()*getTxOR();
    }

    @Override
    public double calcularImpostoRT() {
        return 0;
    }
}
