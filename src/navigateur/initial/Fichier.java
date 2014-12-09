package navigateur.initial;

import java.util.Date;

/**
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier
 */
public class Fichier extends Element {

    /**
     * Taille du fichier en octets.
     */
    private int taille;

    /**
     *
     * @param path
     * @param name
     * @param creation
     * @param lastModified
     */
    public Fichier(String path, String name, Date creation, Date lastModified) {
        super(path, name, creation, lastModified);
    }

    /**
     *
     * @param visitor
     */
    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }

}
