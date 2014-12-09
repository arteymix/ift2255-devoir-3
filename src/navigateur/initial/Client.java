package navigateur.initial;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Client {

    /**
     * Exemple d'application du visiteur.
     *
     * Obtenir la taille du dossier actif.
     *
     * @return le nombre d'éléments contenu dans le dossier actif.
     */
    public int getTailleDossierActif() {

        final ElementTailleVisitor elementTailleVisitor = new ElementTailleVisitor();

        Navigateur.getInstance().getDossierActif().accept(elementTailleVisitor);

        return elementTailleVisitor.getVisites();
    }

}
