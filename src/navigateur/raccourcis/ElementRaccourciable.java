package navigateur.raccourcis;

import java.util.Date;

/**
 * Élément pouvant être pointé par un Raccourci.
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public abstract class ElementRaccourciable extends Element {

    /**
     *
     * @param path
     * @param name
     * @param creation
     * @param lastModified
     */
    public ElementRaccourciable(String path, String name, Date creation, Date lastModified) {
        super(path, name, creation, lastModified);
    }

}
