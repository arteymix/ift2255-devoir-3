package navigateur.initial;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author guillaume
 */
public class ElementEvolutifTest {

    /**
     * Test of evoluer method, of class ElementEvolutif.
     */
    @Test
    public void testEvoluer() {
        System.out.println("evoluer");

        Fichier fichier = new Fichier("", new Date(), new Date(), "");
        ElementEvolutif fichierEvolutif = new ElementEvolutif(fichier);

        Assert.assertEquals(fichierEvolutif.getName(), fichier.getName());
        
        fichierEvolutif.evoluer();
    }

}
