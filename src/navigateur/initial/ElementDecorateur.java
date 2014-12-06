package navigateur.initial;

/**
 *
 * @author owner
 */
public abstract class ElementDecorateur extends Element {

    private final Element decorated;

    public ElementDecorateur(Element e) {
        super(e.name, e.creation, e.lastModified, e.path);
        this.decorated = e;
    }

    @Override
    public int taille() {
        return decorated.taille();
    }

}
