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

    public Fichier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }

}
