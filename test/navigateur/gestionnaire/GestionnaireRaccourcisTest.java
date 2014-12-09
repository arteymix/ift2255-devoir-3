package navigateur.gestionnaire;

import java.util.Date;
import navigateur.raccourcis.Fichier;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier */
public class GestionnaireRaccourcisTest {

    /**
     * Test of getInstance method, of class GestionnaireRaccourcis.
     */
    @Test
    public void testGetInstance() {

        // singleton
        assertSame(GestionnaireRaccourcis.getInstance(), GestionnaireRaccourcis.getInstance());
    }

    /**
     * Test of updateDelete method, of class GestionnaireRaccourcis.
     */
    @Test
    public void testUpdateDelete() {

        Fichier fichier = new Fichier("", "test.java", new Date(), new Date());
        Raccourci raccourci = new Raccourci(fichier, "shortcut vers test.java", new Date(), new Date(), "");

        assertTrue(GestionnaireRaccourcis.getInstance().getRaccourcis().contains(raccourci));

        fichier.delete();

        assertFalse(GestionnaireRaccourcis.getInstance().getRaccourcis().contains(raccourci));
    }

}
