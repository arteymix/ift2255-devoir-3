package navigateur.gestionnaire;

import navigateur.raccourcis.*;
import java.util.Date;

/**
 * Cette implantation de Raccourci attache le gestionnaire de raccourci à titre
 * de DeleteObserver.
 * 
 * @author owner
 */
public class Raccourci extends navigateur.raccourcis.Raccourci {

    public Raccourci(ElementRaccourciable element, String name, Date creation, Date lastModified, String path) {
        super(element, name, creation, lastModified, path);

        // on attache l'élément pointé au gestionnaire de raccourcis
        element.attachDelete(GestionnaireRaccourcis.getInstance());
    }

}
