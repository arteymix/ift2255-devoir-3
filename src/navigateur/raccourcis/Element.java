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

    public Element(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

}
