package navigateur.initial;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class FichierTest {

    /**
     * Test of accept method, of class Fichier.
     */
    @Test
    public void testAccept() {

        ElementTailleVisitor visitor = new ElementTailleVisitor();

        Fichier fichier = new Fichier("", new Date(), new Date(), "");
        fichier.accept(visitor);

        assertEquals(1, visitor.getVisites());
    }

}
