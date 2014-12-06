package navigateur.raccourcis;

import java.util.Date;

/**
 * 
 * @author guillaume
 */
public class Fichier extends ElementRaccourciable {

    public Fichier(String name, Date creation, Date lastModified, String path) {
        super(name, creation, lastModified, path);
    }

    @Override
    public int taille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
