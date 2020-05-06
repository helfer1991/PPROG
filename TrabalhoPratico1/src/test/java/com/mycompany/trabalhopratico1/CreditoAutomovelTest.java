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
public class CreditoAutomovelTest {
    
    public CreditoAutomovelTest() {
    }

    /**
     * Test of calcularMontanteTotalJuros method, of class CreditoAutomovel.
     */
    @Test
    public void testCalcularMontanteTotalJuros() {
        System.out.println("calcularMontanteTotalJuros");
        CreditoAutomovel instance = new CreditoAutomovel("Ricardo", "Developer", 25000, 25);
        double expResult = 1625;
        double result = instance.calcularMontanteTotalJuros();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularMontanteAReceberPorCadaCredito method, of class CreditoAutomovel.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCredito() {
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        CreditoAutomovel instance = new CreditoAutomovel("Ricardo", "Developer", 25000, 25);
        double expResult = 26625;
        double result = instance.calcularMontanteAReceberPorCadaCredito();
        assertEquals(expResult, result);
    }
}
