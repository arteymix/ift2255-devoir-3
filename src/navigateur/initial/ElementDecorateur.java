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
    
    /**
     * Propage le visiteur à l'élément décoré
     * 
     * @param e 
     */
    @Override
    public void accept(ElementVisitor e) {
        this.decoratedElement.accept(e);
    }

}
