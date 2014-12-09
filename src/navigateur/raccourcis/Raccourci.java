package navigateur.raccourcis;

import java.util.Date;
import navigateur.initial.ElementVisitor;

/**
 * Raccourci qui pointe vers un ElementRaccourciable.
 *
 * Un raccourcis ne propage as le visiteur, sinon on peut former des cycles.
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
    public void accept(ElementVisitor visitor) {
        // un raccourcis ne propage pas le visiteur
    }

}
