/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Asus
 */
public class CreditoHabitacaoTest {
    
    public CreditoHabitacaoTest() {
    }

    /**
     * Test of calcularMontanteTotalJuros method, of class CreditoHabitacao.
     */
    @Test
    public void testCalcularMontanteTotalJuros() {
        System.out.println("calcularMontanteTotalJuros");
        CreditoHabitacao instance = new CreditoHabitacao("Helder", "Developer", 120000, 240);
        double expResult = 13255;
        double result = instance.calcularMontanteTotalJuros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcularMontanteAReceberPorCadaCredito method, of class CreditoHabitacao.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCredito() {
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        CreditoHabitacao instance = new CreditoHabitacao("Helder", "Developer", 120000, 240);
        double expResult = 133255;
        double result = instance.calcularMontanteAReceberPorCadaCredito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
