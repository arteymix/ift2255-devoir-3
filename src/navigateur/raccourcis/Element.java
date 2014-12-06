package navigateur.raccourcis;

import java.util.Date;

/**
 * Élément abstrait qui peut soit être un ElementRaccourciable ou un Raccourci.
 * 
 * @author guillaume
 */
public abstract class Element extends navigateur.initial.Element {

    public Element(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

    @Override
    public int taille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
