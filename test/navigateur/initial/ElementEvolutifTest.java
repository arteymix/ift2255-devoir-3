package navigateur.initial;

import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class ElementEvolutifTest {

    /**
     * Test of evoluer method, of class ElementEvolutif.
     */
    @Test
    public void testEvoluer() {

        Fichier fichier = new Fichier("", "", new Date(), new Date());
        ElementEvolutif fichierEvolutif = new ElementEvolutif(fichier);

        assertEquals(fichierEvolutif.getName(), fichier.getName());

        fichierEvolutif.setName("test2.java");
        assertEquals("test2.java", fichierEvolutif.getName());

        fichierEvolutif.evoluer();
    }

}
