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

    public ElementRaccourciable(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

}
