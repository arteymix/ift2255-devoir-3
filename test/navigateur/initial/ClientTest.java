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
public class ClientTest {

    /**
     * Test of getTailleDossierActif method, of class Client.
     */
    @Test
    public void testGetTailleDossierActif() {

        Client client = new Client();

        Dossier dossier = new Dossier("/", new Date(), new Date(), "test");
        
        dossier.add(new Fichier("test1", new Date(), new Date(), ""));
        dossier.add(new Fichier("test2", new Date(), new Date(), ""));
        dossier.add(new Fichier("test3", new Date(), new Date(), ""));
        dossier.add(new Fichier("test4", new Date(), new Date(), ""));
        dossier.add(new Fichier("test5", new Date(), new Date(), ""));
        
        dossier.activate();
        
        assertSame(dossier, Navigateur.getInstance().getDossierActif());

        assertEquals(6, client.getTailleDossierActif());
    }

}
