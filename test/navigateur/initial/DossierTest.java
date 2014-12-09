package navigateur.initial;

import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class DossierTest {

    /**
     * Test of updateDelete method, of class Dossier.
     */
    @Test
    public void testUpdateDelete() {

        Dossier dossier = new Dossier("/", new Date(), new Date(), "");
        Fichier fichier = new Fichier("test.java", new Date(), new Date(), "");

        dossier.add(fichier);

        Assert.assertTrue(dossier.getElements().contains(fichier));

        fichier.delete();

        Assert.assertFalse(dossier.getElements().contains(fichier));
    }

    /**
     * Test of add method, of class Dossier.
     */
    @Test
    public void testAdd() {

        Dossier dossier = new Dossier("/", new Date(), new Date(), "");
        Fichier fichier = new Fichier("test.java", new Date(), new Date(), "");

        dossier.add(fichier);

        Assert.assertTrue(dossier.getElements().contains(fichier));
        Assert.assertEquals("/test.java", fichier.getPath());
    }

    @Test
    public void testAddDossier() {

        Dossier dossier = new Dossier("/", new Date(), new Date(), "");
        Dossier dossier2 = new Dossier("test", new Date(), new Date(), "");

        dossier.add(dossier2);

        Assert.assertTrue(dossier.getElements().contains(dossier2));
        Assert.assertEquals("/test", dossier2.getPath());
    }

    /**
     * Test of activate method, of class Dossier.
     */
    @Test
    public void testActivate() {

        Dossier dossier = new Dossier("/", new Date(), new Date(), "");

        dossier.activate();

        Assert.assertSame(dossier, Navigateur.getInstance().getDossierActif());
    }

}
