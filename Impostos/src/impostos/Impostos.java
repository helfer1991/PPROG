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
public class Impostos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contribuinte[] cashCow = new Contribuinte[12];
        
        cashCow[0] = new TrabalhadorContaOutrem("Manuel", "Porto", 850, 300, "Toyota");
        cashCow[1] = new TrabalhadorContaOutrem("Renato", "Braga", 25000, 1200, "Cenas, lda");
        cashCow[2] = new TrabalhadorContaPropria("Helder", "Porto", 15000, 9000, "Trader");
        cashCow[3] = new TrabalhadorContaPropria("José", "Ermesinde", 20000, 25000, "Developer");
        cashCow[4] = new Reformado("Maria", "Porto", 600, 200);
        cashCow[5] = new Reformado("Celestino", "Porto", 500, 200);
        cashCow[6] = new Desempregado("Marley", "Porto", 500, 12);
        cashCow[7] = new Desempregado("Pepa", "Porto", 200, 25);
        
        //c
        /*for(int i = 0; i < cashCow.length; i++) {
            System.out.println(cashCow[i]);
        }*/
        
        //d
        for(int i = 0; i < 8; i++) {
            if(cashCow[i] instanceof Desempregado) {
                System.out.printf("Nome: %s\nImposto extraordinário: %.2f\n", cashCow[i].getNome(), cashCow[i].calcularImpostoOR());   
            }            
        }
        
        //e
        Desempregado.setTxOR(0.1);
        
        //f
        for(int i = 0; i < 8; i++) {
            if(cashCow[i] instanceof Desempregado) {
                System.out.printf("Nome: %s\nImposto extraordinário: %.2f\n", cashCow[i].getNome(), cashCow[i].calcularImpostoOR());   
            }            
        }
    }    
}
