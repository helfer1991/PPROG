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
public class TrabalhadorContaPropria extends ContribuinteComRendimentos {
    private static double txRT = 0.03;
    private static double txOR1 = 0.02;
    private static double txOR2 = 0.05;
    private String profissao;
    private final String PROFISSAO_OMISSO = "não indicado";
    
    public TrabalhadorContaPropria(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR, RT);
        this.profissao = PROFISSAO_OMISSO;
    }
    
    public TrabalhadorContaPropria(String nome, String morada, int OR, int RT, String profissao) {
        super(nome, morada, OR, RT);
        this.profissao = profissao;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nProfissão: %s\nTotal de imposto a pagar: %.2f", super.toString(), this.profissao, (calcularImpostoOR() + calcularImpostoRT()));
    }

    @Override
    public double calcularImpostoOR() {
        if(getOR() > 50000) {
            return getOR()*txOR2;
        } else {
            return getOR()*txOR1;
        }
    }

    @Override
    public double calcularImpostoRT() {
        return txRT*getRT();
    }
    
}
