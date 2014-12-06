package navigateur.raccourcis;

import java.util.Date;

/**
 * Élément pouvant être pointé par un Raccourci.
 * 
 * @author owner
 */
public abstract class ElementRaccourciable extends Element {

    public ElementRaccourciable(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

    @Override
    public abstract int taille();
}
