package navigateur.raccourcis;

import java.util.Date;
import navigateur.initial.Element;

/**
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

    @Override
    public int taille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
