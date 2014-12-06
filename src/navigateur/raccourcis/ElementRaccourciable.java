package navigateur.raccourcis;

import java.util.Date;

/**
 *
 * @author owner
 */
public abstract class ElementRaccourciable extends navigateur.initial.Element {

    public ElementRaccourciable(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

}
