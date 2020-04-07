/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Asus
 */
public class ComparatorTrabalhadorTest {
    
    public ComparatorTrabalhadorTest() {
    }

    /**
     * Test of compare method, of class ComparatorTrabalhador.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);
        TrabalhadorHora th2 = new TrabalhadorHora("Diogo", 300, 15.5f);
        
        List<Trabalhador> expected = new ArrayList<>();
        expected.add(th);
        expected.add(tc);
        expected.add(tp);
        expected.add(th2);
        
        List<Trabalhador> result = new ArrayList<>();
        result.add(tc);
        result.add(tp);
        result.add(th);
        result.add(th2);
        
        Collections.sort(result, new ComparatorTrabalhador());
        assertArrayEquals(expected.toArray(), result.toArray());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
