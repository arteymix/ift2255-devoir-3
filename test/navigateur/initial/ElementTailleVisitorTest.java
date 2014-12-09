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
public class ElementTailleVisitorTest {

    /**
     * Test of visit method, of class ElementTailleVisitor.
     */
    @Test
    public void testGetVisitsFromEmptyFolder() {

        Dossier dossier = new Dossier("/", new Date(), new Date(), "");

        ElementTailleVisitor visitor = new ElementTailleVisitor();

        dossier.accept(visitor);

        // 1 dossier
        Assert.assertEquals(1, visitor.getVisites());
    }

    /**
     * Test of visit method, of class ElementTailleVisitor.
     */
    @Test
    public void testGetVisits() {

        Dossier dossier = new Dossier("/", new Date(), new Date(), "");

        dossier.add(new Fichier("test1", new Date(), new Date(), ""));
        dossier.add(new Fichier("test2", new Date(), new Date(), ""));
        dossier.add(new Fichier("test3", new Date(), new Date(), ""));
        dossier.add(new Fichier("test4", new Date(), new Date(), ""));
        dossier.add(new Fichier("test5", new Date(), new Date(), ""));

        ElementTailleVisitor visitor = new ElementTailleVisitor();

        dossier.accept(visitor);

        // 5 fichiers et 1 dossier
        Assert.assertEquals(6, visitor.getVisites());
    }

}
