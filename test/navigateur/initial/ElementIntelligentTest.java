/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigateur.initial;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guillaume
 */
public class ElementIntelligentTest {

    /**
     * Test of proposerAmelioration method, of class ElementIntelligent.
     */
    @Test
    public void testProposerAmelioration() {

        Fichier fichier = new Fichier("test.java", "/", new Date(), new Date());
        ElementIntelligent fichierEvolutif = new ElementIntelligent(fichier);

        assertEquals(fichierEvolutif.getName(), fichier.getName());

        fichierEvolutif.proposerAmelioration();
    }

    /**
     * Test of autoEvaluate method, of class ElementIntelligent.
     */
    @Test
    public void testAutoEvaluate() {

        Fichier fichier = new Fichier("test.java", "/", new Date(), new Date());
        ElementIntelligent fichierEvolutif = new ElementIntelligent(fichier);

        assertEquals(fichierEvolutif.getName(), fichier.getName());
        
        fichierEvolutif.setName("test2.java");
        assertEquals("test2.java", fichierEvolutif.getName());

        fichierEvolutif.autoEvaluate();
    }

}
