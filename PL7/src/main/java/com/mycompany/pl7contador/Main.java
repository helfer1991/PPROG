/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl7contador;

/**
 *
 * @author HMCFB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContadorGas cg1 = new ContadorGas(120, "Helder");
        ContadorGas cg2 = new ContadorGas(150, "Isabel");
        ContadorElectSimples ces1 = new ContadorElectSimples(140, "Mafalda", 7.4);
        ContadorElecBi ceb1 = new ContadorElecBi(90, 135, "Manuel");
        
        Object[] array = new Object[10];
        array[0] = cg1;
        array[1] = ces1;
        array[2] = ceb1;
        array[3] = cg2;
        
        //b
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                System.out.println(array[i]);
            }            
        }
        System.out.printf("ID do contador: %s\nNome do cliente: %s\n", cg1.getId(), cg1.getNomeCliente());
    }
    
}
