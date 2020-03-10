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
public abstract class Contribuinte {
    private String nome;
    private String morada;
    private int OR;
    private final int OR_OMISSAO = 0;
    //atributo de classe é static. exemplo são as taxas de rendimento, que devem estar definidas em cada classe e não em instâncias. São específicas para cada tipo
    //empresa é um atributo não static. nem toda a gente trabalha numa empresa, especialmente desempregados.
    //posso ter uma classe para os rendimentos do trabalho
    //metodos que acedam a variaveis static têm de ser static
    
    public Contribuinte(String nome, String morada, int OR) {
        this.nome = nome;
        this.morada = morada;
        this.OR = OR;
    }
    
    public Contribuinte(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        this.OR = OR_OMISSAO;
    }
    
    public Contribuinte(int OR) {
        this.nome = "Anónimo";
        this.morada = "Não definida";
        this.OR = OR;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the OR
     */
    public int getOR() {
        return OR;
    }

    /**
     * @param OR the OR to set
     */
    public void setOR(int OR) {
        this.OR = OR;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s\nMorada: %s\nOutros rendimentos: %d\n", this.nome, this.morada, this.OR);
    }
    
    public abstract double calcularImpostoOR();
    
    public abstract double calcularImpostoRT();
    
}
