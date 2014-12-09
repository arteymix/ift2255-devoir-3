package navigateur.initial;

/**
 *
 * @author guillaume
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

        elementTailleVisitor.visit(Navigateur.getInstance().getDossierActif());

        return elementTailleVisitor.getVisites();
    }

}
