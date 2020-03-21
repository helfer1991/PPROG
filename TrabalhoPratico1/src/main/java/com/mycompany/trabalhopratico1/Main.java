/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico1;

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
        CreditoHabitacao c1 = new CreditoHabitacao("Helder", "Developer", 120000, 240);
        CreditoHabitacao c2 = new CreditoHabitacao("Renato", "Dentista", 200000, 300);
        CreditoEducacao c3 = new CreditoEducacao("Mafalda", "Business Manager", 18000, 60, 24);
        CreditoEducacao c4 = new CreditoEducacao("David", "Estudante", 5000, 36, 12);
        CreditoAutomovel c5 = new CreditoAutomovel("Andreia", "Fisioterapeuta", 16000, 120);
        CreditoAutomovel c6 = new CreditoAutomovel("Ricardo", "Developer", 25000, 48);
        
        //b
        CreditoBancario[] arrayCreditos = new CreditoBancario[12];
        arrayCreditos[0] = c1;
        arrayCreditos[1] = c2;
        arrayCreditos[2] = c3;
        arrayCreditos[3] = c4;
        arrayCreditos[4] = c5;
        arrayCreditos[5] = c6;
        
        //c.i
        for(int i = 0; i < arrayCreditos.length; i++) {
            if(arrayCreditos[i] != null) {
                System.out.printf("Nome: %s\nMontante a receber pelo banco: %.2f\n\n", arrayCreditos[i].getNomeCliente(), arrayCreditos[i].calcularMontanteAReceberPorCadaCredito());
            }
        }
        
        System.out.println();
        
        //c.ii
        for(int i = 0; i < arrayCreditos.length; i++) {
            if(arrayCreditos[i] != null) {
                System.out.printf("Nome: %s\nJuros a pagar: %.2f\n\n", arrayCreditos[i].getNomeCliente(), arrayCreditos[i].calcularMontanteTotalJuros());
            }
        }
        
        //d
        System.out.printf("\nQuantidade de instancias criadas: %d\n\n", CreditoBancario.getQtInstancias());
        
        //e
        double totalJuros = 0;
        double totalRecebidoPeloBanco = 0;
        
        for(int i = 0; i < arrayCreditos.length; i++) {
            if(arrayCreditos[i] != null) {
                totalJuros += arrayCreditos[i].calcularMontanteTotalJuros();
                totalRecebidoPeloBanco += arrayCreditos[i].calcularMontanteAReceberPorCadaCredito();
            }
        }
        
        System.out.printf("Total de juros pagos pelos clientes: %.2f\nMontante total recebido pelo banco, incluindo juros: %.2f\n", totalJuros, totalRecebidoPeloBanco);
    }
    
}