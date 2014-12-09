package navigateur.raccourcis;

import java.util.Date;
import navigateur.initial.ElementVisitor;

/**
 * Raccourci qui pointe vers un ElementRaccourciable.
 *
 * Un raccourcis ne propage as le visiteur, sinon on peut former des cycles.
 * 
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier */
public class Raccourci extends Element {

    /**
     * Élément pointé par le raccourci.
     */
    private final ElementRaccourciable elementPointe;

    /**
     *
     * @param element
     * @param path
     * @param name
     * @param creation
     * @param lastModified
     */
    public Raccourci(ElementRaccourciable element, String path, String name, Date creation, Date lastModified) {
        super(path, name, creation, lastModified);
        this.elementPointe = element;
    }

    /**
     *
     * @return
     */
    public ElementRaccourciable getElement() {
        return elementPointe;
    }

    /**
     *
     * @param visitor
     */
    @Override
    public void accept(ElementVisitor visitor) {
        // un raccourcis ne propage pas le visiteur
    }

}
