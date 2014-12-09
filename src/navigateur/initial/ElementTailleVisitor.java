package navigateur.initial;

/**
 * Visiteur pour la taille des éléments.
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class ElementTailleVisitor implements ElementVisitor {

    /**
     * Stocke le nombre de visites.
     */
    private int visites;

    @Override
    public void visit(Element e) {
        visites += 1;
    }

    public int getVisites() {
        return visites;
    }

}
