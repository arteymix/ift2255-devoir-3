package navigateur.initial;

import java.util.Date;

/**
 *
 * @author guillaume
 */
public class Fichier extends Element {

    /**
     * Taille du fichier en octets.
     */
    private int taille;

    public Fichier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }

}
