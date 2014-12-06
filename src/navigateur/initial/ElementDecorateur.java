package navigateur.initial;

/**
 *
 * @author owner
 */
public abstract class ElementDecorateur extends Element {

    private final Element decoratedElement;

    public ElementDecorateur(Element e) {
        super(e.name, e.creation, e.lastModified, e.path);
        this.decoratedElement = e;
    }

    @Override
    public int taille() {
        return decoratedElement.taille();
    }

}
