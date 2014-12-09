package navigateur.initial;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public abstract class ElementDecorateur extends Element {

    private final Element decoratedElement;

    /**
     *
     * @param e
     */
    public ElementDecorateur(Element e) {
        super(e.path, e.name, e.creation, e.lastModified);
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
