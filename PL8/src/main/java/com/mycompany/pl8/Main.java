/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl8;

/**
 *
 * @author HMCFB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        Pessoa[] pessoas = new Pessoa[10];
        
        ProfessoAssistente p1 = new ProfessoAssistente("Jorge", 123456789);
        ProfessorAdjunto p2 = new ProfessorAdjunto("Mario", 234567891);
        ProfessorCoordenador p3 = new ProfessorCoordenador("Abel", 345678901);
        AlunoBolseiro p4 = new AlunoBolseiro("Maria", 987654321, 1234);
        AlunoBolseiro p5 = new AlunoBolseiro("Mafalda", 102938456, 9876);
        AlunoNaoBolseiro p6 = new AlunoNaoBolseiro("Helder", 123498765, 2345);
        
        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;
        pessoas[4] = p5;
        pessoas[5] = p6;
        
        //b
        for(int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] instanceof Professor) {
                System.out.printf("Nome: %s\nCategoria: %s\n", pessoas[i].getNome(), pessoas[i].calcularPagamento());
            }
        }
    }
    
}
