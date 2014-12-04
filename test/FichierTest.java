/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guillaume
 */
public class FichierTest {
    
    public FichierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of lire method, of class Fichier.
     */
    @Test
    public void testLire() {
        System.out.println("lire");
        Fichier instance = new Fichier();
        String expResult = "";
        String result = instance.lire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ecrire method, of class Fichier.
     */
    @Test
    public void testEcrire() {
        System.out.println("ecrire");
        String contenu = "";
        Fichier instance = new Fichier();
        instance.ecrire(contenu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaille method, of class Fichier.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Fichier instance = new Fichier();
        int expResult = 0;
        int result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
