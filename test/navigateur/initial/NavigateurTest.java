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
public class NavigateurTest {

    /**
     * Test of getInstance method, of class Navigateur.
     */
    @Test
    public void testGetInstance() {

        Navigateur result = Navigateur.getInstance();

        // Respect du singleton
        assertSame(Navigateur.getInstance(), Navigateur.getInstance());
    }

    /**
     * Test of updateActivate method, of class Navigateur.
     */
    @Test
    public void testUpdateActivate() {

        Dossier dossier = new Dossier("/", new Date(), new Date());

        dossier.activate();

        assertSame(dossier, Navigateur.getInstance().getDossierActif());
    }

    /**
     * Test of updateClose method, of class Navigateur.
     */
    @Test
    public void testUpdateClose() {

        Dossier dossier = new Dossier("/", new Date(), new Date());

        dossier.ouvrir();

        assertTrue(Navigateur.getInstance().getDossiersOuverts().contains(dossier));

        dossier.fermer();

        assertFalse(Navigateur.getInstance().getDossiersOuverts().contains(dossier));
    }

    /**
     * Test of updateOpen method, of class Navigateur.
     */
    @Test
    public void testUpdateOpen() {
        Dossier dossier = new Dossier("/", new Date(), new Date());

        dossier.ouvrir();

        assertTrue(Navigateur.getInstance().getDossiersOuverts().contains(dossier));
    }

    /**
     * Test of updateDelete method, of class Navigateur.
     */
    @Test
    public void testUpdateDelete() {

        Dossier dossier = new Dossier("", new Date(), new Date());

        dossier.ouvrir();

        assertTrue(Navigateur.getInstance().getDossiersOuverts().contains(dossier));

        dossier.delete();

        assertFalse(Navigateur.getInstance().getDossiersOuverts().contains(dossier));
    }

}
