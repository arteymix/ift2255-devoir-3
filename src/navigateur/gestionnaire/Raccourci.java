package navigateur.gestionnaire;

import navigateur.raccourcis.*;
import java.util.Date;

/**
 * Cette implantation de Raccourci attache le gestionnaire de raccourci à titre
 * de DeleteObserver.
 * 
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Raccourci extends navigateur.raccourcis.Raccourci {

    /**
     *
     * @param element
     * @param name
     * @param creation
     * @param lastModified
     * @param path
     */
    public Raccourci(ElementRaccourciable element, String name, Date creation, Date lastModified, String path) {
        super(element, path, name, creation, lastModified);

        // ajoute le raccourci nouvellement créé au gestionnaire
        GestionnaireRaccourcis.getInstance().getRaccourcis().add(this);
        
        // on attache l'élément pointé au gestionnaire de raccourcis
        element.attachDelete(GestionnaireRaccourcis.getInstance());
    }

}
