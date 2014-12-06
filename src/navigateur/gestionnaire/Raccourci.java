package navigateur.gestionnaire;

import navigateur.raccourcis.*;
import java.util.Date;

/**
 *
 * @author owner
 */
public class Raccourci extends navigateur.raccourcis.Raccourci {

    public Raccourci(ElementRaccourciable element, String name, Date creation, Date lastModified, String path) {
        super(element, name, creation, lastModified, path);
        
        // on attache l'élément pointé au gestionnaire de raccourcis
        element.attacher(GestionnaireRaccourcis.getInstance());
    }

    @Override
    public int taille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
