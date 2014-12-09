package navigateur.raccourcis;

import java.util.Date;
import navigateur.initial.ElementVisitor;

/**
 * Fichier.
 *
 * @author Guillaume Poirier-Morency
 * @author Vincent Antaki
 * @author Émile Trottier */
public class Fichier extends ElementRaccourciable {

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
