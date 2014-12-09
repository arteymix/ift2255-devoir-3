package navigateur.raccourcis;

import java.util.Date;

/**
 * Élément abstrait qui peut soit être un ElementRaccourciable ou un Raccourci.
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public abstract class Element extends navigateur.initial.Element {

    /**
     *
     * @param path
     * @param name
     * @param creation
     * @param lastModified
     */
    public Element(String path, String name, Date creation, Date lastModified) {
        super(path, name, creation, lastModified);
    }

}
