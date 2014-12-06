package navigateur.raccourcis;

import java.util.Date;

/**
 * Raccourci qui pointe vers un ElementRaccourciable.
 *
 * @author owner
 */
public class Raccourci extends Element {

    /**
     * Élément pointé par le raccourci.
     */
    private final ElementRaccourciable elementPointe;

    public Raccourci(ElementRaccourciable element, String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
        this.elementPointe = element;
    }

    public ElementRaccourciable getElement() {
        return elementPointe;
    }

}
