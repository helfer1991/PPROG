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
public class TrabalhadorContaOutrem extends ContribuinteComRendimentos {
    private static double txRT1 = 0.01;
    private static double txRT2 = 0.02;
    private static double txOR = 0.02;
    private String nomeEmpresa; //n é static, pq pode haver várias empresas, isto é, pode haver 2 instâncias c empresas diferentes
    private final String nomeEmpresa_OMISSO = "não indicado";
    
    public TrabalhadorContaOutrem(String nome, String morada, int OR, int RT) {
        super(nome, morada, OR, RT);
        this.nomeEmpresa = nomeEmpresa_OMISSO;
    }
    
    public TrabalhadorContaOutrem(String nome, String morada, int OR, int RT, String nomeEmpresa) {
        super(nome, morada, OR, RT);
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nNome da empresa: %s\nTotal de impostos a pagar: %.2f\n", super.toString(), this.nomeEmpresa, (calcularImpostoOR() + calcularImpostoRT()));
    }

    @Override
    public double calcularImpostoOR() {
        return txOR*getOR();
    }

    @Override
    public double calcularImpostoRT() {            
        if(getRT() <= 30000) {
            return txRT1*getRT();
        } else {
            return txRT2*getRT();
        }        
    }
    
}
