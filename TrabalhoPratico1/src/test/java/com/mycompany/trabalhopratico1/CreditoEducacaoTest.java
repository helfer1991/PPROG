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
public class CreditoEducacaoTest {
    
    public CreditoEducacaoTest() {
    }

    /**
     * Test of calcularMontanteTotalJuros method, of class CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteTotalJuros() {
        System.out.println("calcularMontanteTotalJuros");
        CreditoEducacao instance = new CreditoEducacao("Mafalda", "Business Manager", 18000, 60, 24);
        double expResult = 1275;
        double result = instance.calcularMontanteTotalJuros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMontanteAReceberPorCadaCredito method, of class CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCredito() {
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        CreditoEducacao instance = new CreditoEducacao("Mafalda", "Business Manager", 18000, 60, 24);
        double expResult = 19275;
        double result = instance.calcularMontanteAReceberPorCadaCredito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
